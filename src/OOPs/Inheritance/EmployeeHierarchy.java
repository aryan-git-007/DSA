package OOPs.Inheritance;

// =============================================================
//  EMPLOYEE HIERARCHY - Java Implementation of UML Class Diagram
//  Inheritance Types Demonstrated:
//  1. Single Inheritance       → Employee → Developer
//  2. Multilevel Inheritance   → Employee → Executive → CEO
//                              → Employee → HRManager → HRDirector
//  3. Hierarchical Inheritance → Employee → (multiple subclasses)
//  4. Multiple Inheritance     → MarketingManager → BusinessDevelopmentManager
//                                (via Interface, since Java doesn't allow
//                                 multiple class inheritance)
//  5. Hybrid Inheritance       → SalesManager + MarketingManager
//                                → BusinessDevelopmentManager
// =============================================================


// =============================================================
// INTERFACES — used to simulate Multiple Inheritance in Java
// (Java does not support multiple class inheritance)
// =============================================================

interface Manageable {
    void manage();
}

interface Leadable {
    void lead();
}


// =============================================================
// LEVEL 1 — BASE CLASS (Parent / Superclass)
// All other classes inherit from Employee (Hierarchical Root)
// =============================================================

class Employee {

    // Protected fields — accessible in all subclasses
    protected String name;
    protected String employeeId;

    // Constructor
    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Base method — can be overridden by subclasses (Polymorphism)
    public void display() {
        System.out.println("Employee Name: " + name + " | ID: " + employeeId);
    }
}


// =============================================================
// LEVEL 2 — SINGLE / HIERARCHICAL INHERITANCE
// All classes below directly extend Employee
// This demonstrates HIERARCHICAL INHERITANCE (one parent, many children)
// =============================================================

// ── 1. SalesManager ──────────────────────────────────────────
// Single Inheritance: SalesManager extends Employee
class SalesManager extends Employee {

    public SalesManager(String name, String employeeId) {
        super(name, employeeId); // calls Employee constructor
    }

    // Own method
    public void boostSales() {
        System.out.println(name + " is boosting sales.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Role: Sales Manager");
    }
}

// ── 2. MarketingManager ──────────────────────────────────────
// Single Inheritance: MarketingManager extends Employee
class MarketingManager extends Employee {

    public MarketingManager(String name, String employeeId) {
        super(name, employeeId);
    }

    public void createMarketingStrategy() {
        System.out.println(name + " is creating a marketing strategy.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Role: Marketing Manager");
    }
}

// ── 3. Executive ─────────────────────────────────────────────
// Single Inheritance: Executive extends Employee
// Also serves as parent for CEO → Multilevel Inheritance
class Executive extends Employee {

    public Executive(String name, String employeeId) {
        super(name, employeeId);
    }

    public void makeExeDecision() {
        System.out.println(name + " is making an executive decision.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Role: Executive");
    }
}

// ── 4. Developer ─────────────────────────────────────────────
// Single Inheritance: Developer extends Employee
class Developer extends Employee {

    // Private field — encapsulation
    private String progLanguage;

    public Developer(String name, String employeeId, String progLanguage) {
        super(name, employeeId);
        this.progLanguage = progLanguage;
    }

    public void show() {
        System.out.println(name + " codes in: " + progLanguage);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Role: Developer | Language: " + progLanguage);
    }
}

// ── 5. HRManager ─────────────────────────────────────────────
// Single Inheritance: HRManager extends Employee
// Also serves as parent for HRDirector → Multilevel Inheritance
class HRManager extends Employee {

    public HRManager(String name, String employeeId) {
        super(name, employeeId);
    }

    public void handleHRDuties() {
        System.out.println(name + " is handling HR duties.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Role: HR Manager");
    }
}

// ── 6. TechLead ──────────────────────────────────────────────
// Single Inheritance: TechLead extends Employee
class TechLead extends Employee {

    public TechLead(String name, String employeeId) {
        super(name, employeeId);
    }

    public void displayInfo() {
        System.out.println(name + " is a Tech Lead.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Role: Tech Lead");
    }
}

// ── 7. ProjectManager ────────────────────────────────────────
// Single Inheritance: ProjectManager extends Employee
class ProjectManager extends Employee {

    protected String projectManaged;

    public ProjectManager(String name, String employeeId, String projectManaged) {
        super(name, employeeId);
        this.projectManaged = projectManaged;
    }

    public void manageProject() {
        System.out.println(name + " is managing project: " + projectManaged);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Role: Project Manager | Project: " + projectManaged);
    }
}

// ── 8. TeamLead ──────────────────────────────────────────────
// Single Inheritance: TeamLead extends Employee
class TeamLead extends Employee {

    protected int teamSize;

    public TeamLead(String name, String employeeId, int teamSize) {
        super(name, employeeId);
        this.teamSize = teamSize;
    }

    public void leadTeam() {
        System.out.println(name + " is leading a team of " + teamSize + " members.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Role: Team Lead | Team Size: " + teamSize);
    }
}


// =============================================================
// MULTILEVEL INHERITANCE
// Chain: Employee → Executive → CEO
//        Employee → HRManager → HRDirector
// =============================================================

