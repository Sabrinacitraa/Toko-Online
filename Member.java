package TokoOnline;
import java.util.ArrayList;

public class Member implements User {
    
    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    
    public Member(){
        this.namaMember.add("Sabrina");
        this.alamat.add("Sawojajar");
        this.telepon.add("62++11222");
        this.saldo.add(150000);
        
        this.namaMember.add("Citra");
        this.alamat.add("Banyuwangi");
        this.telepon.add("0888133445");
        this.saldo.add(200000);
        
    }
    
    
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    public int getSaldo(int idMember){
        return this.saldo.get(idMember);
    }
    public void editSaldo(int idMember, int saldo){
        this.saldo.add(idMember, saldo);
    }
    public int getJmlMember(){
        return this.saldo.size();
    }
    
    @Override
   public void SetNama(String namaMember){
       this.namaMember.add(namaMember);
   }
    @Override
   public void SetAlamat(String alamat){
       this.alamat.add(alamat);
   }
    @Override
   public void SetTelepon(String telepon){
       this.telepon.add(telepon);
   }
   
    @Override
   public String getNama(int idMember){
       return this.namaMember.get(idMember);
   }
    @Override
   public String getAlamat(int idMember){
       return this.alamat.get(idMember);
   }
    @Override
   public String getTelepon(int idMember){
       return this.telepon.get(idMember);
   }   

   
}
