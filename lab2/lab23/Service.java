package lab23;
import lab23.model.Employee;

import java.util.HashMap;
import java.util.Map;

public class Service {
private Map<String, Employee> mapEmployee = new HashMap<>();

    public void addEmployee(Employee emp) {
        mapEmployee.put(emp.getId(), emp);
    }

    public void showAll() {
        if (mapEmployee.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (Employee emp : mapEmployee.values()) {
            System.out.println(emp);
        }
    }

    public Employee findById(String id) {
        return mapEmployee.get(id); 
    }

    public boolean updateSalary(String id, double newSalary) {
        Employee emp = findById(id);
        if (emp != null) {
            emp.setSalary(newSalary);
            return true;
        }
        return false;
    }
}


