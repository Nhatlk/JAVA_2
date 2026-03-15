package ui;

import java.util.ArrayList;
import java.util.Scanner;
import modelEmployee.Employee;
import util.InputHandler;
import service.EmployeeService;
import dto.RequestDTOFullTime;
import dto.RquestDTOPartTime;


public class ConsoleUi {

    private EmployeeService service;
        public Scanner sc = new Scanner(System.in);
        public InputHandler input = new InputHandler();
        //public EmployeeService service = new EmployeeService();

        public ConsoleUi(EmployeeService service){
            this.service = service;
            
        }
        



        public void nhap1() {
            String name = input.inputString("Nhập tên nhân viên:");

            String manv = input.inputStringNotNull("Nhập mã nhân viên:");

            double salary = input.inputDoubleNotNull("Nhập Salary: ");

            double bonus = input.inputDoubleNotNull("Nhập bonus");

            double penalty = input.inputDoubleNotNull("Nhập penalty: ");

            RequestDTOFullTime dto = new RequestDTOFullTime(manv, name, salary, bonus, penalty);

            if(service.addEmployeeFullTime(dto)){
                System.out.println("Đã thêm thành công :3");
            }System.out.println("Thêm thất bại có thể trùng mã ID");

        }

        public void nhap2() {
            System.out.printf("nhap tên nhân viên: ");
            String name = sc.nextLine();
            System.out.printf("Nhập mã nhân viên: ");
            String manv = sc.nextLine();
            System.out.printf("Nhập basic Salary: ");
            double salary = input.inputDoubleNotNull("Nhập Salary: ");

            double workingHours = input.inputInt("Nhập giờ làm việc: ");

            double hourlyRate = input.inputInt("Nhập mức lương theo giờ: ");

            RquestDTOPartTime dto = new RquestDTOPartTime(manv, name, salary, workingHours, hourlyRate); 

            if (service.addEmployeepPartTIme(dto)) {
                System.out.println("Thêm Thành công");
            } else
                System.out.println("Lỗi !! trùng mã hoặc dữ liệu sai");

        }

        public void nhap() {
            boolean flag = true;
            while (flag) {
                System.out.println("Chương trình nhập thông tinh nhân viên");
                System.out.println("chọn 1: nhập nhân viên PartTime");
                System.out.println("chọn 2: nhập nhân viên FullTime");
                System.out.println("chọn 0: thoát chương trình");

                int choice = input.inputMenu("Vui lòng chọn: ");

                switch (choice) {
                    case 1:
                        nhap1();
                    case 2:
                        nhap2();
                    case 3:
                        if (input.confirmYN("Ban có muốn thoát Không ? Y/N")) {
                            flag = false;
                            return;
                        }
                }

            }
        }
        
        public void xuat(){
            ArrayList<Employee> list = service.getALlEm();

            int i = 1;
            for(Employee x: list){
                
                System.out.println("Thông tinh nhân viên thứ" + i);i++;
                x.xuat();
                System.out.println();
            }

        }

        public void topLuong(){
            System.out.println("Thông tinh nhân viên có lương cao nhất");
            service.getMaxEm();
            System.out.println();
        }

   

    public void run(){
        while(true){
            System.out.println("chọn 1: Để vào chương trình nhập nhân viên");
            System.out.println("chọn 2: Để xuất danh sách");
            System.out.println("chọn 3: Để hiển thị nhân viên có mức lương cao nhất");
            System.out.println("chọn 0: Để Thoát");

            int choice = input.inputInt("vui long chọn:");
            switch(choice){
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    topLuong();
                    break;
                case 0: break;
            }
        }
    }







    }


