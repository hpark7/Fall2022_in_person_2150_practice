package FizzBuzz;

/**
 * class: FizzBuzz
 * this program will create FizzBuzz template or reference type program.
 * Rule of the FizzBuzz is
 * (1) if the number is multiples of 3 and 5, then it will print out FizzBuzz
 * (2) else if the number is multiples of 3, then it will print out Fizz
 * (3) else if the number is multiples of 5, then it will print out Buzz
 * (4) otherwise, it will print the number itself.
 */
public class FizzBuzz {

    private int sn;//start number
    private int en; //end number

    //no-arg constructor by taking the constructor with two parameters
    public FizzBuzz(){
        this(1,20);
    }

    //constructor taking sn and en - two parameters
    public FizzBuzz(int sn, int en){
        this.sn = sn;
        this.en = en;
    }

    public int getSn(){
        return sn;
    }

    public void setSn(int sn){
        this.sn = sn;
    }
    public int getEn(){
        return en;
    }

    public void setEn(int en){
        this.en = en;
    }

    /**
     * method: count
     * this method does not have parameter.
     * this method generates numbers based on the rule with default sn and en.
     *
     */
    public void count(){
        for(int i = sn; i <= en; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }

    public void count(int sn, int en){
        this.sn = sn;
        this.en = en;

    }

    public void count(FizzBuzz fb){
        //fb has sn and en
        this.sn = fb.sn;
        this.en = fb.en;
        int number = this.sn;
        while( number <= this.en  ){
            if(number % 3 == 0 && number % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if( number % 3 == 0){
                System.out.println("Fizz");
            }
            else if( number % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(number);
            }

            number++;
        }
    }

    public String toString(){
        return "FizzBuzz- [sn:" + sn + ", " + "en: " + en + "]";
    }
}
