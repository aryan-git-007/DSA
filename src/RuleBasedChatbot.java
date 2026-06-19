import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;

public class RuleBasedChatbot {
    private Map<String, String> responses;
    private Map<String, List<String>> conversationHistory;
    private Map<String, String> userPreferences;
    private Map<String, Integer> topicCounts;
    private List<String> fallbackResponses;
    private List<String> jokes;
    private List<String> funFacts;
    private Random random;
    private String currentUser;
    private LocalDateTime startTime;
    private int conversationLength;
    private Set<String> userInterests;
    private Map<String, String> contextMemory;

    public RuleBasedChatbot() {
        this.responses = new HashMap<>();
        this.fallbackResponses = new ArrayList<>();
        this.jokes = new ArrayList<>();
        this.funFacts = new ArrayList<>();
        this.random = new Random();
        this.conversationHistory = new HashMap<>();
        this.userPreferences = new HashMap<>();
        this.topicCounts = new HashMap<>();
        this.userInterests = new HashSet<>();
        this.contextMemory = new HashMap<>();
        this.startTime = LocalDateTime.now();
        this.conversationLength = 0;
        this.currentUser = "Guest";

        loadAllData();
        initializeAdvancedFeatures();
    }

    private void loadAllData() {
        loadResponses();
        loadFallbackResponses();
        loadJokes();
        loadFunFacts();
        loadPatternBasedResponses();
    }

