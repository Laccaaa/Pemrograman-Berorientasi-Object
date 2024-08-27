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
public class Plantae extends MakhlukHidup{
    protected String warnaDaun;
    protected String arahDaun;
    private String habitat;

    public Plantae() {
        this.warnaDaun = "";
        this.arahDaun = "";
        this.habitat = "";
    }

    public String getWarnaDaun() {
        System.out.print("Aku memiliki daun yang berwarna ");
        return warnaDaun;
    }


    public void setWarnaDaun(String warnaDaun) {
        this.warnaDaun = warnaDaun;
    }


    public String getArahDaun() {
        return arahDaun;
    }


    public void setArahDaun(String arahDaun) {
        this.arahDaun = arahDaun;
    }

    /**
     * @return the habitat
     */
    public String getHabitat() {
        System.out.print("Habitatku berada di ");
        return habitat;
    }

    /**
     * @param habitat the habitat to set
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
