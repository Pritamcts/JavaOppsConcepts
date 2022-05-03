//💥1.super is used to refer immediate parent class instance variable.
//💥2.super can be used to invoke parent class method.
//💥3.super is used to invoke parent class constructor.


//1.instance variable
// class animal{
//     String color="White";
// }
// class animal2 extends animal{
//     String color="Black";
//    void printColor(){
//        System.out.println(color);
//        System.out.println(super.color);
//    }

// }
// public class SuperDemo {
//     public static void main(String[] args) {
//         animal2 obj=new animal2();
//         obj.printColor();
//     }
// }


//2.Invoke parent class methode
// class Animal{  
//     void eat(){System.out.println("eating...");}  
//     }  
//     class Dog extends Animal{  
//     void eat(){System.out.println("eating bread...");}  
//     void bark(){System.out.println("barking...");}  
//     void work(){  
//     super.eat();  
//     bark();  
//     }  
//     }  
//     class SuperDemo{  
//     public static void main(String args[]){  
//     Dog d=new Dog();  
//     d.work();  
//     }}  

//3.Invoke parent class constructor
class Animal{  
    Animal(){System.out.println("animal is created");}  
    }  
    class Dog extends Animal{  
    Dog(){  
    super();  
    System.out.println("dog is created");  
    }  
    }  
    class SuperDemo{  
    public static void main(String args[]){  
    Dog d=new Dog();  
    }}  



