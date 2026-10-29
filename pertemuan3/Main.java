/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

//import pertemuan3.rekening;

/**
 *
 * @author SITI2
 */
   public class Main {
    public static void main(String[] args) {

        DataNasabah dataNasabah = new DataNasabah();

        // Data awal
        dataNasabah.tambahNasabah(
                "Budi",
                "001",
                1000000
        );

        dataNasabah.tambahNasabah(
                "Andi",
                "002",
                500000
        );

        // Membuat object ATM
        ATM atm = new ATM(dataNasabah);

        // Menjalankan ATM
        atm.mulai();
    }
}