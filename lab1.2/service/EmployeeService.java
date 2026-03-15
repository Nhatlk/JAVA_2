package service;

import java.util.ArrayList;

import modelEmployee.Employee;
import repository.EmployeeRepository;
import modelEmployee.FullTime;
import modelEmployee.PartTime;
import dto.RequestDTOFullTime;
import dto.RquestDTOPartTime;


public class EmployeeService {

    private EmployeeRepository repo = new EmployeeRepository();
    //private RequestDTO dto = new RequestDTO();
        public void getMaxEm(){
        Employee salary1 = maxInCome(); 
        salary1.xuat();
    }

    public ArrayList<Employee> getALlEm(){
        return  repo.findAll();
    }

    //
    public boolean addEmployeeFullTime(RequestDTOFullTime dto){
        if(repo.findID(dto.getId()) != null){
            return false;
        }

        repo.add(new FullTime(dto.getId(),
                             dto.getName(),
                             dto.getBasicSalary(),
                             dto.getBonus(),
                             dto.getPenalty()));
        return true;

    }

     public boolean addEmployeepPartTIme(RquestDTOPartTime dto){
        if(repo.findID(dto.getId()) != null){
            return false;
        }

        repo.add(new PartTime(dto.getId(),
                             dto.getName(),
                             dto.getBasicSalary(),
                             dto.getWorkingHours(),
                             dto.getHourlyRate()));
        return true;

    }

    

     public  Employee maxInCome(){

        ArrayList<Employee> list = repo.findAll();

        Employee maxEm1 = list.get(0);

        for (int i = 0; i < repo.findAll().size(); i++) {
            
            Employee maxEm2 = list.get(i);
            if(maxEm2.inCome() > maxEm1.inCome()){
                maxEm1 =  maxEm2;
            }
        }

          return maxEm1;
    }



}
