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
public class Pterydophyta extends Plantae{
    private String bentukDaun;

    /**
     * @return the bentukDaun
     */
    public String getBentukDaun() {
        System.out.print("Aku memililki daun yang berbentuk ");
        return bentukDaun;
    }

    /**
     * @param bentukDaun the bentukDaun to set
     */
    public void setBentukDaun(String bentukDaun) {
        this.bentukDaun = bentukDaun;
    }
}
