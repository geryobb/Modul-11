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
public class nomor1 {//awal dari kelas nomor1
    public static void main(String[] args) {//awal program yang akan dijalankan
        //Algoritma
        //memasukkan bilangan lewat keyboard
        //menentukan apakah bilangan tersebut merupakan bilangan genap atau ganjil melalui operator modulo
        //menampilkan apakah bilangan tersebut genap atau ganjil melalui fungsi if
        
            //mengimplementasikan Scanner supaya pengguna bisa menginputkan data yang mereka inginkan
            Scanner dante = new Scanner(System.in);
            
            //deklarasi variabel bilangan sebagai integer
            int bilangan;
            
            //meminta input bilangan dari pengguna kemudian menyimpannya kedalam variabel bilangan yang bertipe data integer
            System.out.println("Masukkan bilangan anda: ");
            bilangan = dante.nextInt();
            
             //penggunaan operator logika untuk menentukan apakah variabel bilangan merupakan bilangan genap atau ganjil
            if (bilangan%2==0){//apakah bilangan dimodulo 2 sisanya 0
                System.out.println("Bilangan Genap");//jika benar, maka tampilkan "bilangan Genap"
                
            } else {//jika salah, maka tampilkan "Bilangan Ganjil"
                System.out.println("Bilangan Ganjil");
            }    
    }
}