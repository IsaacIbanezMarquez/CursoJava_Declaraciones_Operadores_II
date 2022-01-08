

public class Declaraciones_Operadores
{
    public static void main(String[] args)
    {
        //Gracias al flujo de ejecución las variables pueden almacenar su valor y posteriormente modificar y guardar este.

        int c = 5;

        // palabra Final designa CONSTANTE.
        // Una constante no podrá ser modificada con posterioridad a la declaración de su valor.

        // int c = 8; [ Dará ERROR, EXEPCIÓN ]

        final double apulgadas = 2.54;

        double cm = 6;

        double resultado = cm / apulgadas;



        System.out.println("En " + cm + " cm hay " + resultado + " pulgadas.");
    }
}
