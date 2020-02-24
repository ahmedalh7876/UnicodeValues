/*
 * Author: Ahmed Al-Hayali
 * Completion date: 23/2/2020
 * This program lists the unicode values of the uppercase and lowercase letters A to Z and numbers 0 to 9
 */
package unicodevalues;

/**
 *
 * @author Ahmed
 */
public class UnicodeValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* For loop with variable i declared at the unicode value of the number 0 runs
        until i reaches the unicode value of the number 9 */
        for (int i = 48; i <= 57; i++) {
            System.out.println((char) i + ": " + i);
        }
        /* For loop with variable i declared at the unicode value of the capital letter A runs
        until i reaches the unicode value of the capital letter Z */
        for (int i = 65; i <= 90; i++) {
            System.out.println((char) i + ": " + i);
        }
        /* For loop with variable i declared at the unicode value of the small letter a runs
        until i reaches the unicode value of the small letter z */
        for (int i = 97; i <= 122; i++) {
            System.out.println((char) i + ": " + i);
        }
    }
}
