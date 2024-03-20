//Ejercicio 4, parte 1
public class ValueOfDemo {
    public static void main(String[] args) {
        /*
            // this program requires two
            // arguments on the command line
        if (args.length == 2) {
            // convert strings to numbers
            float a = (Float.parseFloat(args[0]));
            float b = (Float.parseFloat(args[1]));
            // do some arithmetic
            System.out.println("a + b = " +
                    (a + b));
            System.out.println("a - b = " +
                    (a - b));
            System.out.println("a * b = " +
                    (a * b));
            System.out.println("a / b = " +
                    (a / b));
            System.out.println("a % b = " +
                    (a % b));
        } else {
            System.out.println("This program " +
                    "requires two command-line arguments.");
        }
    }
         */
        //Ejercicio 4, parte 2
        // this program requires two arguments on the command line
        if (args.length == 2) {
            // Validamos si los argumentos son enteros positivos
            if (isPositiveInteger(args[0]) && isPositiveInteger(args[1])) {
                // Si son enteros positivos, los convertimos a números flotantes
                float a = Float.parseFloat(args[0]);
                float b = Float.parseFloat(args[1]);
                // do some arithmetic
                System.out.println("a + b = " + (a + b));
                System.out.println("a - b = " + (a - b));
                System.out.println("a * b = " + (a * b));
                System.out.println("a / b = " + (a / b));
                System.out.println("a % b = " + (a % b));
            } else {
                System.out.println("Los argumentos deben ser enteros positivos.");
            }
        } else {
            System.out.println("This program requires two command-line arguments.");
        }

    }
    public static boolean isPositiveInteger(String str) {
        return str.matches("\\d+") && !str.startsWith("-"); //Utilizo esta expresión regular para verificar en el string si el string tiene dígitos
        // y después verifico si los dígitos del string no contienen un signo negavito al principio, indicando que son enteros positivos
        //Tomo el 0 como entero positivo.
        //Decido hacerlo así ya que me parece más eficiente que crear un Array de Floats, recorrerlo y ir parseando y añadiendo los valores
        //del Array de strings args, para después verificar en el nuevo Array de Floats, si los valores son enteros positivos o no.
        //Entiendo que esta manera no es tán intuitiva como la otra.
    }
}
/*
    Problemas: El programa requiere 2 argumentos para funcionar, a y b, si embargo verifica si args.length == 3,
    debería verificar si args.length == 2.
    el método floatValue no existe, en su lugar podríamos parsearlo directamente desde la posición del array que queremos.

 */

