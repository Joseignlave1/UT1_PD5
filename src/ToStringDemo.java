public class ToStringDemo {

    public static void main(String[] args) {
        double d = 888.51;
        String s = Double.toString(d);
        int dot = s.indexOf('.');
        System.out.println(dot + " digits " +
                "before decimal point.");
        System.out.println( (s.length() - dot - 1) +
                " digits after decimal point.");
    }
}

/*
    Parte 1:

    Salida el ejecutarlo:

    3 digits before decimal point.
    2 digits after decimal point.

    Parte 2:

    Primero tenemos una variable de tipo double, la convertimos a String con el método toString de java
    después utilizando el String con el valor almacenado de la variabla de tipo double, llamado s,
    obtenemos la posición de el caracter "." mediante el método indexOf,
    este método te da la posición de un caractér en un string, esta posición va a ser igual a
    los números que van antes de punto decimal, ya qué la posición empieza en 0 y cuenta hasta que nos encontramos con el caracter "."

    En relación al segundo output, al realizar la longitud del string - dot(caractéres que están antes del punto decimal)
    obtenemos la cantidad de caractéres que están desde el punto decimal hacia adelante, nosotros queremos saber la cantidad de caractéres
    que están después del punto decimal, por lo que solo tenemos que restarle 1(restarle el punto) y obtendríamos la cantidad
    de caractéres que están después del punto decimal.

 */
