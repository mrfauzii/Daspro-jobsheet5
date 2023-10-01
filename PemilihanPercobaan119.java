import java.util.Scanner;
public class PemilihanPercobaan119 {

    public static void main (String [] args){
        Scanner input19 =new Scanner(System.in);

        System.out.print("Masukan angka: ");
        int angka = input19.nextInt();
        String hasil;

        if (angka % 2 != 0) {
            hasil="Bilangan ganjil";
        }
        else{
            hasil="Bilangan genap";
        }
        System.out.println(angka + " adalah " + hasil);
            
                



    }
} 