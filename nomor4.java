/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;
import java.util.Scanner;//mengimpor class java.util yang mengandung alat scanner
/**
 *
 * @author Dante
 */
public class nomor4 {//awal dari kelas nomor4
    public static void main(String[] args) {//awal program yang akan dijalankan
        //Algoritma
        //masukkan jumlah barang yang dibeli
        //diskon ditentukan jika total harga bayar minimal 1 juta
        //rumus diskon = harga bayar - (harga bayar*diskon)
        
        //deklarasi variabel hargaAkhir dan hargaBayar sebagai tipe data double, serta variabel jumlahBarang sebagai integer
        double hargaAkhir, hargaBayar;
        int jumlahBarang;
        
        //mengimplementasikan Scanner supaya pengguna bisa menginputkan data yang mereka inginkan
        Scanner dante = new Scanner(System.in);
        
        //memimta input jumlah barang yang dibeli dari pengguna kemudian menyimpannya kedalam variabel jumlahBarang
        System.out.println("Berapa barang yang kamu beli: ");
        jumlahBarang = dante.nextInt();
        
        //rumus menghitung harga bayar dari pembelian, setiap barang berharga Rp 100.000
        hargaBayar = jumlahBarang*100000;
        
        //penggunaan operator logika untuk menentukan apakah pengguna layak menerima diskon
        if (hargaBayar>=1000000){//apakah harga bayar lebih besar atau sama dengan Rp 1.000.000
            hargaAkhir = hargaBayar-(hargaBayar*0.1);//jika benar, maka potong harga bayar dengan dikon 10% kemudian simpan hasil tersebut kedalam variabel hargaAkhir
            
        } else {//jika salah, maka simpan nilai variabel hargaBayar kedalam variabel hargaAkhir
            hargaAkhir=hargaBayar;
        }
        System.out.println("Harga akhir yang harus dibayar adalah: "+hargaAkhir);//tampilkan "Harga akhir yang harus dibayar adalah: " beserta variabel 
    }
}
