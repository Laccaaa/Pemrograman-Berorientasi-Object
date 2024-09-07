
package pertemuankedua;

public class MahasiswaLkmm extends TingkatMenengah implements EvaluasiKegiatan, LaporanProgres, Pemandu{
    
    public MahasiswaLkmm(String nama){
        super.setKoordinasiTim("tim 9");
        System.out.println("Aku mahasiswa yang sedang LKMM, namaku " + nama + " aku mengkoordinasikan " + getKoordinasiTim());
    }
    
    public void durasiLkmm(){
        this.durasi();
        super.durasi();
    }
    
    @Override
    
     public void durasi(){
        System.out.println("Memiliki durasi selama 40 jam");  
    } 
    @Override
    public void mengevaluasiKegiatan() {
        System.out.println("Aku melakukan evaluasi terhadap kegiatan yang telah dilakukan");    
    }

    @Override
    public void melaporkanProgress() {
        System.out.println("Aku melaporkan progres tim");   
    }

    @Override
    public void memanduLkmm() {
        System.out.println("Aku menjadi pemandu untuk LKMM Pra-TD dan LKMM TD");    
    }
  
}
