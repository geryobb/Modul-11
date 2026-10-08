/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;

/**
 *
 * @author Dante
 */
public class Animals {//awal dari kelas Animals
    public static void main(String[] args) {//awal program yang akan dijalankan
    
        //deklarasi variabel rabbit, donkey, dan leporidae sebagai tipe data boolean
        //menyimpan data kedalam variabel sebagai berikut: 
        boolean rabbit = true; 
        boolean donkey = false; 
        boolean leporidae = true; 
        
        //penggunaan operator logika untuk menentukan relasi antara hewan-hewan 
        if (rabbit & donkey | donkey & leporidae | donkey) //apakah hasil dari (rabbit dan donkey = true) atau (donkey dan leporidae = true) atau (donkey = true) = true
        System.out.print("DOG ");//jika benar, maka tampilkan "DOG"
        
        if (rabbit & donkey | donkey & leporidae | donkey | rabbit)//apakah hasil dari (rabbit dan donkey = true) atau (donkey dan leporidae = true) atau(donkey atau rabbit = true) = true
        System.out.println("CAT ");//jika benar, maka tampilkan "CAT"
    }
}
