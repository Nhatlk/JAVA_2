package repository;

import java.util.ArrayList;
import modelEmployee.Employee;
import modelEmployee.FullTime;
import modelEmployee.PartTime;


public class  EmployeeRepository{
    //đến lưu trữ và truy xuất dữ liệu (như thêm/xóa/sửa vào danh sách hoặc đọc/ghi file)
    //LapTopService.java: Lớp dịch vụ. Chứa các logic xử lý nghiệp vụ (như tính toán, tìm kiếm, sắp xếp danh sách Laptop).

    private ArrayList<Employee> listEm = new ArrayList<>();
    
    public EmployeeRepository(){
        listEm.add(new FullTime("PS1","name1",1000000,500,0));
        listEm.add(new FullTime("PS2","name2",2000000,500,0));
        listEm.add(new FullTime("PS3","name3",3000000,500,0));
       
        listEm.add(new PartTime("PS4", "name4",500, 8, 30));
        listEm.add(new PartTime("PS5", "name4",500, 4, 30));
    }



    public void add(Employee  em){
        listEm.add(em);
    }

    // [Phạm vi truy cập] [KIỂU TRẢ VỀ] [Tên hàm]() { ... }
    public ArrayList<Employee> findAll(){
        return listEm;
    }


    public Employee findID(String id){
        // use flag cx dc
        for(Employee x : listEm){
            if(x.getId().equalsIgnoreCase(id)){
                return x;
            }
        }
        return null;
    }


   
}
