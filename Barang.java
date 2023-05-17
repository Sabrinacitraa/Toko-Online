/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoOnline;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Barang {
    ArrayList<String> namaBarang = new ArrayList<String>();
    ArrayList<Integer> stok = new ArrayList<>();
    ArrayList<Integer> harga = new ArrayList<Integer>();

    public Barang(){
        
        namaBarang.add("Ciptadent");
        stok.add(40);
        harga.add(10000);

        
        namaBarang.add("Pepsodent");
        stok.add(20);
        harga.add(35000);

        
        namaBarang.add("Facewashis");
        stok.add(10);
        harga.add(50000);


    }

    public int removeBarang(int id){
        namaBarang.remove(id);
        stok.remove(id);
        harga.remove(id);
        return 0;
    }
    public int getJmlBarang(){
        return namaBarang.size();
    }

    public void setNamaBarang(String newNamaBarang){
        namaBarang.add(newNamaBarang);
    }

    public String getNamaBarang(int idBarang){
        return namaBarang.get(idBarang);
    }

    public void setStok(int newStok){
        stok.add(newStok);
    }

    public int getStok(int idBarang){
        return stok.get(idBarang);
    }

    public void editStok(int idBarang, int newStok){
        stok.set(idBarang, newStok);
    }

    public void setHarga(int newHarga){
        harga.add(newHarga);
    }

    public int getHarga(int idBarang){
        return harga.get(idBarang);
    }
}
    

