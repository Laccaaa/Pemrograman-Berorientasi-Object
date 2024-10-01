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
1. Buat entitas **buku** dengan atribut **ISBN** sebagai _Primary Key_ **Judul Buku, Tahun Terbit, dan Penerbit** pada database.
```sql
CREATE TABLE buku (
ISBN VARCHARA(20) PRIMARY KEY,
judul_buku VARCHAR (100),
tahun_terbit INT,
penerbit VARCHAR(100)
);
```
![Screenshot 2024-10-01 135237](https://github.com/user-attachments/assets/d30abd86-ae40-4e53-8be0-2421f5887ac3)


2. Buat file baru di NetBeans IDE yang berisi JFrame Class dan DbUtils.
![image](https://github.com/user-attachments/assets/1b47d1b2-9a25-44a7-89e4-7443c9f10fa8)

3. Tambahkan koneksi ke database PostgreSQL di dalam proyek.
![image](https://github.com/user-attachments/assets/38065623-48b0-4a7b-a0b0-faf263e3c492)
![image](https://github.com/user-attachments/assets/b46460a2-b548-41c2-b0a7-8099609c481c)

 4. Buat kelas **DbUtils** untuk menangani koneksi ke database.
 ![image](https://github.com/user-attachments/assets/3ff6c02a-4fc3-40cc-adb6-1a410382c555)

5. Desain antarmuka aplikasi pada tab **Design** di NetBeans, menggunakan komponen Swing.
![image](https://github.com/user-attachments/assets/fc431c8c-7199-4806-878b-38d41d9421c1)
 
6. Import library JDBC dan komponen lain yang diperlukan untuk aplikasi.
![image](https://github.com/user-attachments/assets/e1775763-018d-4223-ae1e-876c5b74377a)

7. Tambahkan koneksi database ke dalam JFrame Class, sesuaikan dengan pengaturan database yang digunakan.
``` sql
String driver = "org.postgresql.Driver";
    String koneksi = "jdbc:postgresql://localhost:5432/Database";
    String user = "username";
    String password = "password";
```
![image](https://github.com/user-attachments/assets/51b66520-c197-480b-8cd3-035a9052f904)

8. Buat method **tampil()** untuk menampilkan data dari database ke tabel di aplikasi.
![image](https://github.com/user-attachments/assets/b5dcd144-f5e2-467d-9bfd-614b397930f9)

9. Panggil method **tampil()** di konstruktor JFrame Class agar data otomatis ditampilkan saat aplikasi dibuka.
![image](https://github.com/user-attachments/assets/5b2b6b87-6735-44cf-8d2d-f0521aa38eb7)

10. Buat method **clear()** yang digunakan untuk mengosongkan text field setelah melakukan CRUD.
![image](https://github.com/user-attachments/assets/ed823641-67cb-4a4f-8c5e-770291415e1a)

11. Buat metode **insert()** untuk menambahkan data ke database melalui aplikasi.
![image](https://github.com/user-attachments/assets/7edfd379-df76-4562-b8d5-0ee346bd70a9)

12. Klik dua kali tombol "Tambah" di tab **Design** untuk mengarahkan ke source code tombol tersebut.
![image](https://github.com/user-attachments/assets/03e842ed-5a3a-427d-a19f-64703b10d6de)

13. Buat variabel untuk ISBN, judul buku, tahun terbit, dan penerbit. Kemudian, ambil nilai dari masing-masing `TextField` menggunakan metode `getText()` untuk setiap atribut. Setelah itu, panggil metode `insert` untuk memasukkan data, dan terakhir panggil metode `tampil()` untuk menampilkan data di tabel. 
![image](https://github.com/user-attachments/assets/99839198-7498-4491-b54c-c9ce96a5fbb5)

14. Buat method **update()** untuk memperbarui data yang sudah ada di dalam database melalui aplikasi.
![image](https://github.com/user-attachments/assets/a9aae6a0-7e1a-4814-90fa-bcbe4377433a)

15. Klik kanan tabel kemudian pilih **events** pilih **mouse** pilih **mouseClicked** untuk mengarah ke source code mouseClicked.
![image](https://github.com/user-attachments/assets/a633cb24-2cbc-4522-8362-c6495e132ba0)

16. Buat method pada **mouseClicked** untuk memasukkan baris atau record yang dipilih ke dalam `TextField`.
![image](https://github.com/user-attachments/assets/8d4ca27a-cad7-4925-96cb-b0af8185b171)

17. Klik dua kali tombol "Edit" di tab **Design** untuk mengarahkan ke source code tombol tersebut.
![image](https://github.com/user-attachments/assets/54d0cd48-fe95-4b8a-be04-4a2c53f66e8d)

18. Buat method untuk menjalankan tombol "Edit". 
![image](https://github.com/user-attachments/assets/d746ab50-ad38-4cce-ab54-8dc68b402616)

19. Buat method **delete()** untuk menghapus data yang sudah ada di dalam database melalui aplikasi.
![image](https://github.com/user-attachments/assets/5d839785-92a5-49dd-8b08-67482eaaeb2a)

20. Klik dua kali tombol "Hapus" di tab **Design** untuk mengarahkan ke source code tombol tersebut.
![image](https://github.com/user-attachments/assets/442777f8-fa0b-499e-ad91-4ca18a0252fe)

21. Buat method untuk menjalankan tombol "Hapus".
![image](https://github.com/user-attachments/assets/622b2669-ad7c-4396-903f-ef8a70d3e04c)

## **Penggunaan APlikasi**
### Input Data 
1. Masukkan data buku ke dalam `TextField`
   ![image](https://github.com/user-attachments/assets/b96fb7a0-e6fa-49a6-8e18-e1aac373b88c)
2. Klilk tombol "Tambah"
   ![image](https://github.com/user-attachments/assets/7b9e618c-8cf4-4bc9-a53d-dbc2a21b042a)
3. Setelah meng-klik "ok" pada JOption Pane data berhasil dimasukkan kedalam tabel dan `TextField` kembali kosong.
   ![image](https://github.com/user-attachments/assets/8990f179-2bd1-4e1f-a6a7-4999f6c0fcad)

### Update Data
1. Pilih baris yang datanya hendak diperbarui
   ![image](https://github.com/user-attachments/assets/cb0d5949-85c3-47ed-aa9b-1ada70879c9a)
2. Ganti informasi buku yang ada pada `TextField`
   ![image](https://github.com/user-attachments/assets/7c64518f-b87c-4f38-9b65-968336f45de7)
3. Klik tombol "Edit"
   ![image](https://github.com/user-attachments/assets/eb6a2b87-f329-49d3-8b40-342083d79754)
4. Setelah meng-klik "ok" pada JOption Pane data berhasil diperbarui dan `TextField` kembali kosong.
   ![image](https://github.com/user-attachments/assets/a327f3b1-788d-49f7-823d-baced9a0a76a)

### Delete Data
1. Pilih baris yang datanya hendak dihapus
   ![image](https://github.com/user-attachments/assets/9dcae716-8784-45fc-bb6f-3328c461dd1e)
2. Klik tombol "Hapus"
   ![image](https://github.com/user-attachments/assets/960366ba-2885-4475-9b0f-bdd8bec11d12)
3. Setelah meng-klik "ok" pada JOption Pane data berhasil dihapus dari tabel dan `TextField` kembali kosong.
   ![image](https://github.com/user-attachments/assets/bff2ba37-7ecb-48c5-a5d6-31ea5c517a98)

## Kesimpulan
Aplikasi CRUD yang dibuat dengan Java Swing dan PostgreSQL berhasil mengimplementasikan fungsi dasar untuk menambah, menampilkan, memperbarui, dan menghapus data buku dengan efektif. Aplikasi ini juga dilengkapi dengan antarmuka pengguna yang mudah dipahami dan  koneksi yang handal ke database, sehingga memudahkan pengguna dalam mengelola informasi buku.
