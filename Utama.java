package pertemuankedua;
public class Utama{
    public static void main(String[] args){
        
        System.out.println("LKMM Pra-TD");        
        PraTD LkmmPraTD = new PraTD();
        LkmmPraTD.setDurasi(14);
        System.out.println("");
        
        System.out.println("LKMM TD");
        TingkatDasar LkmmTD = new TingkatDasar();
        LkmmTD.setDurasi(22);
        System.out.println(LkmmTD.getSelenggarakanKegiatan());
        System.out.println("");
        
        System.out.println("LKMM TM");
        TingkatMenengah LkmmTM = new TingkatMenengah();
        System.out.println(LkmmTM.getSelenggarakanKegiatan());
        System.out.println(LkmmTM.getKoordinasiTim());
        System.out.println("");
        
        System.out.println("Casting LKMM TM to LKMM TL");
        TingkatMenengah LkmmTL = (TingkatMenengah) LkmmTM;
        LkmmTL.setDurasi(40);
        System.out.println("");

        System.out.println("Interface");
        MahasiswaLKMM meilasya = new MahasiswaLKMM("meilasya");
        meilasya.melaporkanProgress();
        meilasya.mengevaluasiKegiatan();
        meilasya.memanduLKMM();
            
    }
} 
