/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanpertama;
/**
 *
 * @author LENOVO
 */
public class Aves extends Animalia{
    private String warnaBulu;
    private String alatMakan;

    public Aves(){
        this.warnaBulu = "";
        this.alatMakan = "";
    }
    
    public String getWarnaBulu() {
        System.out.print("Aku memiliki bulu yang berwarna "); 
        return warnaBulu;
    }

    public void setWarnaBulu(String warnaBulu) {       
        this.warnaBulu = warnaBulu;
    }

    public String getAlatMakan() {
        System.out.print("Aku mengunyah makanan menggunakan ");
        return alatMakan;
    }

    public void setAlatMakan(String alatMakan) {
        this.alatMakan = alatMakan;
    }
}
