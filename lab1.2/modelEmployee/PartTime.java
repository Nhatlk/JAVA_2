package modelEmployee;

 
public class PartTime extends Employee{
    private double workingHours; //(>=0)
    private double hourlyRate; //(>=0)
    
    
    public PartTime(int workingHours, int hourlyRate) {
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }


    public PartTime(String id, String name, double basicSalary, double workingHours2, double hourlyRate2) {
        super(id, name, basicSalary);
        this.workingHours = workingHours2;
        this.hourlyRate = hourlyRate2;
    }


    @Override
    public double inCome() {
        return this.workingHours * this.hourlyRate;
    }


    public double getWorkingHours() {
        return workingHours;
    }


    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }


    public double getHourlyRate() {
        return hourlyRate;
    }


    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


      @Override
    public void xuat() {
        System.out.printf("ID: %s | Name: %s |Lương cơ bản: %.1f |bonus: %.1f |penalty: %.1f"
        , super.getId(), super.getName(), super.getBasicSalary(), this.workingHours, this.hourlyRate);




    }
    
    
}
