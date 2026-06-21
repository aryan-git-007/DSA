package OOPs.Questions.Ques4;

interface Payable {
    double calculatePay(); // capital P
}

class FullTimeEmployee implements Payable {
    public int monthlySalary;

    public FullTimeEmployee(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() { // ❌ you had void, must match interface
        return monthlySalary * 12;
    }
}

class FreelanceEmployee implements Payable {
    public int ratePerHour;
    public int hoursWorked;

    public FreelanceEmployee(int ratePerHour, int hoursWorked) { // ❌ you had wrong name + void
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() { // ❌ you had void, must match interface
        return ratePerHour * hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        Payable p1 = new FullTimeEmployee(50000);
        Payable p2 = new FreelanceEmployee(500, 160);
        System.out.println("Full Time Employee Annual Pay: " + p1.calculatePay());
        System.out.println("Freelance Employee Pay: " + p2.calculatePay());
    }
}