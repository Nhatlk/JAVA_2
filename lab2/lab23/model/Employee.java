package lab23.model;

public class Employee {
  private String id;
    private String name;
    private double salary;

    public Employee() {}

    public Employee(String id, String name, double salary) {
        // Gọi setter thay vì gán trực tiếp để tận dụng logic validate
        setId(id);
        setName(name);
        setSalary(salary);
    }

    public String getId() { return id; }
    
    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID không được để trống!");
        }
        this.id = id;
    }

    public String getName() { return name; }
    
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên không được để trống!");
        }
        this.name = name;
    }

    public double getSalary() { return salary; }
    
    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Lương không được là số âm!");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("ID: %-5s | Name: %-20s | Salary: %,.2f", id, name, salary);
    }
}
