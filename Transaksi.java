/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoOnline;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {

    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idMember = new ArrayList<Integer>();

    public void setTransaksi(Barang barang, int idMember, int idBarang, int banyak) {
        this.idMember.add(idMember);
        this.idBarang.add(idBarang);
        this.banyak.add(banyak);
        barang.editStok(idBarang, barang.getStok(idBarang) - banyak);
    }

    public int prosesTransaksi(Member member, Transaksi transaksi, Barang barang) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t===============Silahkan belanja================");
        System.out.print("Masukkan id member : ");
        int idMember = input.nextInt();

        System.out.println("\t\tSelamat datang " + member.getNama(idMember));
        
        ArrayList<Integer> idBarang = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();

        int i = 0;
        Laporan laporan = new Laporan();
        laporan.laporan(barang);
        System.out.println("Masukkan kode barang : ");
        int kode = input.nextInt();
        idBarang.add(kode);
        System.out.println(barang.getNamaBarang(idBarang.get(i)) + " sebanyak : ");
        banyak.add(input.nextInt());

        int a = idBarang.size();
        for (int l = 0; l < a; l++) {
            if (barang.getStok(idBarang.get(l)) < banyak.get(l)) {
                System.out.println("Maaf stok kami tidak memenuhi");
                System.exit(0);
            }
        }
        int total = 0;
        int x = idBarang.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * barang.getHarga(idBarang.get(j));
            total += jumlah;
            if (member.getSaldo(idMember) < jumlah) {
                System.out.println("Maaf saldo anda kurang");
                System.out.println("1.Tambah saldo \n2.Hentikan transaksi \n= ");
                int saldo = input.nextInt();

                switch (saldo) {
                    case 1:
                        System.out.println("Masukkan saldo baru : ");
                        int saldoBaru = input.nextInt();
                        member.editSaldo(idMember, saldoBaru);
                        laporan.laporan(member);
                        break;

                    case 2:
                        break;
                }
            } else {
                System.out.println("Transaksi belanja " + member.getNama(idMember) + " sebagai berikut : ");
                System.out.println("Nama barang\tSatuan\tHarga");
                System.out.println(barang.getNamaBarang(idBarang.get(j)) + "\t" + barang.getHarga(idBarang.get(j)) + "\t" + jumlah);
                transaksi.setTransaksi(barang, idMember, idBarang.get(j), banyak.get(j));
                System.out.println("--------------------------------------------------------");
                System.out.println("Total : " + jumlah);
                System.out.println("saldo : " + member.getSaldo(idMember));
                int sisaSaldo = member.getSaldo(idMember) - jumlah;
                member.editSaldo(idMember, sisaSaldo);
                System.out.println("Sisa saldo : " + member.getSaldo(idMember));

            }
        }
        return 0;
    }

    public int getIdBarang(int id) {
        return this.idBarang.get(id);
    }

    public int getIBanyaknya(int id) {
        return this.banyak.get(id);
    }

    public int getIdMember(int id) {
        return this.idMember.get(id);
    }

    public int getJmlTransaksi() {
        return this.idMember.size();
    }
}
