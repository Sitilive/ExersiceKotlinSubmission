package id.infinitelearning.KotlinSubmission.exercise3

fun main() {

    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */
    // Buat di bawah sini

    print("Masukan Nilai Anda: ")
    var nilai = readLine()!!.toInt()
    when(nilai) {
        //Remember otak: Operator in atau !in, untuk memeriksa suatu nilai ada atau tidak dalam rentang nilainya
        in 90..100 -> println("Selamat! Anda mendapatkan nilai A")
        in 80..89 -> println("Anda mendapatkan nilai B")
        in 70..79 -> println("Anda mendapatkan nilai C")
        in 60..69 -> println("Anda mendapatkan nilai D")
        in 1..50 -> println("Anda mendapatkan nilai E")
    }
}