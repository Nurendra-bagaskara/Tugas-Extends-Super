/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author ASUS
 */
public class Project1 {

    public int umur, pilihan, kembalian, nominal;
    public String nama;

    public static void main(String[] args) {
        // objek untuk memanggil Subclass2
        Subclass2 objek = new Subclass2();
        objek.nama = "Aldo";
        objek.umur = 20;
        objek.panggil();

        //objek untuk pemanggilan Subclass
        Subclass input = new Subclass();

    }

    //konstruktor
    public Project1() {
        System.out.println("========================================");
    }

}
