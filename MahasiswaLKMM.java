package pertemuankedua;

public class MahasiswaLKMM extends TingkatMenengah implements evaluasiKegiatan, LaporanProgres, Pemandu{
    public MahasiswaLKMM(String nama){
        System.out.println("Aku mahasiswa yang sedang LKMM dan namaku " + nama);
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
    public void memanduLKMM() {
        System.out.println("Aku menjadi pemandu untuk LKMM Pra-TD dan LKMM TD");    
    }
}