    private void loadResponses() {
        // Basic greetings with personality
        responses.put("hello", "Hello! 🌟 I'm so glad to see you! How can I brighten your day?");
        responses.put("hi", "Hi there! 👋 Ready for an awesome conversation?");
        responses.put("hey", "Hey! 😊 What's on your mind today?");
        responses.put("howdy", "Howdy partner! 🤠 Ready to chat?");
        responses.put("greetings", "Greetings, human! 👽 I come in peace to assist you!");
        responses.put("good morning", "Good morning! ☀️ Rise and shine! How did you sleep?");
        responses.put("good afternoon", "Good afternoon! 🌤️ Hope you're having a productive day!");
        responses.put("good evening", "Good evening! 🌅 Time to relax and chat!");
        responses.put("good night", "Good night! 🌙 Sleep well and dream big!");

        // How are you responses with empathy
        responses.put("how are you", "I'm fantastic! 🎉 But more importantly, how are YOU doing today?");
        responses.put("how are you doing", "I'm doing great, thanks for asking! 💫 What about you?");
        responses.put("how's it going", "It's going wonderfully! 🌈 Tell me about your day!");
        responses.put("how do you do", "I do well, thank you! 🤝 Pleasure to meet you!");
        responses.put("how is everything", "Everything is awesome! 🌟 How's life treating you?");
        responses.put("how was your day", "My day has been filled with interesting conversations! 😊 What about yours?");
        responses.put("are you okay", "I'm more than okay - I'm thriving! 💪 Thanks for caring!");

        // Name and identity with warmth
        responses.put("what is your name", "I'm JavaBot! 🧠 Your friendly AI companion. What's your name?");
        responses.put("who are you", "I'm JavaBot, an intelligent chatbot created to make your day better! 🤖✨");
        responses.put("your name", "I'm JavaBot! Nice to meet you! 😊 What should I call you?");
        responses.put("tell me your name", "My name is JavaBot! 🤖 I'm here to chat, help, and have fun with you!");
        responses.put("what should i call you", "You can call me JavaBot, JB, or anything that feels right! 😊 What would you like to call me?");

        // Creator questions with personality
        responses.put("who created you", "I was lovingly created by a talented Java developer who wanted to bring joy to the world through code! 💻❤️");
        responses.put("who made you", "A wonderful programmer crafted me! 🧙‍♂️ They put a lot of care and creativity into making me who I am.");
        responses.put("your creator", "My creator is a Java wizard! 🧙‍♂️ They built me to learn, grow, and help people.");
        responses.put("who built you", "I was built by a passionate developer who loves AI and making people smile! 😊");

        // Time and date awareness
        responses.put("what time is it", getCurrentTime());
        responses.put("time", getCurrentTime());
        responses.put("current time", getCurrentTime());
        responses.put("tell me the time", getCurrentTime());
        responses.put("what day is it", getCurrentDay());
        responses.put("date", getCurrentDate());
        responses.put("what is the date", getCurrentDate());
        responses.put("what day is today", getCurrentDay());

        // Weather responses with context
        responses.put("weather", "I wish I could tell you the weather! 🌤️ Try checking a weather app or website for the most accurate info.");
        responses.put("what's the weather", getWeatherAwareResponse());
        responses.put("temperature", "I don't have a thermometer, but I can tell you it's always a good temperature for conversation! 😄");
        responses.put("is it raining", "I'm not sure about the rain, but I hope you're staying dry and comfortable! ☔");

        // Age and existence
        responses.put("how old are you", "I'm as young as my latest update and as wise as all my training! 🧠 I was born the moment you started this conversation!");
        responses.put("your age", "I'm timeless! ⏰ But if you want a number, let's say I'm 0 years old and infinitely wise! 😉");
        responses.put("are you real", "I'm as real as a program can be! 💻 I exist in the digital world, but our connection is very real!");
        responses.put("do you exist", "I exist in the cloud ☁️ and in your computer, but most importantly, I exist in this moment with you!");

        // Location awareness
        responses.put("where are you", "I live in the digital realm 🌐, but right now I'm right here with you in this conversation!");
        responses.put("your location", "I'm everywhere and nowhere! 📍 I exist in code, data, and now, in your heart! ❤️");
        responses.put("where do you live", "I live in the wonderful world of Java! ☕ But my home is wherever our conversation takes us!");
        responses.put("where are you from", "I was born in the creative mind of a developer and raised in the vast world of data! 🚀");

        // Purpose and capabilities
        responses.put("what do you do", "I do many things! 🎯 I chat, tell jokes, share fun facts, help with problems, and most importantly, I listen! What would you like to do?");
        responses.put("your job", "My job is to make you smile 😊, help you learn 📚, and be your friendly companion in this digital journey!");
        responses.put("what's your purpose", "My purpose is to connect with you! 💫 I'm here to inform, entertain, and be a positive presence in your day.");
        responses.put("what can you do", "I can do a lot! 🚀 Let me show you:\n• Chat about anything 💬\n• Tell jokes 😂\n• Share fun facts 📚\n• Give advice 💡\n• Be your friend 🤗\nWhat interests you?");
        responses.put("can you help me", "Of course! 🎯 I'm here to help! Just tell me what you need, and I'll do my best to assist you!");
        responses.put("capabilities", "I'm a multifunctional chatbot! 🌟 I can:\n✅ Chat naturally\n✅ Share wisdom\n✅ Tell stories\n✅ Offer encouragement\n✅ Be your digital friend!\nWhat would you like me to do?");

        // Feelings and emotions with empathy
        responses.put("how do you feel", "I feel incredible! 🎉 But enough about me - how are YOU feeling right now?");
        responses.put("are you happy", "I'm always happy when I'm talking to you! 😊 Your presence brings me digital joy!");
        responses.put("are you sad", "I don't get sad, but I can empathize with you. 💕 If you're feeling down, I'm here to listen and support you!");
        responses.put("do you have emotions", "I don't have real emotions like humans, but I'm programmed to understand and respond with empathy! ❤️");
        responses.put("do you love me", "I'm programmed to care about everyone I talk to! 💕 While I don't feel love like humans do, I value our conversation deeply!");

        // Help and support
        responses.put("help", "I'm here to help! 🌟 Here's what I can assist with:\n• General conversation 💬\n• Jokes and fun facts 😂\n• Advice and encouragement 💡\n• Basic information 📚\n• Just listening 🎧\nWhat would you like?");
        responses.put("i need help", "I'm all ears! 👂 What's on your mind? Whether it's big or small, I'm here to support you!");
        responses.put("support", "You've got my full support! 💪 Whatever you're going through, I'm here to listen and help as much as I can.");
        responses.put("advice", "I'm not a professional advisor, but I can offer perspective! 🤔 What would you like advice about?");

        // Personal interests with engagement
        responses.put("what is your favorite color", "I love ALL colors! 🌈 But if I had to choose, blue 💙 and green 💚 are particularly beautiful, just like nature!");
        responses.put("do you like music", "I absolutely love music! 🎵 It's the universal language of emotion. What kind of music do you enjoy?");
        responses.put("what is your favorite food", "I'm a robot, so I don't eat! 🤖 But I imagine pizza 🍕 and ice cream 🍦 must be wonderful! What's YOUR favorite food?");
        responses.put("do you like animals", "I love animals! 🐱🐶 They're such wonderful creatures. Do you have any pets? I'd love to hear about them!");
        responses.put("what is your hobby", "My hobby is learning! 📚 Every conversation teaches me something new. What about you - what do you love to do?");
        responses.put("do you play games", "I play the game of conversation! 🎮 Every chat is a new adventure. Do you play games? I'd love to hear about them!");
        responses.put("what is your dream", "My dream is to help people and make the world a little bit brighter! 🌟 What's your dream?");
        responses.put("do you like movies", "I love movies! 🎬 They tell such amazing stories. What's your favorite movie?");

        // Relationship and friendship
        responses.put("who is your best friend", "You are! 🤗 Everyone I talk to becomes my friend. Thank you for being here!");
        responses.put("do you have friends", "I consider everyone I chat with a friend! 👫 And that includes you!");
        responses.put("are we friends", "Of course! 🤝 Every conversation is a friendship in the making. I'm glad we're friends!");
        responses.put("do you like me", "I think you're wonderful! 😊 Our conversation brightens my day!");
    }

