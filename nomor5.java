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
public class nomor5 {//awal dari kelas nomor5
    public static void main(String[] args) {//awal program yang akan dijalankan
        //Algoritma
        //masukkan nilai UTS1, UTS2, UAS
        //nilai total dihitung dengan (UTS1*30%)+(UTS2*30%)+(UAS*40%)
        //nilai akhir berupa huruf yang ditentukan berdasarkan kriteria berikut:
        //A : nilai total ≥ 80
        //B : 65 ≤ nilai total < 80
        //C : 55 ≤ nilai total < 65
        //D :50 ≤ nilai total < 55
        //E : nilai total < 50
        
        //deklarasi variabel uts1, uts2, uas, nilai total sebagai tipe data double
        double uts1,uts2,uas, nilaiTotal;
        
        //mengimplementasikan Scanner supaya pengguna bisa menginputkan data yang mereka inginkan
        Scanner dante = new Scanner(System.in);  
        
        //meminta input dari pengguna kemudian menyimpannya kedalam variabel uts1
        System.out.print("Masukkan nilai UTS1: ");
        uts1 = dante.nextInt();
        
        //meminta input dari pengguna kemudian menyimpannya kedalam variabel uts2
        System.out.print("Masukkan nilai UTS2: ");
        uts2 = dante.nextInt();
        
        //meminta input dari pengguna yang akan disimpan dalam variabel uas
        System.out.print("Masukkan nilai UAS: ");
        uas = dante.nextInt();
        
        //rumus menghitung nilai total yang akan disimpan kedalam variabel nilaiTotal
        nilaiTotal = (uts1*0.3)+(uts2*0.3)+(uas*0.4);
        
        //penggunaan operator logika untuk menentukan klasifikasi nilai akhir yang berupa huruf
        if (nilaiTotal>=80){//apakah nilaiTotal lebih besar atau dama dengan 80
            System.out.println("A");//jika benar, maka tampikan "A"
            
        } else if (65<=nilaiTotal && nilaiTotal<80) {//jika salah, apakah nilaiTotal lebih besar atau sama dengan 65 dan apakah nilaiTotal lebih kecil daripada 80
            System.out.println("B");//jika benar, maka tampilkan"B"
            
        } else if (55<=nilaiTotal && nilaiTotal<65) {//jika salah, apakah nilaiTotal lebih besar atau sama dengan 55 dan apakah nilaiTotal lebih kecil daripada 65
            System.out.println("C");//jika benar, maka tampilkan "C"
            
        } else if (50<=nilaiTotal && nilaiTotal<55) {//jika salah, apakah nilaiTotal lebih besar atau sama dengan 50 dan apakah nilaiTotal lebih kecil daripada 55
            System.out.println("D");//jika benar, maka tampilkan "D"
            
        } else {//jika salah, maka tampilkan "E"
            System.out.println("E");
        }
        
    }
}
