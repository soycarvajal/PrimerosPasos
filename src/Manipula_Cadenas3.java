public class Manipula_Cadenas3 {
    public static void main(String[] args) {
        
        String alumno1, alumno2;

        alumno1 = "David";
        alumno2 = "david";

        System.out.println(alumno1.equals(alumno2)); // .equals Evalua si son iguales respetando las mayusculas 
        System.out.println(alumno1.equalsIgnoreCase(alumno2)); // .equalsIgnoreCase Evalua si son iguales ignorando las mayusculas
    }
}
