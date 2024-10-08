![image](https://github.com/user-attachments/assets/90bbc431-1b1d-48dc-a978-16e21f0ea0e3)# Aplikasi CRUD Sederhana, Java Swing + PostgreSQL
Java Swing CRUD adalah aplikasi sederhana yang menggunakan JFrame untuk melakukan operasi Create, Read, Update, dan Delete dengan PostgreSQL sebagai basis datanya. Program ini dibuat sebagai Ujian Tengah Semester mata kuliah Pemrograman Berorientasi Objek. Dalam program ini menggunakan studi kasus Mata Kuliah dengan atribut KodeMk, SKS, namaMk dan SemesterAjar.

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
1. Buat entitas **MataKuliah** dengan atribut **KodeMK** sebagai _Primary Key_ **SKS, NamaMk, dan SemesterAjar** pada database.
```sql
CREATE TABLE MataKuliah (
    KodeMK VARCHAR(50) PRIMARY KEY,
    SKS INT,
    NamaMK VARCHAR(225),
    SemesterAjar INT
);
```
![image](https://github.com/user-attachments/assets/fc2b86b2-9a64-49d3-8ce2-2735424215c8)

2. Buat file baru di NetBeans IDE yang berisi JFrame Class dan DbUtils.
  ![image](https://github.com/user-attachments/assets/96184003-1783-46a0-b154-11676d938eda)
 ![image](https://github.com/user-attachments/assets/b7ce3e3e-c92a-4a55-9859-5b507409962c)

3. Tambahkan koneksi ke database PostgreSQL di dalam proyek.
   ![image](https://github.com/user-attachments/assets/6aced16f-dbef-485d-b74f-44f31c8b3f34)

 4. Buat kelas **DbUtils** untuk menangani koneksi ke database. Ambil Sourcecode pada file di github ini.
    ![image](https://github.com/user-attachments/assets/fcb4c9e7-dc6d-427d-b1d6-7d32f65b7c8d)
    
5. Desain antarmuka aplikasi pada tab **Design** di NetBeans, menggunakan komponen Swing.
   ![image](https://github.com/user-attachments/assets/2413578b-9eb7-4a0e-b445-c3ebcd85ece0)
   
6. Import library JDBC
 ![image](https://github.com/user-attachments/assets/3aec6529-6669-49f9-8fb2-f77eeb4ec25b)

7. Masukkan sourcode Uts_Pbo untuk menjalankan CRUD.
   ![image](https://github.com/user-attachments/assets/f3ff1d58-91ae-458e-8781-2a8a766406da)

## **Penggunaan APlikasi**
### Input Data
1. ![image](https://github.com/user-attachments/assets/8e4a7bda-f6e9-491e-9c3d-3faef4cecadb)
2. ![image](https://github.com/user-attachments/assets/de7b0d95-0462-48fe-9253-fa34dd385086)
3. ![image](https://github.com/user-attachments/assets/f7667554-2fd2-4cbe-966a-1aa38182ca3b)

### Update Data
1. ![image](https://github.com/user-attachments/assets/0c7fb8d7-e848-48d3-babe-7865e4f2777f)
2. ![image](https://github.com/user-attachments/assets/2f5274b6-8e55-474e-a13f-96303b638975)
3. ![image](https://github.com/user-attachments/assets/bc1e3667-127e-4a67-92a8-0e5f85f7fa55)

### Delete Data
1. ![image](https://github.com/user-attachments/assets/4b30ea60-e1f0-4beb-8a46-383a3d001843)
2. ![image](https://github.com/user-attachments/assets/7c4f668a-cdad-4ff3-9076-bc105db72d88)
3. ![image](https://github.com/user-attachments/assets/bbcaefe6-e4e1-4b35-8176-96dc20608624)











