/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;

/**
 *
 * @author Dante
 */
public class PrintRelation {//awal dari kelas PrintRelations
    public static void main(String[] args) {//awal program yang akan dijalankan
        
        //deklarasi variabel a dan b dalah hasil dari rumus tersebut
        int a = 7 * 3 + 6 / 2 - 5; 
        int b = 21 - 8 + a % 3 * 11; 
        
        //penggunaan operator logika untuk menentukan relasi atau perbandingan antara variabel a dan variabel b
        if(a < b){ //apakah nilai a lebih besar daripada nilai b
        System.out.println("A is less than B"); //jika benar, maka tampilkan "A is less than B"
        } 
        
        if(a == b){ //apakah nilai a sama dengan nilai b
        System.out.println("A is equal to B"); //jika benar, maka tampilkan "A is equal to B"
        } 
        if(a > b){//apakah nilai a lebih besar daripada nilai b
        System.out.println("A is greater than B"); //jika benar, maka tampilkan "A is greater than B"
        }
    }
}
