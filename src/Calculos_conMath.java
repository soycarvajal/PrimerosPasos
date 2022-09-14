public class Calculos_conMath {
    public static void main(String[] args) {

        // double raiz=Math.sqrt(9); .sqrt Sacar la raiz de un numero

        /*
         * double num1= 5.85; .round Redondear un numero y convertir un decimal a un
         * entero con (int)
         * int resultado =(int) Math.round(num1);
         */

        double base = 5;

        double exponente = 3;

        // .pow Sacar la potencia de un numero y convertir un decimal a entero con (int)"refundicion"
        int resultado = (int) Math.pow(base, exponente); 

        // Concatenar
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado);

    }
}
