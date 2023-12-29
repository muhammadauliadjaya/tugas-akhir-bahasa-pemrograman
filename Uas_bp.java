package uas_bp;
import java.util.Scanner;
public class Uas_bp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] hargasewa;
        hargasewa = new int[4];
        hargasewa[0]=280000;hargasewa[1]=400000;hargasewa[2]=300000;hargasewa[3]=375000;
        int menu=0;
        do{
            System.out.println("\nRental mobil pak wawan");
            System.out.println("1.Price list sewa");
            System.out.println("2.Sewa mobil");
            System.out.println("3.Exit");
            System.out.print("Pilih = ");
            menu = s.nextInt();
            switch (menu){
                case 1:
                    System.out.println("1.Brio "+ hargasewa[0]+" per jam");
                    System.out.println("2.Innova " +hargasewa[1]+" per jam");
                    System.out.println("3.Avanza "+hargasewa[2]+" per jam");
                    System.out.println("4.Rush "+hargasewa[3]+ " per jam");
                    break;
                case 2:
                    String penyewa;
                    int jenismobil, jamsewa;
                    System.out.print("Masukkan nama = ");
                    penyewa = s.next();
                    System.out.println("Jenis mobil yang di ingin di sewa");
                    System.out.println("1.Brio");
                    System.out.println("2.Innova");
                    System.out.println("3.Avanza");
                    System.out.println("4.Rush");
                    jenismobil = s.nextInt();
                    if (jenismobil==1){
                        System.out.println("ingin berapa jam anda mensewa mobil ini?");
                        jamsewa = s.nextInt();
                        System.out.println(penyewa+" harga yang harus dibayarkan "+ hargasewa[0]*jamsewa+" terimakasih...");
                    }else if (jenismobil==2){
                        System.out.println("ingin berapa jam anda mensewa mobil ini?");
                        jamsewa = s.nextInt();
                        System.out.println(penyewa+" harga yang harus dibayarkan "+ hargasewa[1]*jamsewa+" terimakasih...");
                    }else if (jenismobil==3){
                        System.out.println("ingin berapa jam anda mensewa mobil ini?");
                        jamsewa = s.nextInt();
                        System.out.println(penyewa+" harga yang harus dibayarkan "+ hargasewa[2]*jamsewa+" terimakasih...");
                    }else if(jenismobil==4){
                        System.out.println("ingin berapa jam anda mensewa mobil ini?");
                        jamsewa = s.nextInt();
                        System.out.println(penyewa+" harga yang harus dibayarkan "+ hargasewa[3]*jamsewa+" terimakasih...");
                    }break;
                case 3 : System.out.println("terimakasih...");
                break;
                default: System.out.println("pilihan tidak ada...");
                    
                    }
                }while(menu!=3);
            }
}