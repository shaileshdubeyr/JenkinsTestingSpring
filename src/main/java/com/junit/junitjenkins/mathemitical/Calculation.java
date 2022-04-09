package com.junit.junitjenkins.mathemitical;

public class Calculation {

    public boolean getValue(int numberOne, int numberTwo){
            int add = numberOne + numberTwo;
            int addTwo = numberTwo + numberOne;
        System.out.println("number1 " + add + " numberTwo " +addTwo);
            if(add != addTwo)
                return false;
            return true;

    }
}
