package code1;

import code2.MyFunction;

public class Main {
    public static void main(String[] args) {
        Person b = new Person("b", 1);
        MyFunction myFunction = new MyFunction();
        int i = myFunction.fun1();
        System.out.println(i);
    }
}
