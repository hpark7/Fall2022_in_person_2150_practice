package StackOfInteger;

public class StackOfInteger {
    //attributes
    private int[] elements; //array of elements to simulate a stack
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    //constructors
    public StackOfInteger(int capacity){
        elements = new int[capacity];
    }

    //no-arg constructor
    public StackOfInteger(){
        this(DEFAULT_CAPACITY);
    }

    //push, pop, peek, and empty

    public void push(int value){
        if(size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements,0, temp, 0,elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }


    public int pop(){
        return elements[--size];  //size -= 1;
    }

    public int peek(){
        return elements[size - 1];
    }

    public boolean empty(){
        if(size == 0){
            return true;
        }
        else return false;
    }

    public int getSize(){
        return size;
    }
}
