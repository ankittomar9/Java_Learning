package com.company;
class MyMainemployee{

    private int id;
    private String name;
    public MyMainemployee(){
         id=10;
         name="This is a test String";
    }
    public MyMainemployee(int myID){
        id=myID;
        name="Overloading constructor";
    }
    public MyMainemployee(String Myname,int myID){
         id=myID;
        name=Myname;
    }




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
public class cwh_42_constructors {
    public static void main(String[] args) {

       // MyMainemployee e1=new MyMainemployee("aman",36);
        //MyMainemployee e1=new MyMainemployee();
        MyMainemployee e1=new MyMainemployee(22);

        System.out.println(e1.getId());
        System.out.println(e1.getName());

    }
}
