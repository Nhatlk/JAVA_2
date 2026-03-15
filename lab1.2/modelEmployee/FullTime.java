package modelEmployee;



public class FullTime extends Employee {
    private double bonus;
    private double penalty;

    public FullTime() {
    }

    public FullTime(String id, String name, double basicSalary, double bonus, double penalty) {
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

    @Override
    public void xuat() {
        System.out.printf("ID: %s | Name: %s |Lương cơ bản: %.1f |bonus: %.1f |penalty: %.1f"
        , super.getId(), super.getName(), super.getBasicSalary(), this.bonus, this.penalty);




    }

}
