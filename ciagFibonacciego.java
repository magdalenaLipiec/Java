//Magdalena Lipiec
public class Fibonacci {

    public static void fib(int n){

        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i < n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println("Wszystkie wyrazu ciągu do podanej liczby: ");
        for(int i = 0; i < n; i++){
            System.out.println(fib[i]);
        }

        System.out.println("Wartość podanego wyrazu w ciągu:");
        System.out.println(fib[n-1]);
    }

    public static void main(String args[]){
        fib(10);
    }
}
