/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoOnline;

/**
 *
 * @author ACER
 */
public interface User {
   public void SetNama(String nama);
   public void SetAlamat(String alamat);
   public void SetTelepon(String telepon);
   
   public String getNama(int id);
   public String getAlamat(int id);
   public String getTelepon(int id);
   
}
