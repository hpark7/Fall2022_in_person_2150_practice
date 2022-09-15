package StackOfInteger;

public class StackOfIntegerTester {

    public static void main(String[] args) {
        StackOfInteger soi = new StackOfInteger();
        for(int i = 0; i < 10; i++){
            soi.push(i);
        }
        while(!soi.empty()){
            System.out.print(soi.pop() + " ");
        }
    }

}
