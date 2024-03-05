package se.String_Exercises;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*Q.1
        What char is at index position 6 in the following String: "Long example sentence" ?
         */
        String charPosition = "Long example sentence";
        char result = charPosition.charAt(6);
        System.out.println("Q.1) Index position 6: " + result);

        /*Q.2
        What is the index position of 'o' in the following String: "Even longer example sentence" ?*/
        String positionOriginal = "Even longer example sentence";
        int oPosition = positionOriginal.indexOf('o');
        System.out.println("Q.2) " + oPosition);

        /*Q.3
        Given the following String: "Ok this is not as long!" create a substring of only "not as long"
        (excluding the exclamation point) and print it out.*/
       String originalString = "Ok this is not as long!";
       String newString = originalString.substring(10,22);
       System.out.println("Q.3)" + newString);


    }
}
