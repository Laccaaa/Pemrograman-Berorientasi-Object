/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanempat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ToDoList {
    
    Connection conn;
    Statement stmt;
    PreparedStatement pstmt;

    String driver = "org.postgresql.Driver";
    String koneksi = "jdbc:postgresql://localhost:5432/Daftar Tugas";
    String user = "postgres";
    String password = "cantikitu5";
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(inputStreamReader);
    
    public void tambahTugas() {
        try {
            // TODO code application logi
            Class.forName(driver);
            String sql = "INSERT INTO tugas VALUES(?,?,?,?)";
            conn = DriverManager.getConnection(koneksi, user, password);
            conn.setAutoCommit(false);
            pstmt = conn.prepareStatement(sql);
            int k = 0;
            boolean selesai = false;
            while (!selesai) {
                System.out.println("MASUKKAN DATA TUGAS");
                System.out.print("ID Tugas : ");
                String id_tugas = input.readLine().trim();
                System.out.print("Nama Mata Kuliah: ");
                String mata_kuliah = input.readLine().trim();
                System.out.print("Deskripsi Tugas : ");
                String deskripsi = input.readLine().trim();
                System.out.print("Status Tugas : ");
                String status = input.readLine().trim();

                pstmt.setString(1, id_tugas);
                pstmt.setString(2, mata_kuliah);
                pstmt.setString(3, deskripsi);
                pstmt.setString(4, status);
                int n = pstmt.executeUpdate();
                k = n + k;
                System.out.print("ketik 1 untuk melanjutkan ketik 2 untuk selesai ");
                int pilihan = Integer.parseInt(input.readLine().trim());
                if (pilihan == 1) {
                    selesai = false;
                }
                if (pilihan == 2) {
                    selesai = true;

                }
            }
            System.out.println(k + " data telah di input.");
            conn.commit();
            pstmt.close();
            conn.close();

        } catch (ClassNotFoundException | SQLException | IOException ex) {
            System.out.println("Terjadi kesalahan saat memasukkan data tugas: " + ex.getMessage());
            ex.printStackTrace();
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e) {
                System.out.println("Gagal data tugas.");
                e.printStackTrace();
            }
        }
    }
    
    public void tampilTugas() {
        try {
            // TODO code application logi
            Class.forName(driver);
            String sql = "SELECT * FROM tugas";
            conn = DriverManager.getConnection(koneksi, user, password);
            stmt = conn.createStatement();

            while (!conn.isClosed()) {
                ResultSet rs;
                rs = stmt.executeQuery(sql);
                 while (rs.next()) {
            System.out.println(
                rs.getObject(1) + "|" +
                rs.getObject(2) + "|" +
                rs.getObject(3) + "|" +
                rs.getObject(4)
            );
        }
        rs.close();
        stmt.close();
        conn.close();
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ToDoList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ToDoList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void hapusTugas() {
        try {
            Class.forName(driver);
            String sql = "DELETE FROM tugas WHERE id_tugas = ?";
            conn = DriverManager.getConnection(koneksi, user, password);
            pstmt = conn.prepareStatement(sql);
            conn.setAutoCommit(false);
            int k = 0;
            do {
                System.out.print("ID Tugas yang akan dihapus: ");
                String id_tugas = input.readLine().trim();
                pstmt.setString(1, id_tugas);
                int n = pstmt.executeUpdate();
                k = k + n;
                System.out.println("Hapus lagi? (ya/tidak): ");
            } while (input.readLine().trim().equalsIgnoreCase("ya"));

            conn.commit();
            System.out.println(k + "Data tugas berhasil di hapus.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ToDoList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println("Gagal Menghapus Data");
            Logger.getLogger(ToDoList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ToDoList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateTugas() {
        try {
            Class.forName(driver);
            String sql = "UPDATE tugas SET status = ? WHERE id_tugas = ?";
            conn = DriverManager.getConnection(koneksi, user, password);
            pstmt = conn.prepareStatement(sql);
            conn.setAutoCommit(false);
            int k = 0;
            do {
                System.out.print("ID Tugas yang akan diupdate: ");
                String id_tugas = input.readLine().trim();
                System.out.print("Status tugas terkini: ");
                String statusBaru = input.readLine().trim();
                pstmt.setString(1, statusBaru);
                pstmt.setString(2, id_tugas);
                int n = pstmt.executeUpdate();
                k = k + n;
                System.out.println("Update lagi? (ya/tidak): ");
            } while (input.readLine().trim().equalsIgnoreCase("ya"));

            conn.commit();
            System.out.println(k + " data tugas berhasil diperbarui.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ToDoList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println("Gagal Coy");
            Logger.getLogger(ToDoList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ToDoList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void menu() {
        System.out.println("\n========= MENU UTAMA =========");
        System.out.println("1. Input Data");
        System.out.println("2. Tampil Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Update Data");
        System.out.println("0. keluar");
        System.out.print("PILIHAN> ");

        try {
            int pilihan = Integer.parseInt(input.readLine());
            switch (pilihan) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    tambahTugas();
                    break;
                case 2:
                    tampilTugas();
                    break;
                case 3:
                    hapusTugas();
                    break;
                case 4:
                    updateTugas();
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }
        } catch (IOException ex) {
            Logger.getLogger(ToDoList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        new ToDoList().menu();
    }
}
