package Strings;

public class ComparingString {
    public static void main(String[] args) {
        String name_1=new String("Aryan");
        String name_2=new String("ArYan");

        if(name_1.equals(name_2)){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Not Equal");
        }

        if(name_1.equalsIgnoreCase(name_2)){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Not Equal");
        }

        String name="Aryan,Sahu,Bca   , Hello World";
        String[] split_words=name.split(",");
        for(String words:split_words){
            System.out.println(words);
        }

    }
}
