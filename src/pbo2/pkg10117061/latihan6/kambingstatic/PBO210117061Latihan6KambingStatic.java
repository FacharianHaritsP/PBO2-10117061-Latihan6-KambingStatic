/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan6.kambingstatic;

/**
 *
 * @author Fachrian Harits Pratama
 * Nama                 : Fachrian Harits Pratama
 * Kelas                : PBO2
 * NIM                  : 10117061
 * Deskripsi program    : Program ini berisi program  menggabungkan dua class
 */

public class PBO210117061Latihan6KambingStatic {
    //NAMA_kambing sebagai konstanta
    public static final String Nama_Kambing = " ou-sama ";  
    
    public static void main(String[] args) {
      Mamalia.jumlahKambing = 485000;
        System.out.println(Nama_Kambing + " memiliki kambing sebanyak "
                            + Mamalia.jumlahKambing);
    }
    
}
