package pertemuanpertama;

public class Utama {
    public static void main(String[] args) {

    Mamalia unta = new Mamalia();
        System.out.println("Namaku Unta, aku adalah binatang mamalia");
    unta.setKelenjarSusu(2);
    unta.setBerambut("kasar dan tebal");
    unta.setHabitat("padang pasir");
    unta.setJumlahKaki(4);
    unta.setReproduksi("melahirkan");
    unta.bernapas();
    unta.tumbuh();
        System.out.println(unta.getKelenjarSusu());
        System.out.println(unta.getBerambut()); 
        System.out.println(unta.getHabitat());
        System.out.println(unta.getJumlahKaki());
        System.out.println(unta.getReproduksi());
        System.out.println("");
        
    Amphibi katak = new Amphibi();
        System.out.println("Namaku Katak, aku adalah binatang amphibi");
    katak.setJumlahJariKaki(18);
    katak.setJenisKulit("lembap dan berpori");
    katak.setHabitat("tempat yang lembap");
    katak.setJumlahKaki(4);
    katak.setReproduksi("bertelur");
    katak.bernapas();
    katak.tumbuh();
        System.out.println(katak.getJumlahJariKaki());
        System.out.println(katak.getJenisKulit());
        System.out.println(katak.getHabitat());
        System.out.println(katak.getJumlahKaki());
        System.out.println(katak.getReproduksi());
        System.out.println("");
    
    Pisces bandeng = new Pisces();
        System.out.println("Namaku Bandeng, aku adalah binatang pisces");
    bandeng.setWarna("Perak mengkilap");
    bandeng.setAlatNafas("insang");
    bandeng.setHabitat("perairan payau");
    bandeng.setJumlahKaki(0);
    bandeng.setReproduksi("bertelur");
    bandeng.bernapas();
    bandeng.tumbuh();
        System.out.println(bandeng.getWarna());
        System.out.println(bandeng.getAlatNafas());
        System.out.println(bandeng.getHabitat());
        System.out.println(bandeng.getJumlahKaki());
        System.out.println(bandeng.getReproduksi());
        System.out.println("");
    
    Aves angsa = new Aves();
        System.out.println("Namaku Angsa, aku adalah binatang aves");
    angsa.setWarnaBulu("putih");
    angsa.setAlatMakan("paruh");
    angsa.setHabitat("danau");
    angsa.setJumlahKaki(2);
    angsa.setReproduksi("bertelur");
    angsa.bernapas();
    angsa.tumbuh();
        System.out.println(angsa.getWarnaBulu());
        System.out.println(angsa.getAlatMakan());
        System.out.println(angsa.getHabitat());
        System.out.println(angsa.getJumlahKaki());
        System.out.println(angsa.getReproduksi());
        System.out.println("");
    
    Reptilia komodo = new Reptilia();
        System.out.println("Namaku Komodo, aku adalah binatang reptilia");
        komodo.setGantiKulit(6);
        komodo.setJumlahJantung(1);
        komodo.setHabitat("savana");
        komodo.setJumlahKaki(4);
        komodo.setReproduksi("bertelur");
        komodo.bernapas();
        komodo.tumbuh();
            System.out.println(komodo.getGantiKulit() + " bulan sekali");
            System.out.println(komodo.getJumlahJantung());
            System.out.println(komodo.getHabitat());
            System.out.println(komodo.getJumlahKaki());
            System.out.println(komodo.getReproduksi());
            System.out.println("");
    
    Spermatophyta bungaMatahari = new Spermatophyta();
        System.out.println("Namaku Bunga Matahari, aku adalah tumbuhan dengan golongan spermatophyta");
    bungaMatahari.setReproduksi("biji");
    bungaMatahari.setUkuran(30);
    bungaMatahari.setWarnaDaun("hijau");
    bungaMatahari.setArahDaun("matahari");
    bungaMatahari.setHabitat("ladang dan kebun");
    bungaMatahari.bernapas();
    bungaMatahari.tumbuh();
        System.out.println(bungaMatahari.getReproduksi());
        System.out.println(bungaMatahari.getUkuran() + " cm");
        System.out.println("Daunku mengarah pada " +bungaMatahari.getArahDaun());
        System.out.println(bungaMatahari.getWarnaDaun());
        System.out.println(bungaMatahari.getHabitat());
        System.out.println("");
        
    Pterydophyta pakuGajah = new Pterydophyta();
        System.out.println("Namaku Paku Gajah, aku adalah tumbuhan dengan golongan pterydophyta");
    pakuGajah.setBentukDaun("seperti kipas");
    pakuGajah.setWarnaDaun("hijau");
    pakuGajah.setArahDaun("sekeliling pucuk batang");
    pakuGajah.setHabitat("hutan tropis");
    pakuGajah.bernapas();
    pakuGajah.tumbuh();
        System.out.println(pakuGajah.getBentukDaun());
        System.out.println(pakuGajah.getWarnaDaun());
        System.out.println("Daunku mengarah pada " +pakuGajah.getArahDaun());
        System.out.println(pakuGajah.getHabitat());
        System.out.println("");
        
    Bryophyta lumutHati = new Bryophyta();
        System.out.println("Namaku Lumut Hati, aku adalah tumbuhan dengan golongan Bryophyta");
    lumutHati.setKembangBiak("spora");
    lumutHati.setUmur(3);
    lumutHati.setWarnaDaun("Hijau");
    lumutHati.setArahDaun("menyebar");
    lumutHati.setHabitat("tanah lembap");
    lumutHati.bernapas();
    lumutHati.tumbuh();
        System.out.println(lumutHati.getKembangBiak());
        System.out.println(lumutHati.getUmur() + " tahun");
        System.out.println(lumutHati.getWarnaDaun());
        System.out.println(lumutHati.getArahDaun());
        System.out.println(lumutHati.getHabitat());
        System.out.println("");
    
    }
}
