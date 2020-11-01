/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan21.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama     : Caraka Muhamad Rahman
 * NIM      : 10119058
 * Kelas    : PBOIF2
 * Deskripsi Program : Program ini berisi program untuk menghitung rata-rata nilai.
 * 
 */
public class PBOIF210119058Latihan21ProgramRataRataNilai {
    public static double hitungRataRata(double jumlah, int n){
        double rata = jumlah / n;
        return rata;
    }
    
    public static void main(String[] args) {
        int n;
        double rata,jumlah,nilai;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = input.nextInt();
        jumlah = 0;
        for (int i=1; i <= n; i++){
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            nilai = input.nextInt();
            jumlah += nilai;
        }
        rata = jumlah / n;
        System.out.println("Maka, Rata-rata Nilainya adalah : "+ hitungRataRata(jumlah,n));
        System.out.println("Developed by : Caraka Muhamad Rahman");
    }
    
}