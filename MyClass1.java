/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;

/**
 *
 * @author Dante
 */
public class MyClass1 {//awal dari kelas MyClass1
    public static void main(String s[]){ //awal program yang akan dijalankan
        
        //deklarasi variabel a, b, c sebagai tipe data boolean
        boolean a, b, c; 
        //memyimpan data true kedalam semua variabel
        a = b = c = true; 
        
        //penggunaan operator logika untuk menentukan if executed
        if( !a || ( b && c ) ) //apakah hasil dari negasi a atau (b dan c) = true
        { 
        System.out.println("If executed"); //jika benar, maka tampilkan "If executed"
        } 
        else 
        { 
        System.out.println("else executed"); //jika salah, maka tampilkan "else executed"           
        } 
        }
}
