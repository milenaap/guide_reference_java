package Capitulo3;

public class DatosTextuales {
    public static void main(String[] args) {
        // Concatenacion de Cadenas
        String greet1 = "Hello";
        String greet2 = "World";
        String message1 = greet1 + " " + greet2 + "!";
        String message2 = greet1 + " " + greet2 + " " + 2024 + "!";

        System.out.println(message1);
        System.out.println(greet1 + " " + greet2 + " " + 2024 + "!");



        // Combinación de cadenas y números



        // Las cadenas pueden contener números
        String totalPrice = "Total: $" +3;
        System.out.println(totalPrice);

        // Pero cuidado al intentar realizar cálculos ya que el "+" concatena no hace sumatoria
        String totalPrice1 = "Total: $" + 3 + 2 + 1;
        System.out.println(totalPrice1);

        // Utilice paréntesis para los números aqui si hace la suma ya que la operacion la encierras entre parentesis
        String totalPrice2 = "Total: $" +(3 + 2 + 1);
        System.out.println(totalPrice2);


        double price = 20.00;
        double tax = 0.02;
        int quantity = 2;
        double totalPrice3 = 0;


        totalPrice3 = (price * tax + price) * quantity;
        System.out.println("Alex wants to purchase " + quantity + " Shirts");
        System.out.println("Total cost with tax is: " + totalPrice3) ;

            /*

            SECUENCIA DE ESCAPE

            \t Insertar un nuevo separador
            \b Insertar un retroceso
            \n Insertar una nueva linea
            \r Insertar un retorno de carro
            \f Insertar un salto de hoja
            \' Insertar un caracter de comilla simple
            \" Insertar un caracter de comillas dobles
            \\ Insertar un caracter de barra invertida

             */

        // Ex: Insertar un caracter de comillas dobles
        System.out.println("The cat said \" Meow!\" to me." );

        // Ex: Insertar una nueva linea
        System.out.println("This is the first line. \n" + "This is the second line.");

        // Dos metodos de impresion
        //println funciona como si tuviera \n automaticamente al final de la sentencia
        System.out.println("Print Line method");
        System.out.print("Print method");
        // Da el mismo resultado
        System.out.println("Printing ");
        System.out.print("Printing \n");

        // Imprimir mucho texto

        System.out.println("This is the first line."
                + "This is the still the first line."
                + "It's just that the line is very long "
                + "and I can't see it all in NetBeans."
                + "\n" + "This is the second line."
                + "\n" + "This is the third line.");

    }
}
