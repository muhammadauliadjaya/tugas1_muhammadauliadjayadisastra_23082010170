package tugasperulangan;
import java.util.Scanner;
        public class bilanganganjilwhile {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("program untuk menampilkan bilangan ganjil dari 0 hingga n");
        System.out.println("masukkan nilai n: ");
        int n = s.nextInt();
        System.out.println("hasil bilangan ganjil menggunakan while : ");
        int i = 1;
        while (i<=n){
            System.out. print(i + "");
            i += 2;
    }
    }
}
