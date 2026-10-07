package com.cox.bssweb.hello;

@FunctionalInterface
interface ZeroParameter{
    
    void display();
}

public class Geeks{
    
    public static void main(String[] args){
        
        // Lambda expression with zero parameters
        ZeroParameter zeroParamLambda = ()
            -> System.out.println(
                "This is a zero-parameter lambda expression!");

        // Invoke the method
        zeroParamLambda.display();
    }
}
