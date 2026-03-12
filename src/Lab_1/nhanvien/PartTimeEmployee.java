
package nhanvien;

 
public class PartTimeEmployee extends Employee{
    private int workingHours; //(>=0)
    private int hourlyRate; //(>=0)
    
    
    public PartTimeEmployee(int workingHours, int hourlyRate) {
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }


    public PartTimeEmployee(String id, String name, double basicSalary, int workingHours, int hourlyRate) {
        super(id, name, basicSalary);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }


    @Override
    public double inCome() {
        return this.workingHours * this.hourlyRate;
    }


    public int getWorkingHours() {
        return workingHours;
    }


    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }


    public int getHourlyRate() {
        return hourlyRate;
    }


    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    
}
