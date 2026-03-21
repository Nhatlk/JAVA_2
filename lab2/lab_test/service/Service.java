package lab_test.service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import lab_test.model.Student;
import lab_test.enumm.StudentType;
import lab_test.repo.Repository;
public class Service {
   
    private Repository repo = new Repository();
    private ArrayList<Student> list = repo.findAll();


    public void findAll(){
        System.out.println(repo.findAll());
    }


    public ArrayList<Student> sortByTypeStudent(){
        // gọi Collec.sort -> lấy cái list ra , tạo compare Student 
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2){
                return s1.getType().compareTo(s2.getType());
            }
        });
        return list;
    }

    // public int countByTypeStudent(){
    //     int studentInter = 0;
        
    //     for(Student x : List){
    //         if(x.getType() == StudentType.INTERNATIONAL ){
    //             studentInter++;
    //         }
    //     }
    //     return studentInter;

    // }

    public int countByTypeStudent(StudentType typeInput){
        int count = 0;
        for(Student x : list){
            if(x.getType() == typeInput){
                count ++;
            }
        }
        return  count;
    }

}
