# JFrame JAVA CRUD


**JFrame JAVA CRUD** adalah aplikasi Java berbasis GUI yang memungkinkan pengguna untuk melakukan operasi CRUD (Create, Read, Update, Delete) terhadap data yang disimpan dalam database. Aplikasi ini dibangun menggunakan NetBeans IDE dan menggunakan komponen JFrame untuk menampilkan antarmuka pengguna.

## Fitur Aplikasi
1. Create - Tambahkan data baru ke dalam database.
2. Read - Tampilkan data dari database ke dalam tabel.
3. Update - Edit data yang sudah ada dalam database.
4. Delete - Hapus data dari database.

## Teknologi Pendukung
- **Java**: Bahasa pemrograman utama yang digunakan untuk logika aplikasi.
- **NetBeans IDE**: IDE yang digunakan untuk membangun GUI dan mengelola proyek.
- **JDBC (Java Database Connectivity)**: Untuk menghubungkan aplikasi dengan database.
- **PostgreSQL** (atau database lain sesuai kebutuhan): Database untuk menyimpan data.

## Instalasi Aplikasi
### Pra-syarat
-**Java JDK** harus sudah diinstal di sistem.

-Pastikan **NetBeans IDE** terpasang dan siap digunakan.

-Siapkan **PostgreSQL** atau database lain yang kompatibel dengan aplikasi.

-Pastikan library JDBC yang mendukung koneksi ke database juga sudah tersedia.

### Langkah Instalasi

**1. Clone atau Unduh Proyek**

```bash
git clone https://github.com/Laccaaa/Pemrograman-Berorientasi-Object.git
cd Pemrograman-Berorientasi-Object/pertemuanlima
```


**2. Buat Database**
- Buat database di PostgreSQL (atau database lain yang kamu gunakan) dengan nama dan tabel yang sesuai, misalnya:


```sql
CREATE TABLE tabel_tugas (
    id_tugas VARCHAR(10) PRIMARY KEY,
    mata_kuliah VARCHAR(100) NOT NULL,
    deskripsi TEXT,
    status VARCHAR(15) CHECK (status IN ('Pending', 'In Progres', 'Completed'))
);
```


**3. Buka Proyek Di NetBeans**
Buka NetBeans IDE, lalu pilih opsi untuk membuka proyek. Arahkan folder proyek yang telah di clone.

**4. Konfigurasi Koneksi Database**
Sesuaikan string koneksi database dengan kredensial dan URL dari database yang kamu gunakan. Contoh:
```java
Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/nama_database", "user", "password");
```

**5. Jalankan Aplikasi**
Setelah semua pengaturan selesai dan disesuaikan, klik tombol **Run** di NetBeans untuk menjalankan aplikasi.

## Penggunaan Aplikasi
-Tambah Data: Isi form input, lalu tekan tombol Tambah untuk memasukkan data ke dalam database.

-Edit Data: Klik baris pada tabel, edit form input, lalu tekan tombol Edit untuk memperbarui data.

-Hapus Data: Klik baris pada tabel, lalu tekan tombol Hapus untuk menghapus data dari database.

-Data akan secara otomatis ditampilkan di tabel setelah menambahkan atau memperbarui data.
