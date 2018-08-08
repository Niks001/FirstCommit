class A{
    void fun(){
        System.out.println("class A");
    }
}
class B extends A{
    void fun(){
        System.out.println("class B");
    }
    void fun1(int x){
        System.out.println("fun1");
    }
    void fun1(double y){
        System.out.println("fun1-1");
    }
}
public class TestOverriding {
    public static void main(String args[]){
//        A b = new A();
//           b.fun();
        B b = new B();
        b.fun1(5.5);
    }
}

