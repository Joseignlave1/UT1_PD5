import java.util.Arrays;

public class JavaMethods {
    public static void main(String[] args) {
        //substring (int indiceComienzo)

        /*
            String original = "Hola me llamo nacho";
            String sub1 = original.substring(8);
            System.out.println(sub1);
         */

        //substring (int indiceComienzo, int indiceFinal)
        /*
            String original = "Hola pepe me llamo";
            String sub2 = original.substring(0, 4);
            System.out.println(sub2);
         */

        //split(int delimitador)
        /*
            String original = "Hola me llamo nacho";
            String[] sub1 = original.split(" ");

            Hay varias formas de imprimir los elementos.

            //Método toString de la clase Arrays.
            System.out.println(Arrays.toString(sub1));

            //Recorro el array con un forEach
            for(String elem : sub1) {
                System.out.println(elem);
            }
            //También pudiera recorrerlo con un for

         */

        //split(String delimitador, int limit)
        /*
            String original = "Hola me llamo nacho";
            String[] sub1 = original.split(" ", 2);
            System.out.println(Arrays.toString(sub1));
         */

        //subSequence
        /*
            String original= "Hola me llamo nacho";
            CharSequence originalSubsequence = original.subSequence(0 , 4);
            System.out.println(originalSubsequence);
         */

        //trim
        /*
            String original= "      Hola me llamo nacho      ";
            String originalWithoutWhiteSpaces = original.trim();
            System.out.println(originalWithoutWhiteSpaces);
         */
        //toLowerCase
        /*
            String original= "Hola me llamo nacho";
            String originalLowerCase = original.toLowerCase();
            System.out.println(originalLowerCase);
         */

        //toUpperCase
        /*
            String original= "Hola me llamo nacho";
            String originalUpperCase = original.toUpperCase();
            System.out.println(originalUpperCase);
         */

        //indexOf(int ch)
        /*
            String original= "Hola me llamo nacho";
            int index = original.indexOf('a');
            System.out.println(index);
         */

        //indexOf(int ch, int fromIndex)
        /*
            String original= "Hola me llamo nacho";
            int index = original.indexOf('a' , 4);
            System.out.println(index);
         */

        //indexOf(String str)
        /*
            String original= "Hola me llamo nacho";
            int index = original.indexOf("Hola");
            System.out.println(index);
         */
        //indexOf(String str, int fromIndex)
        /*
            String original= "Hola me llamo nacho";
            int index = original.indexOf("llamo", 2);
            System.out.println(index);
         */

        // lastIndexOf(int char)
        /*
            String original= "Hola me llamo nacho";
            int lastIndex = original.lastIndexOf('o');
            System.out.println(lastIndex);
         */

        //lastIndexOf(int ch, int fromIndex)
        /*
            String original= "Hola me llamo nacho";
            int lastIndex = original.lastIndexOf('a', 3);
            System.out.println(lastIndex);
         */

        // lastIndexOf(String str)
        /*
            String original= "Hola me llamo nacho";
            int lastIndex = original.lastIndexOf("llamo");
            System.out.println(lastIndex);
         */
        // lastIndexOf(String str, int fromIndex)
        /*
            String original= "Hola me llamo nacho";
            int lastIndex = original.lastIndexOf("Hola");
            System.out.println(lastIndex);
         */

        // contains
        /*
            String original= "Hola me llamo nacho";
            boolean containsNacho = original.contains("nacho");
            System.out.println(containsNacho);
         */
        // replace(char oldChar, char newChar)
        /*
            String original= "Hola me llamo nacho";
            String newOriginal = original.replace('o', 'f');
            System.out.println(newOriginal);
         */

        // replace(CharSequence target, CharSequence replacement)

        /*
            String original= "Hola me llamo nacho";
            String newOriginal = original.replace("Hola" , "Queso");
            System.out.println(newOriginal);
         */

        // replaceAll(Strings regex, String replacement)

        /*
            String original= "Hola me llamo nacho";
            String newOriginal = original.replaceAll("o" , "h");
            System.out.println(newOriginal);
         */

        // replaceAll(String regex, Function<MatchResult, String> replacer=

        /*
            String original= "Hola me llamo nacho";
            String newOriginal = original.replaceAll("[aeiou]", "*");
            System.out.println(newOriginal);
         */

        // replaceFirst(String regex, String replacement)
        
        /*
            String original= "Hola me llamo nacho nacho nacho nacho";
            String newOriginal = original.replaceFirst("nacho", "jose");
            System.out.println(newOriginal);
         */
    }
}