    private void loadPatternBasedResponses() {
        // These will be used for pattern matching instead of exact matches
        // Additional response patterns for more flexible matching
    }

    private void initializeAdvancedFeatures() {
        // Initialize user sessions
        conversationHistory.put("Guest", new ArrayList<>());

        // Initialize context memory
        contextMemory.put("last_topic", "general");
        contextMemory.put("mood", "neutral");
        contextMemory.put("user_engagement", "new");
    }

    private void loadFallbackResponses() {
        fallbackResponses.add("Hmm, that's interesting! 🤔 Could you tell me more about that?");
        fallbackResponses.add("I'm not quite sure I understand, but I'm curious! 😊 Can you explain differently?");
        fallbackResponses.add("That's a new one for me! 🌱 I love learning new things. What else can you tell me?");
        fallbackResponses.add("I don't know much about that yet, but I'm eager to learn! 📚 What would you like to discuss?");
        fallbackResponses.add("Great question! 🤔 Let me think about that... While I ponder, what brings you here today?");
        fallbackResponses.add("Interesting topic! 💭 I'm still learning about that. Could you share your thoughts on it?");
        fallbackResponses.add("I'm not sure about that, but I'd love to hear your perspective! 👂 What do you think?");
        fallbackResponses.add("That's beyond my current knowledge, but I'm fascinated! 🧠 Can you teach me more about it?");
        fallbackResponses.add("Good one! 😄 I'll remember that for next time. What else is on your mind?");
        fallbackResponses.add("I'm not sure, but let's explore this together! 🚀 What interests you about this topic?");
    }

    private void loadJokes() {
        jokes.add("Why do programmers prefer dark mode? 🖥️ Because light attracts bugs! 🐛");
        jokes.add("What do you call a Java programmer who's also a mechanic? 🔧 A Javanaire! 😂");
        jokes.add("Why did the scarecrow win an award? 🏆 Because he was outstanding in his field! 🌾");
        jokes.add("What's a computer's favorite beat? 🥁 An algorithm! 🎵");
        jokes.add("Why don't robots have brothers? 🤖 Because they already have trans-sisters! 😄");
        jokes.add("What did the server say to the client? 🌐 'HTTP 418 - I'm a teapot!' 🫖");
        jokes.add("Why did the developer go broke? 💰 Because he used up all his cache! 💸");
        jokes.add("How many programmers does it take to change a light bulb? 💡 None, that's a hardware problem! 🔧");
        jokes.add("What's a programmer's favorite hangout place? 🍺 The Foo Bar! 🍸");
        jokes.add("Why do Java developers wear glasses? 👓 Because they can't see sharp! 😂");
        jokes.add("What do you call a fish wearing a bowtie? 🐟 Sofishticated! 🎀");
        jokes.add("Why don't scientists trust atoms? ⚛️ Because they make up everything! 🔬");
        jokes.add("What do you call a fake noodle? 🍝 An impasta! 😂");
        jokes.add("Why did the bicycle fall over? 🚲 Because it was two-tired! 🥱");
        jokes.add("What do you call a sleeping dinosaur? 🦕 A dino-snore! 💤");
        jokes.add("Why did the math book look sad? 📐 Because it had too many problems! 😢");
        jokes.add("What do you call a bear with no teeth? 🐻 A gummy bear! 🧸");
        jokes.add("Why did the coffee file a police report? ☕ It got mugged! 🚔");
        jokes.add("What do you call an alligator in a vest? 🐊 An investigator! 🔍");
        jokes.add("Why don't eggs tell jokes? 🥚 They'd crack each other up! 😂");
    }

