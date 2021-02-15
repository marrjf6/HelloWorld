
package assignment01;

/**
 *
 * @author Juan Marrero
 */
public class Assignment01 {
    public static void main(String[] args) {
        
        //for loop initializes integer 0
        //checks to see if the value is less than 101,
        //because the problem is asking for even numbers that start at 0
        //and end at 100
        for(int i=0; i<101; i++){
            if (i%2 == 0 && i != 0)
                System.out.println(i);
        }
        
        /*Using loops, write a Java program that:

 - Prints all the even numbers between 0 and 100.

 - Each number should be on a separate line.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).

 - Due date is Feb/15 at 11:59 pm.*/
    }
    
}
