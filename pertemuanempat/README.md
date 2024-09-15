Pada project ini, saya membahas beberapa fitur penting dalam pengembangan aplikasi berbasis Java, yaitu operasi dasar pada database menggunakan **Java CRUD**, penanganan kesalahan (Exception Handling) menggunakan **`Try-Catch`** dan **`Throws`**, serta penerapan **Custom Exception** untuk penanganan error yang lebih spesifik dan sesuai kebutuhan.


**Java CRUD**

CRUD adalah singkatan dari **Create**, **Read**, **Update**, dan **Delete**, yang merupakan empat operasi dasar dalam pengelolaan data pada database. Dalam project ini, saya  mengkoneksikan Java dengan database menggunakan JDBC (Java Database Connectivity) untuk menjalankan operasi-operasi tersebut. Berikut adalah operasi yang diimplementasikan:
- **Create**: Menambahkan data baru ke database.
- **Read**: Membaca dan menampilkan data dari database.
- **Update**: Memperbarui data yang ada dalam database.
- **Delete**: Menghapus data dari database.


**Try-Catch**

Try-Catch adalah sebuah blok kode yang digunakan untuk menangani error pada saat program berjalan. Dalam project ini, saya menggunakan kasus **InputMismatchException**. Jika input yang dimasukkan bukan tipe data `integer`, maka program akan menampilkan pesan error dan tidak menghentikan jalannya program.


**Throws**

Throws adalah cara lain untuk menangani exception di Java. Dengan throws, program tetap akan dijalankan meskipun terjadi kesalahan, tetapi jika kesalahan tersebut muncul, program akan berhenti dan menampilkan pesan error. Dalam project ini, kami menggunakan **InputMismatchException** untuk melihat perbedaan antara Try-Catch dan Throws.


**Perbedaan utama**: 

  - Try-Catch: Jika terjadi kesalahan, pengguna diminta untuk input ulang, dan program terus berjalan.
  - Throws: Jika terjadi kesalahan, pesan error ditampilkan dan program dihentikan.

**Custom Exception**
Custom Exception adalah mekanisme di Java yang memungkinkan kita membuat exception sendiri sesuai dengan kebutuhan aplikasi. Dengan custom exception, kita dapat memberikan pesan error yang lebih spesifik dan sesuai kebutuhan. Custom Exception biasanya digunakan untuk menangani kasus-kasus yang tidak dapat ditangani oleh exception bawaan Java.

