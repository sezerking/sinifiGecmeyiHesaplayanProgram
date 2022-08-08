import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;

        Scanner scn = new Scanner(System.in);

        System.out.println("matematik notunuz: ");
        mat=scn.nextInt();

        System.out.println("fizik notunuz: ");
        fizik=scn.nextInt();

        System.out.println("Turkce notunuz: ");
        turkce=scn.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya=scn.nextInt();

        System.out.println("Muzik notunuz: ");
        muzik=scn.nextInt();

        double avg=(mat+fizik+turkce+kimya+muzik)/5;
        if (mat>100 || mat<0){
            avg=(fizik+turkce+kimya+muzik)/5;
        }
        if (fizik>100 || fizik<0){
            avg=(mat+turkce+kimya+muzik)/5;
        }
        if (turkce>100 || turkce<0){
            avg=(fizik+mat+kimya+muzik)/5;
        }
        if (kimya>100 || kimya<0){
            avg=(fizik+turkce+mat+muzik)/5;
        }
        if (muzik>100 || muzik<0){
            avg=(fizik+turkce+kimya+mat)/5;
        }

        if (avg<=55){
            System.out.println("Sinifta kaldiniz, seneye tekrar gorusmek uzere!\nOrtalamaniz: "+avg);
        }
        else {
            System.out.println("Tebrikler sinifi gectiniz!\nOrtalamaniz: "+avg);
        }

    }
}
