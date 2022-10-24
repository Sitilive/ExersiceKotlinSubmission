package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    val my = "Apa ya?"
    val ini: Int? = try {
        my.toInt()
    }catch (e: NumberFormatException){-1}
    println(ini)

}