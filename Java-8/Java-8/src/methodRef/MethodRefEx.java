package methodRef;

public class MethodRefEx {

    public static void print(String s){
        System.out.println(s);
    }

    public int addition(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        // reference :: methodName

        MethodRefEx.print("Hello and Welcome....");
     //   MethodRefEx::print;     // static method ref

        MethodRefEx methodRefEx = new MethodRefEx();
        int result = methodRefEx.addition(8,6);

     //   methodRefEx::addition;           // instance method ref



    }
}
