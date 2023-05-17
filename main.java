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
public class main {

    public static Scanner input = new Scanner(System.in);
    public static Member member = new Member();
    public static Karyawan karyawan = new Karyawan();
    public static Barang barang = new Barang();
    public static Transaksi transaksi = new Transaksi();
    public static Laporan laporan = new Laporan();

    public static void main(String[] args) {
        String pilih = "Y";
        while (pilih.equalsIgnoreCase("Y") && pilih.equalsIgnoreCase("y")) {
            //login awal
            System.out.print("Login sebagai (Member/Karyawan): ");
            String login = input.next();

            //login sbg member
            if (login.equalsIgnoreCase("Member")) {
                laporan.laporan(member);

                System.out.print("Apakah kamu terdaftar sbg member (Y/N): ");
                String idMember = input.next();

                if (idMember.equalsIgnoreCase("Y")) {
                    MemberBaru();
                } else if (idMember.equalsIgnoreCase("N")) {
                    System.out.print("Masukkan nama   : ");
                    member.SetNama(input.next());
                    System.out.print("Masukkan alamat : ");
                    member.SetAlamat(input.next());
                    System.out.print("Masukkan telepon: ");
                    member.SetTelepon(input.next());
                    System.out.print("Masukkan saldo  : ");
                    member.setSaldo(input.nextInt());
                    laporan.laporan(member);
                    MemberBaru();
                } else {
                    break;
                }
            } //login sbg karyawan
            else if (login.equalsIgnoreCase("Karyawan")) {
                laporan.laporan(karyawan);

                System.out.print("Apakah kamu terdaftar sbg karyawan (Y/N): ");
                String idKaryawan = input.next();

                if (idKaryawan.equalsIgnoreCase("Y")) {
                    KaryawanBaru();
                } else if (idKaryawan.equalsIgnoreCase("N")) {
                    System.out.print("Masukkan nama   : ");
                    karyawan.SetNama(input.next());
                    System.out.print("Masukkan alamat : ");
                    karyawan.SetAlamat(input.next());
                    System.out.print("Masukkan telepon: ");
                    karyawan.SetTelepon(input.next());
                    System.out.println("\n1.Karyawan \n2.Boss \n3.Manager \nPilih jabatan : ");
                    karyawan.setJabatan(input.nextInt());
                    laporan.laporan(karyawan);
                    KaryawanBaru();
                
                } else {
                    break;
                }

                //eror   
            } else {
                System.exit(0);
            }

            //keluar
            System.out.print("Login ulang (Y) atau Logout (N) : ");
            pilih = input.next();
            System.out.println();

            if (pilih.equalsIgnoreCase("N")) {
                System.exit(0);
            }
        }
    }

    public static void MemberBaru() {
        String n = "Y";
        while (n.equalsIgnoreCase("Y")) {
            transaksi.prosesTransaksi(member, transaksi, barang);
            System.out.print("Lanjut transaksi (Y/N): ");
            n = input.next();

            if (n.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static void KaryawanBaru() {
        System.out.println("Login sebagai karyawan berhasil!!!");
        System.out.print("Masukkan ID: ");
        int IdBaru = input.nextInt();

        System.out.println("Selamat datang " + karyawan.getNama(IdBaru));

    }
}