// ── CEO (Level 3) ────────────────────────────────────────────
// Multilevel: CEO extends Executive, which extends Employee
// CEO inherits from Executive AND Employee (chain)
class CEO extends Executive {

    public CEO(String name, String employeeId) {
        super(name, employeeId); // calls Executive constructor → which calls Employee
    }

    public void leadCompany() {
        System.out.println(name + " is leading the entire company!");
    }

    @Override
    public void display() {
        super.display(); // prints Employee + Executive info
        System.out.println("Role: CEO");
    }
}

// ── HRDirector (Level 3) ─────────────────────────────────────
// Multilevel: HRDirector extends HRManager, which extends Employee
class HRDirector extends HRManager {

    public HRDirector(String name, String employeeId) {
        super(name, employeeId); // calls HRManager → Employee
    }

    public void manageHRDep() {
        System.out.println(name + " is managing the entire HR Department.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Role: HR Director");
    }
}


// =============================================================
// HYBRID / MULTIPLE INHERITANCE (via Interface)
// Java doesn't allow extending two classes, so we use interfaces.
// BusinessDevelopmentManager "inherits" behavior from both
// SalesManager and MarketingManager using interfaces.
// =============================================================

// BusinessDevelopmentManager uses interface-based multiple inheritance
// It extends MarketingManager (class) AND implements Manageable (interface)
// Simulating the "hybrid" branch visible in the UML diagram
class BusinessDevelopmentManager extends MarketingManager implements Manageable {

    public BusinessDevelopmentManager(String name, String employeeId) {
        super(name, employeeId);
    }

    public void coordinateBusinessDev() {
        System.out.println(name + " is coordinating business development.");
    }

    // Implementing the interface method
    @Override
    public void manage() {
        System.out.println(name + " is managing business operations.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Role: Business Development Manager");
    }
}


// =============================================================
// MAIN CLASS — Entry Point to test all inheritance types
// =============================================================

public class EmployeeHierarchy {

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println("  EMPLOYEE HIERARCHY — All Inheritance Types");
        System.out.println("=================================================\n");

        // ── SINGLE INHERITANCE ──────────────────────────────
        System.out.println(">>> SINGLE INHERITANCE: Employee → Developer");
        Developer dev = new Developer("Alice", "E001", "Java");
        dev.display();
        dev.show();

        System.out.println();

        // ── HIERARCHICAL INHERITANCE ────────────────────────
        System.out.println(">>> HIERARCHICAL INHERITANCE: Employee → SalesManager, MarketingManager, TechLead...");

        SalesManager sm = new SalesManager("Bob", "E002");
        sm.display();
        sm.boostSales();
        System.out.println();

        MarketingManager mm = new MarketingManager("Carol", "E003");
        mm.display();
        mm.createMarketingStrategy();
        System.out.println();

        TechLead tl = new TechLead("Dave", "E004");
        tl.display();
        tl.displayInfo();
        System.out.println();

        ProjectManager pm = new ProjectManager("Eve", "E005", "ERP System");
        pm.display();
        pm.manageProject();
        System.out.println();

        TeamLead teamL = new TeamLead("Frank", "E006", 8);
        teamL.display();
        teamL.leadTeam();
        System.out.println();

        // ── MULTILEVEL INHERITANCE ──────────────────────────
        System.out.println(">>> MULTILEVEL INHERITANCE: Employee → Executive → CEO");
        CEO ceo = new CEO("Grace", "E007");
        ceo.display();          // Calls CEO → Executive → Employee display chain
        ceo.makeExeDecision();  // Inherited from Executive
        ceo.leadCompany();      // Own method
        System.out.println();

        System.out.println(">>> MULTILEVEL INHERITANCE: Employee → HRManager → HRDirector");
        HRDirector hrd = new HRDirector("Henry", "E008");
        hrd.display();          // Calls HRDirector → HRManager → Employee chain
        hrd.handleHRDuties();   // Inherited from HRManager
        hrd.manageHRDep();      // Own method
        System.out.println();

        // ── MULTIPLE / HYBRID INHERITANCE (via Interface) ───
        System.out.println(">>> HYBRID INHERITANCE: Employee → MarketingManager → BusinessDevelopmentManager");
        System.out.println("    (+ implements Manageable interface = Multiple Inheritance simulation)");
        BusinessDevelopmentManager bdm = new BusinessDevelopmentManager("Ivy", "E009");
        bdm.display();
        bdm.createMarketingStrategy(); // Inherited from MarketingManager
        bdm.coordinateBusinessDev();   // Own method
        bdm.manage();                  // From Manageable interface
        System.out.println();

        // ── POLYMORPHISM using base class reference ─────────
        System.out.println(">>> POLYMORPHISM: Employee reference pointing to different subclass objects");
        Employee[] employees = {
                new Developer("J1", "D01", "Python"),
                new SalesManager("J2", "S01"),
                new CEO("J3", "C01"),
                new HRDirector("J4", "H01")
        };

        for (Employee e : employees) {
            e.display(); // Calls the overridden display() in each subclass
            System.out.println("---");
        }

        System.out.println("\n=== All Inheritance Types Demonstrated Successfully ===");
    }
}
