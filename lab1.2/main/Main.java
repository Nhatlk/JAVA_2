package main;

import ui.ConsoleUi;
import service.EmployeeService;

public class Main {
   

   public static void main(String[] args) {
      
   EmployeeService service = new service.EmployeeService();
    ConsoleUi UI = new ConsoleUi(service); // nếu thay service thì use interface 
    
    UI.run();
   }
}
