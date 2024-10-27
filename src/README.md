# Aplikasi Perhitungan Luas Lingkaran

Proyek ini adalah aplikasi sederhana yang bertujuan untuk menghitung luas lingkaran 
berdasarkan radius yang ada dalam program tersebut. 

## Fitur
- **Perhitungan Luas Lingkaran:** 
Menghitung luas lingkaran berdasarkan radius yang diinputkan.

- **Konstanta PHI:**
Menggunakan konstanta `PHI` dengan nilai `Math.PI` untuk hasil yang lebih akurat.

- **Getters dan Setters:** 
Menggunakan metode getter dan setter untuk mengakses dan mengubah radius lingkaran

## Struktur Kelas

### `HitungLuasLingkaran`
Kelas `HitungLuasLingkaran` menyimpan atribut dan metode yang dibutuhkan untuk menghitung luas lingkaran.
- **`Atribut radius`:** Menyimpan jari-jari lingkaran.
- **Konstanta `PHI`:** Menyimpan nilai 𝜋 (`Math.PI`) yang digunakan dalam perhitungan.
- **Metode `getRadius()`:** Mengembalikan nilai radius lingkaran.
- **Metode `setRadius(double radius)`:** Mengubah nilai radius lingkaran.
- **Metode `getArea(Lingkaran lingkaran)`:** Menghitung luas lingkaran menggunakan rumus `PHI * radius^2`.

## Cara Menggunakan
Program akan membuat objek `Lingkaran` dengan nilai radius 2.5, 
lalu mencetak radius dan luas lingkaran tersebut
