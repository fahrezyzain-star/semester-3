/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

import java.util.Scanner;

/**
 *
 * @author SITI
 */
public class ATMPROSEDURALSCANNER {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo = 1000000;
        int percobaan = 0;
        
        while (true){
            System.out.println("MASUKKAN PIN :");
            int PIN = input.nextInt();
            
            if ( PIN == 12345 ){
                percobaan = 0;
                while (true){
                    System.out.println(" MENU PILIHAN");
                    System.out.println(" 1. saldo");
                    System.out.println(" 2. setor tuai");
                    System.out.println(" 3. tarik tunai");
                    System.out.println(" 4. keluar");
                    System.out.print("Masukkan opsi : ");
                    int pilihan = input.nextInt();
                    if (pilihan == 1){
                        System.out.println("saldoo anda"+saldo);
                        
                        while (true){
                            
                   
                    
            }
        
    }
 }
}
}
}
}