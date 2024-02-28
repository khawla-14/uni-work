package TP4;

public class person {
    protected String name;      // it is private but the extendanded casses ca access it
    protected String lastName;
    protected int age;

    public person (String name, String lastName, int age){
        //
    }


    //private methods fro the person class
    private void method1(){}
    private void method2(){}
    private void method3(){}


    // WHEN using two constructors we use SUPER() to cal it of the mere class
    // THis() in the son class is used in the 2nd constructor to cal the first constructor in the same class, 
    // in our case the first one is amready callling the person class
}
