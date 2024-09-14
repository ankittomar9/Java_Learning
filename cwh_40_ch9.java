package com.company;

class MyEmployee{
   private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n){
        this.name=n;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }
}

public class cwh_40_ch9 {
    public static void main(String[] args) {

        MyEmployee e=new MyEmployee();
//        e.id=10;
//        e.name="Ankit"; -->Throws an error due to private access modifier
        e.setName("Ankit String Learning");
        System.out.println(e.getName());
        e.setId(123);
        System.out.println(e.getId());
    }
}
