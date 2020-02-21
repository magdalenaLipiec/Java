//MAGDALENA LIPIEC, 2019
//POWER

public class Power {
    static int power(int val, int p){
        int result = 1;

        for(int i = 1; i <= p; i++) result *= val;

        return result;
    }
    public static void main(String args[]){
        System.out.println(power(6,2));
    }
}
