/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

//import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Subclass2 extends Project1 {

    //konstruktor danpenerapan parameter
    public void Subclass2(int umur, String nama) {
        this.umur = umur;
        this.nama = nama;
    }

    //method void
    public void panggil() {
        System.out.println("<<<Program pembelian tiket kereta api>>>");
        System.out.println("Atas Nama " + nama);
        System.out.println("Berumur " + umur+" Tahun");
    }

}
