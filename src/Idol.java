
package mainidol;

public class Idol {
    private String nama;
    private String team;
    private int nilaiPenam;
    private int nilaiSuara;
    private int attitude;
    private int nilai;
    private int umur;
  
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setTeam (String team){
       
        this.team=team;
    }
    public void setUmur(int a){
        umur=a;
    }
    public void setNilaiPenam(int a){
        nilaiPenam=a;
        nilai +=nilaiPenam;
       
    }
    public void setNilaiSuara(int a){
        nilaiSuara=a;
        nilai +=nilaiSuara;
   
    }
    public void setAttitude(int a){
        attitude=a;
        nilai+=attitude;
      
    }
    public String getNama(){
        return nama;
    }
    public String getTeam(){
        return team;
    }
    public int getUmur(){
        return umur;
    }
    public int getNilaiPenam(){
        return nilaiPenam;
        
    }
    public int getNilaiSuara(){
        return nilaiSuara;
    }
    public int getAttitude(){
        return attitude;
    }
    public int getNilai(){
        return nilai/3;
    }
   
    
    
}
