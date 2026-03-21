package lab_test.repo;

import java.util.ArrayList;

import lab_test.model.Student;

public class Repository {
   
    private ArrayList<Student> listStudent = new ArrayList<>(); 

    public void addlist(Student students){
        listStudent.add(students);
    }

    public ArrayList<Student> findAll(){
        return listStudent;
    }

    






































































}
