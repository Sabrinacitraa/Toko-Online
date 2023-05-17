/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoOnline;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Laporan {
    Scanner input = new Scanner(System.in);
    public void laporan(Barang barang){
        int x = barang.getJmlBarang();
        
        System.out.println();
        System.out.println("Tabel Barang");
        System.out.println();
        System.out.println("Nama Barang \tStok \tHarga");
        for (int i = 0; i < x; i++) {
            System.out.println(barang.getNamaBarang(i) + "\t" + barang.getStok(i)+ "\t" + barang.getHarga(i));      
        }
    }
    
    public void laporan(Member member){
        int x = member.getJmlMember();
        
        System.out.println();
        System.out.println("Tabel Member");
        System.out.println();
        System.out.println("Nama \t\tAlamat \t\tTelepon \t\tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(member.getNama(i)+"\t\t"+member.getAlamat(i)+"\t"+member.getTelepon(i)+"\t"+ member.getSaldo(i));
           
    }   
}
    
     public void laporan(Karyawan karyawan){
        int x = karyawan.getJumlahKaryawan();
        
        
        System.out.println();
        System.out.println("Laporan Karyawan");
        System.out.println();
        System.out.println("Nama \t\tAlamat  \t\tTelepon  \tJabatan ");
 
        for (int i = 0; i < x; i++) {
            System.out.println(karyawan.getNama(i)+"\t"+karyawan.getAlamat(i)+"\t"+karyawan.getTelepon(i)+"\t"+karyawan.getStatusJabatan(i));   
        }
    }
     
    public void laporan(Transaksi transaksi, Barang barang){
        int x = transaksi.getJmlTransaksi();
        
        System.out.println();
        System.out.println("Laporan Transaksi");
        System.out.println();
        System.out.println("nama Barang \tHarga \tJumlah");
        
        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = transaksi.getIBanyaknya(i)*barang.getHarga(transaksi.getIdBarang(i));
            total += jumlah;
            System.out.println(barang.getNamaBarang(transaksi.getIdBarang(i))+"\t"+transaksi.getIBanyaknya(i)+"\t"+barang.getHarga(transaksi.getIdBarang(i))+"\t" + jumlah);      
        }
        System.out.println("Total Omset = " + total);

    }
    
      
    }