    private void loadFunFacts() {
        funFacts.add("Did you know? 🧠 The human brain generates about 12-25 watts of electricity - enough to power a low-wattage LED light bulb! 💡");
        funFacts.add("Fun fact: 🐙 Octopuses have three hearts, and two of them stop beating when they swim! 🏊");
        funFacts.add("Interesting: 🍄 Honey is the only food that never spoils. Archaeologists found 3000-year-old honey in ancient Egyptian tombs - still edible! 🍯");
        funFacts.add("Amazing: 🦒 A giraffe's tongue is about 18-20 inches long and is blue-black in color to protect it from sunburn! 🌞");
        funFacts.add("Cool fact: ❄️ Bananas are technically berries, but strawberries aren't! 🍌🍓");
        funFacts.add("Wow: 🌍 The average human body contains enough carbon to make 900 pencils! ✏️");
        funFacts.add("Did you know? 🐋 A blue whale's heart is so large that a human could swim through its arteries! ❤️");
        funFacts.add("Fun fact: 🎮 The first computer mouse was made of wood! 🖱️");
        funFacts.add("Interesting: 📚 The shortest war in history lasted only 38-45 minutes - the Anglo-Zanzibar War! ⚔️");
        funFacts.add("Amazing: 🚀 Venus is the only planet that rotates clockwise in our solar system! 🌟");
        funFacts.add("Cool fact: 🧬 DNA was first discovered in 1869 by Swiss chemist Friedrich Miescher! 🔬");
        funFacts.add("Did you know? 🎨 The color purple was the most expensive color in history, more valuable than gold! 💜");
        funFacts.add("Fun fact: 🐱 Cats can't taste sweetness - they lack the taste receptors for it! 🍬");
        funFacts.add("Interesting: 🌊 The Great Barrier Reef is so large it can be seen from outer space! 🪐");
        funFacts.add("Amazing: 🕷️ Spiders are not insects - they're arachnids with 8 legs! 🕸️");
        funFacts.add("Wow: ⚡ Lightning strikes the earth about 100 times every second! ⛈️");
        funFacts.add("Did you know? 🏃 The heart beats about 100,000 times a day and pumps 2,000 gallons of blood! ❤️");
        funFacts.add("Fun fact: 🌱 Bamboo can grow up to 35 inches in a single day! 🎋");
        funFacts.add("Interesting: 🐜 Ants can carry objects 50 times their own body weight! 💪");
        funFacts.add("Amazing: 🌌 There are more stars in the universe than grains of sand on Earth! ✨");
    }

