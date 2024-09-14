package com.company;
class Employee{
    int id;
    int salary;
    String name;
        public void print() {
            System.out.println("The id is : " + id + "\n The name is : " + name);
        }

    public int getSalary() {
            return salary;
    }
}

public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is a custom class");

        Employee e=new Employee(); // instantiating a new Employee Object
        Employee e1=new Employee();
        //setting attributes
        e.id=10;
        e.name="Ankit";
        e.salary=34;

        e1.id=12;
        e1.name="Ankur";
        e1.salary=20;
        e.print();
        e1.print();

        int salary=e.getSalary();


    }

}
