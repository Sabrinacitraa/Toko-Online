package TokoOnline;
import java.util.ArrayList;
import java.util.Scanner;

public class Karyawan implements User {
    Scanner input = new Scanner (System.in);
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
    String statusJabatan[] = {"Karyawan", "Bos", "Manager"};
    

    
    public Karyawan(){
        this.namaKaryawan.add("Bruno");
        this.alamat.add("England");
        this.telepon.add("62++11222");
        this.jabatan.add(0);
        
        this.namaKaryawan.add("Mars");
        this.alamat.add("Indonesia");
        this.telepon.add("081233344");
        this.jabatan.add(2);
           
    }
    
     public void setJabatan(int jabatanB){
        this.jabatan.add(jabatanB);
    }
    public int getJabatan(int id){   
       return this.jabatan.get(id);
    }
    
     public String getStatusJabatan(int id){
        return statusJabatan[getJabatan(id)];
    }
     
    public int getJumlahKaryawan(){
       return this.namaKaryawan.size();
    }
    
    
     @Override
   public void SetNama(String nama){
       this.namaKaryawan.add(nama);
   }
    @Override
   public void SetAlamat(String alamatB){
       this.namaKaryawan.add(alamatB);
   }
    @Override
   public void SetTelepon(String teleponB){
       this.namaKaryawan.add(teleponB);
   }
   
    @Override
   public String getNama(int id){
       return this.namaKaryawan.get(id);
   }
    @Override
   public String getAlamat(int idKaryawan){
       return this.alamat.get(idKaryawan);
   }
    @Override
   public String getTelepon(int idKaryawan){
       return this.telepon.get(idKaryawan);
   }    
}
