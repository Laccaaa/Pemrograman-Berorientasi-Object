Dalam proyek ini, saya mengimplementasikan konsep Object-Oriented Programming (OOP) dalam Java dengan fokus pada Inheritance (pewarisan), Setter dan Getter, Super Class, dan Sub Class. Proyek ini menggunakan struktur Mahkluk Hidup sebagai contoh implementasi dari inheritance.

**Inheritance**

Inheritance adalah mekanisme dalam Java OOP yang memungkinkan sebuah kelas untuk mewarisi atribut dan method dari kelas lain. Kelas yang mewariskan atribut dan method disebut **Superclass**, sementara kelas yang mewarisi disebut **Subclass**.


**Superclass (kelas leluhur)**

Superclass adalah kelas dasar atau leluhur yang menyediakan atribut dan metode yang dapat digunakan oleh kelas turunan. Contoh dalam proyek ini adalah kelas MakhlukHidup, yang merupakan superclass dari kelas-kelas seperti Animalia dan Plantae.

**Subclass (kelas keturunan)**

Subclass adalah kelas yang mewarisi atribut dan metode dari superclass. Contoh dalam proyek ini adalah kelas Animalia, Mamalia, dan Bryophyta, yang merupakan subclass dari MakhlukHidup dan Plantae.


Untuk mengakses atribut dan method java memiliki modifier akses. Berikut adalah penjelasan mengenai modifer akses yang tersedia:
**-Public:** Anggota kelas yang dideklarasikan dengan public dapat diakses dari mana saja, baik dari kelas lain dalam paket yang sama maupun dari paket lain.
**-Protected:** Anggota kelas yang dideklarasikan dengan protected dapat diakses oleh kelas dalam paket yang sama atau oleh kelas yang merupakan subclass dari kelas tersebut.
**-Private:** Anggota kelas yang dideklarasikan dengan private hanya dapat diakses dari dalam kelas itu sendiri. Meskipun private tidak bisa diwariskan langsung, akses ke atribut atau method private dapat dilakukan melalui **getter** dan **setter**.

**Getter dan Setter**

**-Getter:** Merupakan metode yang digunakan untuk mengambil nilai dari atribut private. Getter biasanya memiliki format getNamaAtribut(), dan berfungsi untuk memberikan akses ke nilai atribut tanpa memungkinkan perubahan langsung.

**-Setter:** Merupakan metode yang digunakan untuk mengubah nilai atribut private. Setter biasanya memiliki format setNamaAtribut(namaAtribut), dan berfungsi untuk mengatur nilai atribut dengan kontrol.
