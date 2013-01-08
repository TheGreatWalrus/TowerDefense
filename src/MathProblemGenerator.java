import java.util.Random;

/**
 *
 * @author ino
 */
public class MathProblemGenerator {
    
    private Random r;
    
    public MathProblemGenerator(){
        r = new Random();
    }
    
    //Generates an addition problem in the form of a string.  The first half 
    //of the string is the actual question, the : separates the question from
    //the correct answer. The double is the difficulty level of the question
    //based on the tower's current upgrade level.
    public String addition(double difficulty){
        
        int x = r.nextInt((int)Math.pow(10,difficulty) + 1);
        int y = r.nextInt((int)Math.pow(10,difficulty) + 1);
        int solution = x+y;
        
        String answer = x + " + " + y + " = :" + solution;
        return answer;
    }
    
    //Generates a subtraction problem in the form of a string.  The first half 
    //of the string is the actual question, the : separates the question from
    //the correct answer. The double is the difficulty level of the question
    //based on the tower's current upgrade level.
    public String subtraction(double difficulty){
        int x = r.nextInt((int)Math.pow(10,difficulty) + 1);
        int y = r.nextInt(x + 1);
        int solution = x-y;
        
        String answer = x + " - " + y + " = :" + solution;
        return answer;
    }
    //Generates a multiplication problem in the form of a string.  The first half 
    //of the string is the actual question, the : separates the question from
    //the correct answer. The double is the difficulty level of the question
    //based on the tower's current upgrade level.
    public String multiplication(double difficulty){
        
        int x = r.nextInt((int)(10 * difficulty) + 1);
        int y = r.nextInt((int)(10 * difficulty) + 1);
        int solution = x*y;
        
        String answer = x + " x " + y + " = :" + solution;
        return answer;
    }
    
    //Generates a division problem in the form of a string.  The first half 
    //of the string is the actual question, the : separates the question from
    //the correct answer. The double is the difficulty level of the question
    //based on the tower's current upgrade level.
    public String division(double difficulty){
        
        int x = r.nextInt((int) (30 * difficulty) + 1);
        int y = r.nextInt(x + 1);
        //ensures that y divides into x with no remainder
        
        while(x % y != 0){
            y = r.nextInt( x + 1);
        }
        int solution = x/y;
        
        String answer = x + " / " + y + " = :" + solution;
        return answer;
    }
    
}
