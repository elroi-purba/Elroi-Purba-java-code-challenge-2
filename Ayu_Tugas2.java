import java.util.Scanner;

public class Ayu_Tugas2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nilai;
        System.out.println("Masukkan Nilai : ");
        nilai = scan.nextInt();

        if(nilai >=0 && nilai<= 49){
            System.out.println("Nilai Anda : D+");
        } else if ( nilai>= 50 && nilai <= 54){
            System.out.println("Nilai Anda : C-");
        }else if ( nilai>= 55 && nilai <= 59){
            System.out.println("Nilai Anda : C");
        } else if ( nilai>= 60 && nilai <= 64){
            System.out.println("Nilai Anda : C+");
        } else if ( nilai>= 65 && nilai <= 69){
            System.out.println("Nilai Anda : B-");
        } else if ( nilai>= 70 && nilai <= 74){
            System.out.println("Nilai Anda : B");
        } else if ( nilai>= 75 && nilai <= 79){
            System.out.println("Nilai Anda : B+");
        } else if (nilai>= 80 && nilai <=84){
            System.out.println("Nilai Anda : A-");   
        } else if (nilai>= 85 && nilai <=100) {
            System.out.println("Nilai Anda : A");
        } else if (nilai>= 100) {
            System.out.println("Nilai yang dimasukkan salah");
        }   
    }   
}