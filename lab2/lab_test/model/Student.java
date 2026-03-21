package lab_test.model;

import lab_test.enumm.StudentType;

    public abstract class Student{
        private String id;
        private String name;
        private double salary;
        private StudentType type;

        public abstract void xuat();
        

        public Student(String id, String name, double salary, StudentType type) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.type = type;
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public StudentType getType() {
            return type;
        }
        public void setType(StudentType type) {
            this.type = type;
        }
        public double getSalary() {
            return salary;
        }
        public void setSalary(double salary) {
            this.salary = salary;
        }
    }