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
public class Nomor3 {//awal dari kelas Nomor3
    public static void main(String[] args) {//awal program yang akan dijalankan
        //Algoritma
        //Masukkan tinggi dan berat badan user
        //Jika 90 ≤ ( tinggi badan - berat badan) ≤ 110 maka berat badan ideal
        //Jika ( tinggi badan – berat badan ) < 90 maka terlalu gemuk
        //Jika (tinggi badan – berat badan) > 110 maka terlalu kurus
        
        //deklarasi variabel tinggi dan beratBadan sebagai tipe data interger
        int tinggi, beratBadan;
        
        //mengimplementasikan Scanner supaya pengguna bisa menginputkan data yang mereka inginkan
        Scanner dante = new Scanner(System.in);
        
        //memimta input tinggi badan dari pengguna kemudian menyimpannya kedalam variabel tinggi
        System.out.println("Masukkan tinggi anda: ");
        tinggi = dante.nextInt();
        
        //memimta input berat badan dari pengguna kemudian menyimpannya kedalam variabel beratBdan
        System.out.println("Masukkan berat badan anda: ");
        beratBadan = dante.nextInt();
        
        //penggunaan operator logika untuk menentukan perbandingan antara berat badan dengan berat badan ideal. rumus berat ideal (tinggi-berat badan)
        if (90<=(tinggi-beratBadan)&& (tinggi-beratBadan)<=110){//apakah berat ideal lebih besar atau sama dengan 90 dan apakah berat ideal lebih kecil atau sama dengan 110,
            System.out.println("Berat badan anda ideal");//jika benar, maka tampilkan "Berat badan anda ideal"
            
        } else if((tinggi-beratBadan)<90){//jika salah, apakah berat ideal lebih kecil dari 90
            System.out.println("Anda terlalu kurus");//jika benar, maka tampilkan "Anda terlalu kurus"
            
        } else {//jika salah, maka tampilkan "Anda terlalu gemuk"
            System.out.println("Anda terlalu gemuk");
        }
    }
}
