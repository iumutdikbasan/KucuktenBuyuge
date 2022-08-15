import java.util.Scanner;

public class main {
    public static void main(String[] args){

        int a,b,c;

        Scanner inp = new Scanner(System.in);

        System.out.println("A sayisini giriniz : ");
        a = inp.nextInt();

        System.out.println("B sayisini giriniz : ");
        b = inp.nextInt();

        System.out.println("C sayisini giriniz : ");
        c = inp.nextInt();

        if((a<b) && (a < c)) {
            if (b < c) {
                System.out.println("a<b<c");
            } else {
                System.out.println("b>c>a");
            }
        }
        else if((b<a) &&(b<c)) {
            if (a < c) {
                System.out.println("b<a<c");
            } else {
                System.out.println("b<c<a");
            }
        }
        else if((c>b)&&(c<a)) {
            if (a<b){
                System.out.println("c<a<b");
            }
            else{
                System.out.println("c<b<a");
            }
        }
    }
}
