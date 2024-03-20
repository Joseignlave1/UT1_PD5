public class Ejercicio3 {
    public static void main(String[] args) {
        /*
            String palindrome =  "Aibofobia;;;Aibofobia";
            int len = palindrome.length();
            char[] tempCharArray = new char[len];
            char[] charArray = new char[len];

            // put original string in an
            // array of chars
            for (int i = 0; i < len; i++) {
                tempCharArray[i] =
                        palindrome.charAt(i);
            }

            // reverse array of chars
            for (int j = 0; j < len; j++) {
                charArray[j] =
                        tempCharArray[len - 1 - j];
            }

            String reversePalindrome =
                    new String(charArray);
            System.out.println(reversePalindrome);
         */
        String palindrome = "Hola";
        char[] charArray = palindrome.toCharArray();
        int pointerLeft = 0;
        int pointerRight = palindrome.length() -1;
        while(pointerLeft <= pointerRight) {
            //Realizamos un swapping, teniendo una variable temporal para qué no se nos pierdan caractéres.
            char temp = charArray[pointerLeft];
            charArray[pointerLeft] = charArray[pointerRight];
            charArray[pointerRight] = temp;
            //aumentamos los pointers
            pointerLeft++;
            pointerRight--;
        }
        System.out.println(charArray);

    }
    /*
        Al tener diferentes tipos de frases con distintos símbolos, letras mayúsculas y minúsculas
        pasadas por parámetro , lo qué hace el algoritmo es revertir la frase.
        Este algoritmo es ineficiente, ya qué utiliza 2 estructuras for para recorrrer 2 arrays diferentes para dar vuelta la frase,
        lo qué nos da un time complexity de O(n^2) y un space complexity de O(n) debido al uso de las estructuras adiccionales
        
        Propongo una solución más eficiente, utilizando el algoritmo de two pointers, uno al principio del array
        y otro al final del array, esto tiene un time complexity de O(n) y space complexity también de O(n) debido a qué
        creamos un array de characters para hacer el swapping
     */
}
