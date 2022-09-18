package ex6;

public class CBGV extends Nguoi {
    protected int salary, bonus, deduction, income;

    public CBGV(String name, int age, String hometown, int ID, int salary, int bonus, int deduction, int income) {
        super(name, age, hometown, ID);
        this.salary = salary;
        this.bonus = bonus;
        this.deduction = deduction;
        this.income = income;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getDeduction() {
        return deduction;
    }

    public void setDeduction(int deduction) {
        this.deduction = deduction;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Age: " + age +
                ", Hometown: " + hometown +
                ", ID: " + ID +
                ", Salary: " + salary +
                ", Bonus: " + bonus +
                ", Deduction: " + deduction +
                ", Income: " + income;
    }
}
