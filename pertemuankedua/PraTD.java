package pertemuankedua;

public class PraTD {
    private int durasi;
    public PraTD(){
        this.komunikasi();
    };
    
    public void komunikasi(){
        System.out.println("Berkomunikasi dengan baik");
           
    } 

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        System.out.println("Memiliki durasi selama " + durasi + " jam");
        this.durasi = durasi;
    }
}
