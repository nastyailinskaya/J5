import java.util.Scanner;

class frac {
    public int numerator, denominator;

    public frac(){
        numerator = 1;
        denominator = 1;

    }
    public frac(int n1,int d1) throws Exception{
        if (d1 != 0){
            numerator = n1;
            denominator = d1;
        } else {
            throw new Exception ("В знаменателе не может стоять ноль");

        }
    }
    public void showfrac(){
        System.out.println(numerator + "/" + denominator);
    }
    public void sum(int n1, int d1, int n2, int d2){
        System.out.println("Сумма: " + ((n1*d2+n2*d1) + "/" + (d1*d2)));
    }
    public void sub(int n1, int d1, int n2, int d2){
        System.out.println("Разность: " + ((n1 * d2 - n2 * d1) + "/" + (d1 * d2)));
    }
    public void mul(int n1, int d1, int n2, int d2){
        System.out.println("Произведение: " + ((n1 * n2) + "/" + (d1 * d2)));
    }
    public void seg(int n1, int d1, int n2, int d2){
        System.out.println("Частное: " + ((n1 * d2) + "/" + (d1 * n2)));
    }
}
public class LR5{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        frac frac1 = new frac();
        frac1.showfrac();

        System.out.println("\n" +"Введите целые значения числителя и знаменателя: ");
        frac frac2 = new frac(scanner.nextInt(), scanner.nextInt());
        frac2.showfrac();

        System.out.println("\n" +"СУММА" + "\n" +"Введите целые значения числителя и знаменателя для первой дроби: ");
        frac frac3 = new frac(scanner.nextInt(), scanner.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя для второй дроби: ");
        frac frac4 = new frac(scanner.nextInt(), scanner.nextInt());
        frac3.sum(frac3.numerator, frac3.denominator, frac4.numerator, frac4.denominator );

        System.out.println("\n" +"ВЫЧИТАНИЕ" + "\n" +"Введите целые значения числителя и знаменателя для первой дроби: ");
        frac frac5 = new frac(scanner.nextInt(), scanner.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя для второй дроби: ");
        frac frac6 = new frac(scanner.nextInt(), scanner.nextInt());
        frac5.sub(frac5.numerator, frac5.denominator, frac6.numerator, frac6.denominator );

        System.out.println("\n" +"УМНОЖЕНИЕ" + "\n" +"Введите целые значения числителя и знаменателя для первой дроби: ");
        frac frac7 = new frac(scanner.nextInt(), scanner.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя для второй дроби: ");
        frac frac8 = new frac(scanner.nextInt(), scanner.nextInt());
        frac7.mul(frac7.numerator, frac7.denominator, frac8.numerator, frac8.denominator );

        System.out.println("\n" +"ДЕЛЕНИЕ" + "\n" +"Введите целые значения числителя и знаменателя для первой дроби: ");
        frac frac9 = new frac(scanner.nextInt(), scanner.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя для второй дроби: ");
        frac frac10 = new frac(scanner.nextInt(), scanner.nextInt());
        frac9.seg(frac9.numerator, frac9.denominator, frac10.numerator, frac10.denominator );

        scanner.close();
    }
}