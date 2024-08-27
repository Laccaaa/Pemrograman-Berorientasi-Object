/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanpertama;

public class Mamalia extends Animalia{
    private int kelenjarSusu;
    private String berambut;

    public Mamalia(){
        this.kelenjarSusu = 0;
        this.berambut = "";
    }

    public int getKelenjarSusu() {
        System.out.print("Aku memiliki kelenjar susu sebanyak ");
        return kelenjarSusu;
    }

    public String getBerambut() {
        System.out.print("Tubuhku memiliki rambut yang ");
        return berambut;
    }

    public void setKelenjarSusu(int kelenjarSusu) {
        this.kelenjarSusu = kelenjarSusu;
    }

    public void setBerambut(String berambut) {
        this.berambut = berambut;
    }

    
}
