import java.util.Scanner;
public class test {
    public static void main(String[] args) {
       int a1, a2;
       double a3;

       Scanner inp = new Scanner(System.in);

       System.out.println("1. kenarin degerini giriniz= ");
       a1 = inp.nextInt();
       System.out.println(a1);

       System.out.println("2. kenarin degerini giriniz= ");
       a2 = inp.nextInt();
       System.out.println(a2);

       a3= Math.sqrt((a1*a1)+(a2*a2));

       System.out.println("Hipotenus= "+ a3);
    }
}
