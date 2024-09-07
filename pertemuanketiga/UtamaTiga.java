/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author Lenovo
 */
public class UtamaTiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SekolahMenengahAtas smaAwh = new SekolahMenengahAtas();
        smaAwh.cek();
        
        smaAwh.target();
        smaAwh.target("UINSA");
        System.out.println(smaAwh.target(85));
    }
    
}
