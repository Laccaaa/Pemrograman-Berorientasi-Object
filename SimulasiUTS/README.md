# **Aplikasi CRUD Sederhana, Java Swing + PostgreSQL**
Java Swing CRUD adalah aplikasi sederhana yang menggunakan JFrame untuk melakukan operasi Create, Read, Update, dan Delete dengan PostgreSQL sebagai basis datanya.
Program ini dibuat sebagai simulasi Ujian Tengah Semester mata kuliah Pemrograman Berorientasi Objek. Dalam program ini menggunakan studi kasus **buku** dengan atribut **ISBN, Judul Buku, Tahun Terbit dan Penerbit**.
## **Fitur Aplikasi**
1. Create: Menambahkan data baru kedalam database
2. Read: Menampilkan data dari database kedalam tabel
3. Update: Edit data yang sudah ada dalam database
4. Delete: Hapus data dari database

## **Teknologi Penunjang**
• **Java:** Bahasa pemrograman utama yang digunakan untuk logika utama aplikasi. 
• **NetBeans IDE:** IDE yang digunakan untuk merancang dan membangun GUI serta mengelola proyek.
• **JDBC (Java Database Connectivity):** Untuk menghubungkan aplikasi dengan database.
• **PostgreSQL:** Database untuk menyimpan data.

## **Pembuatan Aplikasi**
### 1. Buat entitas **buku** dengan atribut **ISBN** sebagai _Primary Key_ **Judul Buku, Tahun Terbit, dan Penerbit** pada database.
```sql
CREATE TABLE buku (
ISBN VARCHARA(20) PRIMARY KEY,
judul_buku VARCHAR (100),
tahun_terbit INT,
penerbit VARCHAR(100)
);
```
![Screenshot 2024-10-01 135237](https://github.com/user-attachments/assets/d30abd86-ae40-4e53-8be0-2421f5887ac3)


### 2. Buat File baru dalam NetBeans IDE yang berisi JFrame Class dan DbUtils
![image](https://github.com/user-attachments/assets/1b47d1b2-9a25-44a7-89e4-7443c9f10fa8)

### 3. Masukkan koneksi ke database
![image](https://github.com/user-attachments/assets/38065623-48b0-4a7b-a0b0-faf263e3c492)
![image](https://github.com/user-attachments/assets/b46460a2-b548-41c2-b0a7-8099609c481c)

 ### 4. Buat DbUtils yang sudah dibuat
 ``` bash

```
 ![image](https://github.com/user-attachments/assets/3ff6c02a-4fc3-40cc-adb6-1a410382c555)

 ### 



