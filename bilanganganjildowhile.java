package tugasperulangan;
import java.util.Scanner;
    public class bilanganganjildowhile {
     public static void main(String[] args){
     Scanner s = new Scanner(System.in);
         System.out.println("program untuk menampilkan bilangan ganjil dari 0 hingga n");
         System.out.println("masukkan bilangan n");
        int n = s.nextInt();
         System.out.println("hasil bilangan ganjil menggunakan do-while : ");
            int i =1;
            do{
                System.out.print(i + "");
                i+= 2;
            }while (i<=n);
            }
     
}
