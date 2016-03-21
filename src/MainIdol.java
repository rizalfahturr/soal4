
package mainidol;

import java.util.ArrayList;

public class MainIdol {
    public static ArrayList <Idol> coba=new ArrayList<>();
    public static void main(String[] args) {
    
     
     Idol m1=new Idol();
     Idol m2=new Idol();
     Idol m3=new Idol();
     
     coba.add(m1);
     coba.add(m2);
     coba.add(m3);
     
     m1.setNama("kelvin");
     m1.setTeam("Atkasuki");
     m1.setUmur(20);
     m1.setNilaiPenam(70);
     m1.setNilaiSuara(80);
     m1.setAttitude(86);
     
     m2.setNama("Gara");
     m2.setTeam("Konoha");
     m2.setUmur(17);
     m2.setNilaiPenam(78);
     m2.setNilaiSuara(86);
     m2.setAttitude(80);
     
     m3.setNama("kevin");
     m3.setTeam("Tanpa arah");
     m3.setUmur(20);
     m3.setNilaiPenam(80);
     m3.setNilaiSuara(82);
     m3.setAttitude(78);
     tampil();
     
    }
    public static void tampil(){
        for(int i=0;i<coba.size();i++){
            System.out.println("=========daftar member=========");
            System.out.println("nama member     : "+coba.get(i).getNama());
            System.out.println("umur member     : "+coba.get(i).getUmur());
            System.out.println("team member     : "+coba.get(i).getTeam());
            System.out.println("nilai rata-rata : "+coba.get(i).getNilai());
        }
        
    }
    
}
