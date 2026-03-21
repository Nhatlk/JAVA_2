package lab23;
import lab23.model.*;
import inputhandler.InputHandler;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addEmployee(new Employee("NV01", "Nguyen Van A", 1500));
        service.addEmployee(new Employee("NV02", "Tran Thi B", 2000));

        int choice;
        do {
            System.out.println("\n--- QUẢN LÝ NHÂN VIÊN ---");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm nhân viên theo ID");
            System.out.println("4. Cập nhật lương");
            System.out.println("0. Thoát");
            
            choice = InputHandler.inputInt("Chọn chức năng (0-4): ");

            switch (choice) {
                case 1:
                    System.out.println("--- Thêm Nhân Viên Mới ---");
                    String id = InputHandler.inputStringNotNull("Nhập ID: ");
                    String name = InputHandler.inputStringNotNull("Nhập tên: ");
                    double salary = InputHandler.inputDoubleNotNull("Nhập lương: ");
                    
                    try {
                        service.addEmployee(new Employee(id, name, salary));
                        System.out.println("Thêm thành công!");
                    } catch (IllegalArgumentException e) {
                        // Bắt lỗi từ Model nếu dữ liệu vi phạm quy tắc
                        System.out.println("Lỗi dữ liệu: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("--- Danh Sách Nhân Viên ---");
                    service.showAll();
                    break;

                case 3:
                    String searchId = InputHandler.inputStringNotNull("Nhập ID cần tìm: ");
                    Employee found = service.findById(searchId);
                    System.out.println(found != null ? found : "Không tồn tại nhân viên mang mã: " + searchId);
                    break;

                case 4:
                    String upId = InputHandler.inputStringNotNull("Nhập ID cần sửa: ");
                    double newS = InputHandler.inputDoubleNotNull("Nhập mức lương mới: ");
                    
                    try {
                        if (service.updateSalary(upId, newS)) {
                            System.out.println("Cập nhật lương thành công!");
                        } else {
                            System.out.println("Thất bại! ID không tồn tại.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Lỗi cập nhật: " + e.getMessage());
                    }
                    break;
                    
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                    
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    break;
            }
        } while (choice != 0);
    }
}