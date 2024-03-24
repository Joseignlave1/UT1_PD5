public class StringBuilderJava {
    public static void main(String[] args) {
        //Constructores

        //StringBuilder()

        /*
            StringBuilder stringBuilder = new StringBuilder();
        */

        //StringBuilder(CharSequence cs)
        /*
            CharSequence hiWord = "Hello World";
            StringBuilder sb = new StringBuilder(hiWord);
         */

        //StringBuilder(int initCapacity)
        /*
            StringBuilder stringBuilder1 = new StringBuilder(48);
        */

        //StringBuilder(String s)
        /*
            String hiWord = "Hello World";
            StringBuilder stringBuilder1 = new StringBuilder(hiWord);
         */
        //setLength(int newLength)
        /*
            String hiWord = "Hello World";
            StringBuilder stringBuilder1 = new StringBuilder(hiWord);
            stringBuilder1.setLength(9);
            System.out.println(stringBuilder1.length());
         */

        // ensureCapacity
        /*
            String hiWord = "Hello World";
            StringBuilder stringBuilder1 = new StringBuilder(hiWord);
            stringBuilder1.ensureCapacity(28);
            System.out.println(stringBuilder1.capacity());
         */

        // append
        /*
            String hiWord = "Hello World";
            StringBuilder stringBuilder1 = new StringBuilder(hiWord);
            stringBuilder1.append(" ");
            stringBuilder1.append("jose");
            System.out.println(stringBuilder1);
         */
        // insert
        /*
            String hiWord = "Hello World";
            StringBuilder stringBuilder1 = new StringBuilder(hiWord);
            stringBuilder1.insert(5, "josesito");
            System.out.println(stringBuilder1);
         */

        // delete
        /*
            String hiWord = "Hello World";
            StringBuilder stringBuilder1 = new StringBuilder(hiWord);
            stringBuilder1.delete(0, 8);
            System.out.println(stringBuilder1);
         */

        //deleteCharAt(int index)
        /*
            String hiWord = "Hello World";
            StringBuilder stringBuilder1 = new StringBuilder(hiWord);
            stringBuilder1.deleteCharAt(2);
            System.out.println(stringBuilder1);

         */

        //reverse()
        /*
            String hiWord = "Hello World";
            StringBuilder stringBuilder1 = new StringBuilder(hiWord);
            System.out.println(stringBuilder1.reverse());
         */
    }
}
