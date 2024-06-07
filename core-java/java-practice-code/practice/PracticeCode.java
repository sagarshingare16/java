package practice;

class A{
    public void show1(){
        System.out.println("In A show");
    }
}
class B extends  A{
    public void show2(){
        System.out.println("in B show");
    }
}

public class PracticeCode {
    public static void main(String[] args) {
        A obj = (A) new B(); //upcasting
        obj.show1();

        B obj1 = (B) obj;
        obj1.show2();    //downCasting
    }
}
