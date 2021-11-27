package seven.human;

import seven.Gender;

public class Employe extends Person {

    protected double salaryAmount;

    public Employe(){
        super();

        System.out.println("Employee...");
    }

    public double getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
}
