//MAGDALENA LIPIEC
//program obliczający wyskość miesięcznej raty za zakupiony sprzęt
//cena towaru -- 100zl - 10k
//liczba rat -- 6 - 48

public class ObliczRaty {

    static void licz(float cena,  int n){
        //cena; n- liczba rat
        float oprocentowanie, rata;

        if((cena >= 100)&(cena <= 10000) & (n>=6) & (n<= 48)){
            if ((n >= 6) & (n <= 12)) oprocentowanie = (float) 2.5;
            else if ((n >= 13) & (n <= 24)) oprocentowanie = (float) 5;
            else  oprocentowanie = (float) 10;

            rata = cena * oprocentowanie/n;
            System.out.println("Rata za sprzęt wynosi: " + rata);
        }
    }

    public static void  main(String args[]){

        licz(200, 12);
    }
}
