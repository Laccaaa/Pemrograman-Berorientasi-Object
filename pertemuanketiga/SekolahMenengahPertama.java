/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author Lenovo
 */
public class SekolahMenengahPertama extends SekolahDasar implements Bimbel, Tpq {
    
    public void guruMapel(){
        System.out.println("Satu guru satu mapel");
    }
    
    @Override
    public void bimbinganBelajar(){
        System.out.println("Tambahan belajar diluar jam sekolah");
    }
    
    @Override
    public void menggaji(){
        System.out.println("Menggaji di TPQ");
    }
    
    @Override
    public void belajar() {
        System.out.println("Belajar sejak sekolah dasar");
    }

    
}
