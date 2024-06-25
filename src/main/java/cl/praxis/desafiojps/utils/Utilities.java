package cl.praxis.desafiojps.utils;

public class Utilities {
    public int factorial(int number) {
        if(number < 0) {
            throw new IllegalArgumentException("No se puede obtener factorial con números negativos");
        }
        int factorial = 1;
        for(int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public String parOImpar(int number) {
        if(number % 2 == 0) {
            return "Es par";
        } else {
            return "Es impar";
        }
    }
}