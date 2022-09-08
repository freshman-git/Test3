package code2;

import code3.Add;

public class MyFunction {
    public int fun1(){
        return fun2();
    }
    public int fun2(){
        Add a = new Add();
        int res = a.add(1, 1);
        return res;
    }
}
