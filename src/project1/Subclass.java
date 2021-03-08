/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */

public class Subclass extends Project1 {
//object scanner
    Scanner input = new Scanner(System.in);

    // konstruktor
    public Subclass() {
        //keyword inheritance
        super();
        //data daftar tujuan
        System.out.println("Daftar Tujuan ");
        System.out.println("1.Tulungagung\t: 30.000\n2.Blitar\t: 40.000\n3.Malang\t: 50.000");
        System.out.println("----------------------------------------");
        System.out.print("Masukan angka pilihan\t: ");
        pilihan = input.nextInt();

        //prcabangan menentukan pilihan
        switch (pilihan) {
            case (1):
                System.out.println("< Pilihan Anda Adalah 1.Tulungagung >");
                System.out.println("Harga Tiket Kereta Adalah\t: 30000 ");
                System.out.print("Masukan nominal uang anda\t: ");
                nominal = input.nextInt();
                //percabangan menentukan kondisi
                if (nominal > 30000) {
                    kembalian = nominal - 30000;
                    System.out.println("Kembalian anda sebesar\t\t: " + kembalian);
                    System.out.println("--------------Terimakasih--------------");
                } else if (nominal == 30000) {
                    kembalian = nominal - 30000;
                    System.out.println("Kembalian anda sebesar\t\t: " + kembalian);
                    System.out.println("--------------Terimakasih--------------");
                } else {
                    System.out.println("<<<< ...Transaksi Gagal... >>>>");
                }
                break;
            case (2):
                System.out.println("< Pilihan Anda Adalah 2.Blitar >");
                System.out.println("Harga Tiket Kereta Adalah\t: 40000 ");
                System.out.print("Masukan nominal uang anda\t: ");
                nominal = input.nextInt();
                //percabangan menentukan kondisi
                if (nominal > 40000) {
                    kembalian = nominal - 40000;
                    System.out.println("Kembalian anda sebesar\t\t: " + kembalian);
                    System.out.println("--------------Terimakasih--------------");
                } else if (nominal == 40000) {
                    kembalian = nominal - 40000;
                    System.out.println("Kembalian anda sebesar\t\t: " + kembalian);
                    System.out.println("--------------Terimakasih--------------");
                } else {
                    System.out.println("<<<< ...Transaksi Gagal... >>>>");
                }
                break;
                case(3):
                    System.out.println("< Pilihan Anda Adalah 3.Malang >");
                System.out.println("Harga Tiket Kereta Adalah\t: 50000 ");
                System.out.print("Masukan nominal uang anda\t: ");
                nominal = input.nextInt();
                //percabangan menentukan kondisi
                if (nominal > 50000) {
                    kembalian = nominal - 50000;
                    System.out.println("Kembalian anda sebesar\t\t: " + kembalian);
                    System.out.println("--------------Terimakasih--------------");
                } else if (nominal == 50000) {
                    kembalian = nominal - 50000;
                    System.out.println("Kembalian anda sebesar\t\t: " + kembalian);
                    System.out.println("--------------Terimakasih--------------");
                } else {
                    System.out.println("<<<< ...Transaksi Gagal... >>>>");
                }
                break;

        }
    }

}
