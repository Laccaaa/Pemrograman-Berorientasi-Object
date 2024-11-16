# Login System  

Ini adalah proyek sederhana untuk membuat sistem login dengan Java Swing. Proyek ini mencakup pembuatan tampilan (GUI) dan fitur seperti login, daftar akun (sign in), serta lupa kata sandi (forgot password). Sistem ini juga terhubung dengan database untuk menyimpan dan mengelola data pengguna.  


---

## 📋 Fitur  

- *Login Form*: Pengguna dapat masuk ke sistem menggunakan akun pengguna yang valid.  
- *Sign In Form*: Pendaftaran pengguna baru dengan menyimpan data username dan password ke database.  
- *Forgot Password Form*: Antarmuka untuk memulihkan kata sandi yang terlupakan.  
- *Tampilan*: Kelola data mata kuliah yang dimasukkan ke dalam sistem database.  

---

## 🚀 Langkah-langkah  

### 1. Desain GUI  
- **Login Form**: Rancang formulir login untuk memvalidasi pengguna.
  ![image](https://github.com/user-attachments/assets/ed849843-ab24-4a68-8c0a-e59798c620ff)
 
- **Sign In Form**: Rancang formulir pendaftaran pengguna.
  ![image](https://github.com/user-attachments/assets/89ef4427-0603-4c10-89b0-cd1c5b4eb18d)
 
- **Forgot Password Form**: Buat antarmuka pemulihan kata sandi.
  ![image](https://github.com/user-attachments/assets/ee33fc1e-1b24-4007-9805-c2788dfe97b1)


### 2. Generate Entity Classes  
Buat kelas entitas dari database untuk persistence data menggunakan fitur `Entity Classes from Database`.  
![image](https://github.com/user-attachments/assets/4296f13f-9bce-49d1-9e75-bdacac36cb4e)


### 3. Impor Kelas yang terdapat CRUD  
Tambahkan kelas `Tampilan`, yang berisi program CRUD sederhana, ke dalam package yang sama dengan formulir login.  
![image](https://github.com/user-attachments/assets/74b47b8f-6d85-4d3a-bf82-df4a9660ba18)


### 4. Tambahkan Import di Kelas Utama  
Sertakan import kelas `Tampilan` pada kelas:  
- `Login`  
- `Sign In`  
- `Forgot Password`
  ![image](https://github.com/user-attachments/assets/d5a2fa49-3bd3-46dd-979f-92b984f040db)
  

### 5. Programkan Fungsi pada Komponen GUI  

#### a. Tombol Login  
- Klik dua kali tombol **Login**.  
- Tambahkan kode sumber untuk memvalidasi pengguna dan mengarahkan ke halaman utama.
  ![image](https://github.com/user-attachments/assets/800a5f6e-aae8-4bb1-9f46-de5d58c28979)
 

#### b. Label Sign In  
- Klik kanan label **Sign In** > **Events > Mouse > mouseClicked**.  
- Tambahkan kode untuk mengarahkan ke frame **Sign In** saat label diklik.  
![image](https://github.com/user-attachments/assets/f0a709cf-6789-415b-af32-d4f7f90fa329)


#### c. Label Forgot Password  
- Klik kanan label **Forgot Password** > **Events > Mouse > mouseClicked**.  
- Tambahkan kode untuk mengarahkan ke form pemulihan kata sandi.
   ![image](https://github.com/user-attachments/assets/e51e8354-0a74-4217-b90d-fa8821b635a0)


#### d. Tombol Create pada Form Sign In  
- Klik dua kali tombol **Create**.  
- Tambahkan kode untuk menyimpan data username dan password ke dalam database.
  ![image](https://github.com/user-attachments/assets/3083132f-e718-46a2-9732-1f605a93d82f)


#### e. Label Login  
- Klik kanan label **Login** > **Events > Mouse > mouseClicked**.  
- Tambahkan kode untuk kembali ke formulir login.
  ![image](https://github.com/user-attachments/assets/367cb3ef-0cd2-4fb1-862a-64364ac6f9e7)
 

#### f. Label Back  
- Klik kanan label **Back** > **Events > Mouse > mouseClicked**.  
- Tambahkan kode untuk kembali ke formulir login.  
![image](https://github.com/user-attachments/assets/cbf87ab3-db41-4cbd-ad55-2d3d73182ee4)


#### g. Tombol Save  
- Klik dua kali tombol **Save**.  
- Tambahkan kode untuk menyimpan data ke database.
![image](https://github.com/user-attachments/assets/e06ec730-de5e-42af-bdad-d62fe5e3e752)
  
