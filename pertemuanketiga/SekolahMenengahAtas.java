/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author Lenovo
 */
public class SekolahMenengahAtas extends SekolahMenengahPertama {
   
    @Override
    public void guruMapel(){
        System.out.println("Seorang guru mengajar 1 mata pelajaran");
    }
    
    public void peminatan(){
        System.out.println("Satu mapel dipecah menjadi mapel wajib dan minat");
    }
    
    public void target(){
        System.out.println("Mendapatkan pekerjaan setelah lulus");
    }
    public void target(String kuliah){
        System.out.println("Masuk perguruan tinggi");
    }
    public String target(int nilai){
        return "nilai minimal " + String.valueOf(nilai);
    }
    
    public void cek(){
        guruMapel();
        this.guruMapel();
        super.guruMapel();
        System.out.println("  ");
        this.belajar();
        this.berhitung();
    }
}
