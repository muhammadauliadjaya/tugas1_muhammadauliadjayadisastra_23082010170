package tugasperulangan;
import java.util.Scanner;
public class perulanganbersarang {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("masukkan jumlah baris");
        int n = s.nextInt();
        for (int i = -1; i < n; i++){
            System.out.print(i + 2 + " ");
        }
    }
}
