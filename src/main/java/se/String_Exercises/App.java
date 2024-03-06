package se.String_Exercises;
import java.util.Arrays;

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

       /*
       4. Convert the following String: "CAPS EQUALS SCREAMING" to lowercase and print it out.
       Then convert it back to uppercase and print it out again.
        */
        String uppCase = "CAPS EQUALS SCREAMING";
        String lowToUpp = uppCase.toLowerCase();
        System.out.println("Q.4) ");
        System.out.println("Upper case:" + uppCase);
        System.out.println("Lower case:" + lowToUpp);


        /*
        5. Correct the following String: "Java is the worst programming language!" by replacing the
        (obviously incorrect) word "worst" with the word "best". Then print out the sentence.
         */
        String originalText = "Java is the worst programming language!";
        String changeText = originalText.replace("worst","best");
        System.out.println("Q.5) ");
        System.out.println("Original text: " + originalText);
        System.out.println("New text:      " + changeText);

        /*
        6. What is the output of the following String:
        "\tJ\ta\tv\ta\t" after you trim it?
         */
        String original = "\tJ\ta\tv\ta\t";
        System.out.println("Q.6) " + original);

        /*
        7. Parse the following int: 20 to a String and add a 20 to the end of the String.
        Printing it out should return: "2020".
         */
        int number = 20;
        String numToString = Integer.toString(number);
        System.out.println("Q.7) " +numToString+"20");

        /*
        8. Oil and water don't go well together. Given the String: "Oil and Water", split them up into the words
        "Oil","Water" and store them in a String array.
         */

        String originText = "Oil and Water";
        String [] newArr = originText.split("\\s*and\\s*");
        System.out.print("Q.8) ");
        System.out.println(Arrays.toString(newArr));

        /*
        9. Split the following String: "Carl,Susie,Fredrick,Bob,Erik" into an array.
        Print out all names separately.
         */

        String nam = "Carl,Susie,Fredrick,Bob,Erik";
        String [] namArr = nam.split("\\s*,\\s*");
        System.out.print("Q.9) ");
        System.out.println(Arrays.toString(namArr));

        /*
        10. Convert the following String: "ThisShouldBeConverted" to a char array.
        Iterate through the char array and print out each element.
         */
        String txt = "ThisShouldBeConverted";
        String [] txtToArr = txt.split("");
        System.out.print("Q.10) ");
        System.out.println(Arrays.toString(txtToArr));



    }
}
