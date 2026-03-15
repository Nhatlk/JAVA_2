

package dto;

public class RequestDTOFullTime{
    private String id;
    private String name;
    private double basicSalary;
    private double bonus;
    private double penalty;


    public RequestDTOFullTime(String id, String name, double basicSalary, double bonus, double penalty) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.penalty = penalty;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
    public double getBonus() {
        return bonus;
    }
    public double getPenalty() {
        return penalty;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    
}