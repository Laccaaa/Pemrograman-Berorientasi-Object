/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PresistencePU");
        EntityManager em = emf.createEntityManager();
 
        em.getTransaction().begin();
        
        Matakuliah satu = new Matakuliah();
        satu.setKodemk("MK001");
        satu.setSks(3);
        satu.setNamamk("Pemrograman Dasar");
        satu.setSemesterajar(1);
        em.persist(satu);
        
        Matakuliah dua = new Matakuliah();
        dua.setKodemk("MK002");
        dua.setSks(2);
        dua.setNamamk("Matematika Diskrit");
        dua.setSemesterajar(1);
        em.persist(dua);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
