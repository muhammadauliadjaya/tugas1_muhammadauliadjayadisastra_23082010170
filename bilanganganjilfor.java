package tugasperulangan;
import java.util.Scanner;
public class bilanganganjilfor {
    public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
        System.out.println("program untuk menampilkan bilangan ganjil dari 0 hingga n");
        System.out.println("masukkan nilai n");
        int n = s.nextInt();
        System.out.println("hasil bilangan ganjil menggunakan for : ");
        for (int i = 1; i <= n; i += 2){
            System.out.print(i + "");
        }
    }
}
