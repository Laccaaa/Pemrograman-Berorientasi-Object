package pertemuankedua;
public class Utama{
    public static void main(String[] args){
        
        System.out.println("LKMM Pra-TD");        
        PraTd lkmmPraTd = new PraTd();
        lkmmPraTd.durasi();
        System.out.println("");
        
        System.out.println("LKMM TD");
        TingkatDasar lkmmTd = new TingkatDasar();
        System.out.println(lkmmTd.getSelenggarakanKegiatan());
        System.out.println("");
        
        System.out.println("LKMM TM");
        TingkatMenengah lkmmTm = new TingkatMenengah();
        System.out.println(lkmmTm.getSelenggarakanKegiatan());
        System.out.println(lkmmTm.getKoordinasiTim());
        System.out.println("");
        
        System.out.println("Casting LKMM TM to LKMM PP");
        TingkatMenengah lkmmPp = (TingkatMenengah) lkmmTm;
        lkmmPp.durasi();
        System.out.println("");

        System.out.println("Interface");
        MahasiswaLkmm meilasya = new MahasiswaLkmm("meilasya");
        meilasya.durasiLkmm();
        meilasya.melaporkanProgress();
        meilasya.mengevaluasiKegiatan();
        meilasya.memanduLkmm();
    }
} 