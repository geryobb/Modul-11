/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;

import java.util.Scanner; //mengimpor class java.util yang mengandung alat scanner

/**
 *
 * @author Dante
 */
public class nomor2 {//awal dari kelas nomor2
    public static void main(String[] args) {//awal program yang akan dijalankan
        //Algoritma
        //masukkan nama dan usia orang pertama
        //masukkan nama dan usia orang kedua
        //membandingkan apakah usia orang pertama lebih tua dari usia orang kedua
        //jika usia orang pertama lebih tua dari usia rang kedua, maka tampilkan "orang pertama lebih tua dari orang kedua"
        //jika usia orang pertama lebih musa dari usia orang kedua, maka tampilkan "orang pertama lebih muda dari orang kedua"
        
        //mengimplementasikan Scanner supaya pengguna bisa menginputkan data yang mereka inginkan
        Scanner dante = new Scanner(System.in);
        
            //meminta input nama dari pengguna kemudian menyimpanya kedalam variabel nama1 yang merupakan variabel penyimpan tipe data string
            System.out.print("Masukkan nama anda: ");
            String nama1 = dante.nextLine();
            
            //memimta input usia dari pengguna kemudian menyimpannya kedalam variabel usia1 yang merupakan variabel penyimpan tipe data integer
            System.out.print("Masukkan usia anda: ");
            int usia1 = dante.nextInt();
            
            dante.nextLine();//digunakan untuk menghindari overlapping input scanner prompt
            
            //meminta input nama dari pengguna kemudian menyimpannya kedalam variabel nama2 yamg merupakan variabel penyimpan tipe data string
            System.out.print("Masukkan nama anda: ");
            String nama2 = dante.nextLine();
            
            //meminta input usia dari pengguna kemudian menyimpannya kedalam variabel usia2 yang merupakan variabel penyimpan tipe data integer
            System.out.print("Masukkan usia anda: ");
            int usia2 = dante.nextInt();
            
            //penggunaan operator logika untuk menentukan perbandingan usia orang pertama (nama1) dengan usia orang kedua (nama2)
            if (usia1>usia2) {//apakah usia1 lebih tua daripada usia2, 
                System.out.println(nama1+" lebih tua daripada "+nama2); //jika benar maka tampilkan (nama1+" lebih tua daripada "+nama2)
                
            } else if (usia1<usia2) {//jika salah, apakah usia orang pertama (nama1) lebih muda daripada usia orang kedua (nama2), 
                System.out.println(nama1+" lebih muda daripada "+nama2); //jika benar tampilkan (nama1+" lebih muda daripada "+nama2)
                
            } else {//jika salah, maka tampilkan (nama1+" berusia sama dengan "+nama2)
                System.out.println(nama1+" berusia sama dengan "+nama2);
            }
    }
}
