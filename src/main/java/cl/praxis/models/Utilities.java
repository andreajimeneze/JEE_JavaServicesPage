public class Utilities {
    public int factorial(int number) {
        int factorial = 1;
        for(int i = 0; i <= number; i++) {
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