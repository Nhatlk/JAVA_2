
package nhanvien;

public class FullTimeEmployee extends Employee {
    private double bonus;
    private double penalty;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String id, String name, double basicSalary, double bonus, double penalty) {
        super(id, name, basicSalary);
        this.bonus = bonus;
        this.penalty = penalty;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    @Override
    public double inCome() {
        return super.getBasicSalary() + this.bonus - this.penalty;
    }

    public double getBonus() {
        return bonus;
    }

    public double getPenalty() {
        return penalty;
    }

}
