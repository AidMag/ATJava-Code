/*
Explain why the following program does not produce the output that some people would expect it to produce:
    
    The following output would not produce what people would expect becuase the way floating-point values are stored.
They are storage methoud introduces error, which is not noticable by humans, which makes it so comparing the values  

Fix the program so it will produce the output that most people would expect it to produce.  Submit your corrected program for grading through MSA or GitHub.

 */

public class PartC {
    public static void main(String[] args) {
        double a = 1.2; 
        double b= 3.0;
        double c = a * b; 
        if(c == 3.6){
        System.out.println("c is 3.6");
        } else {
        System.out.println("c is not 3.6");
        }
    }
}
