package Java8;

public class Main {
    public static void main(String[] args) {
        //Lambda Expression
        //1.8
        A a = new A();
       // a.print();


        B b = () -> System.out.println("HELLO AGAIN");

        b.print2();
    }
}

class A{
    public void print(){
        System.out.println("Hello");
    }
}

interface B{
    void print2();

}



