package com.company;

class Phone{
    public void ShowTime(){
        System.out.println("Showing time ");
    }
    public void On(){
        System.out.println("Turning on Phone  one");
    }
}

class SmartPhone extends Phone{
    public void Music(){
        System.out.println("Playing Music");
    }
    public void On(){
        System.out.println("Turning on smartPhone Two");
    }
}

public class cwh_49_dynamic_method_dispatch {
    public static void main(String[] args) {

//        Phone obj=new Phone();  //Allowed
//        SmartPhone obj=new SmartPhone(); //allowed

//        obj.ShowTime();
//        obj.On();

        Phone obj=new SmartPhone();
     //   SmartPhone ob1=new Phone();  //Not allowed parent class  object creation
        obj.On();
        obj.ShowTime();

       // obj.Music();


    }
}
