package dto;

public class RquestDTOPartTime {
    private String id;
    private String name;
    private double basicSalary;
    private double workingHours; //(>=0)
    private double hourlyRate;

    public RquestDTOPartTime(String id, String name, double basicSalary, double workingHours, double hourlyRate) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public double getWorkingHours() {
        return workingHours;
    }
    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }






}
