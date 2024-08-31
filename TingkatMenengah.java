package pertemuankedua;

public class TingkatMenengah extends TingkatDasar{
    private  String koordinasiTim;

    public TingkatMenengah(){
        this.koordinasiTim = "Mengkoordinasi dan membina tim kerja dalam suatu kelembagaan";
        super.setDurasi(30);
    }

    public String getKoordinasiTim() {
        return koordinasiTim;
    }


    public void setKoordinasiTim(String koordinasiTim) {
        this.koordinasiTim = koordinasiTim;
    }
}