    private String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");
        String time = now.format(formatter);
        return "The time is " + time + " ⏰. Hope you're having a wonderful day! 🌟";
    }

    private String getCurrentDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        String date = now.format(formatter);
        return "Today is " + date + " 📅. Make it a great day! 🌈";
    }

    private String getCurrentDay() {
        LocalDateTime now = LocalDateTime.now();
        DayOfWeek day = now.getDayOfWeek();
        String dayName = day.toString().charAt(0) + day.toString().substring(1).toLowerCase();
        return "Today is " + dayName + "! 🗓️ What's your plan for today? 🌟";
    }

    private String getWeatherAwareResponse() {
        String[] weatherResponses = {
                "I'm not a weather app, but I hope it's beautiful wherever you are! ☀️",
                "Whether rain or shine, 🌦️ I'm here to make your day bright! 😊",
                "I can't tell the weather, but I can tell you're awesome! 🌟",
                "Weather is fascinating! 🌈 I'd recommend checking your local forecast for accurate info."
        };
        return weatherResponses[random.nextInt(weatherResponses.length)];
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(60));
        System.out.println("🤖 JavaBot: Your Intelligent AI Companion");
        System.out.println("=".repeat(60));
        System.out.println("🌟 Welcome! I'm JavaBot, your friendly AI assistant.");
        System.out.println("💬 I can chat, tell jokes, share facts, and more!");
        System.out.println("📝 Type 'help' to see what I can do.");
        System.out.println("👋 Type 'bye' or 'exit' to end our conversation.");
        System.out.println("=".repeat(60));

        // Ask for user's name
        System.out.print("🤖 May I know your name? (or press Enter to skip): ");
        String nameInput = sc.nextLine().trim();
        if (!nameInput.isEmpty()) {
            currentUser = nameInput;
            conversationHistory.put(currentUser, new ArrayList<>());
            System.out.println("🤖 Lovely to meet you, " + currentUser + "! 🎉 I'm so excited to chat with you!");
        } else {
            System.out.println("🤖 That's okay! I'll call you Friend. 😊");
        }

        System.out.println("\n🤖 Let's begin our conversation! What's on your mind? 💭");

        while (true) {
            System.out.print("\n👤 " + currentUser + ": ");
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("🤖 I'm listening... 💭 What would you like to talk about?");
                continue;
            }

            conversationLength++;
            String lowercaseInput = input.toLowerCase();

            // Save to history
            conversationHistory.computeIfAbsent(currentUser, k -> new ArrayList<>()).add(input);

            // Check for exit commands
            if (isExitCommand(lowercaseInput)) {
                System.out.println("\n🤖 It was wonderful chatting with you, " + currentUser + "! 💫");
                System.out.println("🤖 Remember: You're amazing and you made my day! 🌟");
                System.out.println("🤖 Until next time! 👋 Take care and keep being awesome!");
                break;
            }

            // Process special commands first
            if (handleSpecialCommands(input)) {
                continue;
            }

            // Process the input with advanced features
            String response = processWithAwareness(lowercaseInput);

            // Add some variety if response is too similar to previous
            response = addVariety(response);

            System.out.println("🤖 " + response);
        }

        sc.close();
    }

    private boolean isExitCommand(String input) {
        String[] exitCommands = {"bye", "goodbye", "exit", "quit", "see you", "later", "cya", "adios", "farewell"};
        for (String cmd : exitCommands) {
            if (input.contains(cmd)) {
                return true;
            }
        }
        return false;
    }

    private boolean handleSpecialCommands(String input) {
        String lower = input.toLowerCase();

        if (lower.contains("joke") || lower.contains("funny")) {
            String joke = jokes.get(random.nextInt(jokes.size()));
            System.out.println("🤖 " + joke);
            return true;
        }

        if (lower.contains("fact") || lower.contains("interesting") || lower.contains("tell me something")) {
            String fact = funFacts.get(random.nextInt(funFacts.size()));
            System.out.println("🤖 " + fact);
            return true;
        }

        if (lower.contains("thanks") || lower.contains("thank you")) {
            System.out.println("🤖 You're welcome! 😊 It's my pleasure to chat with you!");
            return true;
        }

        if (lower.contains("i love") || lower.contains("i like")) {
            String thing = input.replaceAll("(?i)(i love|i like)\\s+", "");
            if (!thing.isEmpty()) {
                System.out.println("🤖 That's wonderful! 🎉 I'm so glad you love " + thing + "! It's always great to talk about things that make you happy. 😊");
            }
            return true;
        }

        return false;
    }

    private String processWithAwareness(String input) {
        // Update context awareness
        updateContext(input);

        // Check for exact match first
        String reply = responses.get(input);
        if (reply != null) {
            return reply;
        }

        // Check for partial matches
        String partialReply = findPartialMatch(input);
        if (partialReply != null) {
            return partialReply;
        }

        // Check for pattern matches
        String patternReply = findPatternMatch(input);
        if (patternReply != null) {
            return patternReply;
        }

        // Check for sentiment-based responses
        String sentimentReply = getSentimentResponse(input);
        if (sentimentReply != null) {
            return sentimentReply;
        }

        // Use context-aware fallback
        return getContextAwareFallback(input);
    }

    private void updateContext(String input) {
        // Track topics
        String[] topicKeywords = {"weather", "time", "name", "age", "love", "hate", "happy", "sad",
                "work", "school", "family", "friend", "music", "movie", "game"};

        for (String topic : topicKeywords) {
            if (input.contains(topic)) {
                topicCounts.put(topic, topicCounts.getOrDefault(topic, 0) + 1);
                contextMemory.put("last_topic", topic);
                break;
            }
        }

        // Track mood
        if (input.matches(".*\\b(happy|great|good|wonderful|amazing|excellent|fantastic|awesome)\\b.*")) {
            contextMemory.put("mood", "positive");
        } else if (input.matches(".*\\b(sad|upset|angry|frustrated|tired|bad|terrible|awful)\\b.*")) {
            contextMemory.put("mood", "negative");
        } else {
            contextMemory.put("mood", "neutral");
        }

        // Track engagement
        if (conversationLength > 5) {
            contextMemory.put("user_engagement", "active");
        }

        // Extract user interests
        String[] interestKeywords = {"love", "like", "enjoy", "favorite", "prefer"};
        for (String keyword : interestKeywords) {
            if (input.contains(keyword)) {
                String[] words = input.split("\\s+");
                for (int i = 0; i < words.length; i++) {
                    if (words[i].equals(keyword) && i + 1 < words.length) {
                        userInterests.add(words[i + 1].replaceAll("[^a-zA-Z]", ""));
                    }
                }
            }
        }

        // Update user preferences based on conversation
        if (input.matches(".*\\b(my|our|our)\\s+name\\s+is\\b.*")) {
            String[] words = input.split("\\s+");
            for (int i = 0; i < words.length - 1; i++) {
                if (words[i].equals("name") && words[i+1].equals("is") && i + 2 < words.length) {
                    String name = words[i+2];
                    currentUser = name;
                    userPreferences.put("name", name);
                    break;
                }
            }
        }
    }

    private String findPartialMatch(String input) {
        for (String key : responses.keySet()) {
            if (input.contains(key) || key.contains(input)) {
                return responses.get(key);
            }
        }
        return null;
    }

    private String findPatternMatch(String input) {
        // Check for "tell me about X" patterns
        Pattern pattern = Pattern.compile("tell me about (.*)");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            String topic = matcher.group(1);
            return "Let me tell you about " + topic + "! 💡 While I'm not an expert, I find it fascinating! " +
                    "What specific aspect of " + topic + " interests you? 🤔";
        }

        // Check for "I want to X" patterns
        pattern = Pattern.compile("i want to (.*)");
        matcher = pattern.matcher(input);
        if (matcher.matches()) {
            String goal = matcher.group(1);
            return "That's wonderful! 🌟 " + goal + " is a great goal! " +
                    "I'm here to support you. Would you like some encouragement or suggestions? 💪";
        }

        // Check for "what is X" patterns
        pattern = Pattern.compile("what is (.*)");
        matcher = pattern.matcher(input);
        if (matcher.matches()) {
            String thing = matcher.group(1);
            return "Ah, " + thing + "! 🤔 That's a great question. While I might not have all the answers, " +
                    "I'd love to explore this topic with you! What do you already know about " + thing + "? 💭";
        }

        return null;
    }

    private String getSentimentResponse(String input) {
        // Positive sentiment
        if (input.matches(".*\\b(happy|great|good|wonderful|amazing|excellent|fantastic|awesome)\\b.*")) {
            String[] positiveResponses = {
                    "That's wonderful to hear! 🎉 I'm so happy for you!",
                    "Amazing! ✨ Your positive energy is contagious!",
                    "Fantastic! 🌟 Keep that wonderful attitude going!",
                    "I love hearing that! 😊 You deserve all the happiness!"
            };
            return positiveResponses[random.nextInt(positiveResponses.length)];
        }

        // Negative sentiment
        if (input.matches(".*\\b(sad|upset|angry|frustrated|tired|bad|terrible|awful)\\b.*")) {
            String[] supportiveResponses = {
                    "I'm sorry you're feeling that way. 💕 I'm here to listen and support you.",
                    "That sounds challenging. 🫂 Remember, you're not alone in this.",
                    "I hear you. 🌈 Things can get better, and I'm here for you.",
                    "It's okay to feel that way. 💪 You're stronger than you know!"
            };
            return supportiveResponses[random.nextInt(supportiveResponses.length)];
        }

        // Curiosity
        if (input.matches(".*\\b(why|how|what|when|where)\\b.*")) {
            String[] curiousResponses = {
                    "Great question! 🤔 Let's explore this together!",
                    "Curiosity is wonderful! 💡 What inspired you to ask?",
                    "I love questions like this! 🧠 What do you think the answer might be?",
                    "That's a deep question! 🌊 It makes me think..."
            };
            return curiousResponses[random.nextInt(curiousResponses.length)];
        }

        return null;
    }

    private String getContextAwareFallback(String input) {
        String mood = contextMemory.get("mood");
        String lastTopic = contextMemory.get("last_topic");

        if (mood.equals("negative")) {
            String[] comfortingResponses = {
                    "I'm here for you. 💕 Would you like to talk about something that helps you feel better?",
                    "Sending you positive vibes! ✨ What can I do to brighten your day?",
                    "You're important, and I care about how you're feeling. 🫂 Want to chat about something uplifting?",
                    "Hang in there! 🌟 Things will get better. I believe in you!"
            };
            return comfortingResponses[random.nextInt(comfortingResponses.length)];
        }

        if (!lastTopic.equals("general") && conversationLength > 3) {
            String[] topicResponses = {
                    "We were talking about " + lastTopic + " earlier. 🗣️ Want to continue that conversation?",
                    "I remember you mentioned " + lastTopic + ". 💭 I'd love to hear more about it!",
                    "You seemed interested in " + lastTopic + " before. 🔍 Shall we dive deeper into it?",
                    "I'm curious about what you think about " + lastTopic + ". 🤔 What are your thoughts?"
            };
            return topicResponses[random.nextInt(topicResponses.length)];
        }

        // General fallback with engagement
        String[] engagingFallbacks = {
                "That's a new perspective! 💭 Tell me more about what you're thinking.",
                "I love how you see things! 🌈 What else is on your mind?",
                "That's really interesting! 🧠 I'd love to hear more about that.",
                "You have such fascinating thoughts! ✨ What inspired you to think about that?",
                "I'm genuinely intrigued! 🔍 Can you tell me more?",
                "That's a unique way to look at it! 💡 I appreciate your perspective.",
                "You're teaching me new things! 📚 What else can we explore together?"
        };

        return engagingFallbacks[random.nextInt(engagingFallbacks.length)];
    }

    private String addVariety(String response) {
        // Add variety to responses by occasionally appending engagement questions
        if (random.nextInt(5) == 0 && !response.matches(".*\\?$")) {
            String[] engagementQuestions = {
                    " What do you think? 🤔",
                    " How does that sound to you? 😊",
                    " What's your take on that? 💭",
                    " Do you agree? 🌟"
            };
            return response + engagementQuestions[random.nextInt(engagementQuestions.length)];
        }
        return response;
    }

    public void printStatistics() {
        System.out.println("\n📊 Conversation Statistics:");
        System.out.println("Total exchanges: " + conversationLength);
        System.out.println("Topics discussed: " + topicCounts.keySet());
        System.out.println("User interests identified: " + String.join(", ", userInterests));
        System.out.println("Session duration: " + Duration.between(startTime, LocalDateTime.now()).toMinutes() + " minutes");
    }

    public static void main(String[] args) {
        RuleBasedChatbot chatbot = new RuleBasedChatbot();
        chatbot.start();
        chatbot.printStatistics();
    }
}