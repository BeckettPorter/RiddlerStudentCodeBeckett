import java.util.ArrayList;
import java.util.Arrays;

/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Beckett Porter, August 23rd 2024
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        String decrypted = "";

        // Checks to see if the decimal value of the number converted to a letter
        // would be over the 17th letter in the alphabet or not, then shifts it by 9.
        for (int i = 0; i < encrypted.length(); i++)
        {
            int num = encrypted.charAt(i);
            if (num > 65)
            {
                if (num >= 113) {
                    num -= 17;
                }
                else {
                    num += 9;
                }
            }

            decrypted += (char) (num);
        }
        // TODO: Complete the decryptOne() function.

        System.out.printf(decrypted);

        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";

        while (encrypted.contains(" "))
        {
            // I found this parseInt method online and this converts ascii decimal values to chars
            int num = Integer.parseInt(encrypted.substring(0, encrypted.indexOf(" ")));

            decrypted += (char) num;
            encrypted = encrypted.substring(encrypted.indexOf(" ") + 1);
        }

        // TODO: Complete the decryptTwo() function.

        System.out.printf(decrypted);

        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";

        for (int i = 0; i < encrypted.length(); i += 8)
        {
            // I found this version of the parseInt method online, and it converts binary to the ascii decimal value.
            int num = Integer.parseInt(encrypted.substring(i, i + 8), 2);

            String str = String.valueOf(num);

            decrypted += (char) Integer.parseInt(str);
        }
        // TODO: Complete the decryptThree() function.

        System.out.printf(decrypted);

        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        for (int i = 0; i < encrypted.length(); i++)
        {
            // Tried to convert the special characters to bytes and then to ints and then finally to chars...
            // this did not work lol.
            byte[] arrayOfBites = (encrypted.substring(i, i + 1).getBytes());
            for (byte b : arrayOfBites)
            {
                decrypted += (char) Math.abs(b);
            }
        }
        System.out.println(decrypted);

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
