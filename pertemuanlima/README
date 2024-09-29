**2. Buat Database**
- Buat database di PostgreSQL (atau database lain yang kamu gunakan) dengan nama dan tabel yang sesuai, misalnya:

```sql
CREATE TABLE tabel_tugas (
    id_tugas VARCHAR(10) PRIMARY KEY,
    mata_kuliah VARCHAR(100) NOT NULL,
    deskripsi TEXT,
    status VARCHAR(15) CHECK (status IN ('Pending', 'In Progres', 'Completed'))
);
