// Scrivi un ciclo che stampa numeri da 1 a 100, aumentando di 2 (quindi 1, 3, 5...).
// Utilizzare due diverse funzioni di stampa per valori inferiori a 50 e valori superiori a 50.


fun main() {

    for (i in 1..100 step 2) {
        if (i < 50) {
            printSmallNumbers(i)
        } else {
            printBigNumbers(i)
        }

    }
}

fun printSmallNumbers(smallNumber: Int) {
    println("Small numbers: ${smallNumber}")
}

fun printBigNumbers(BigNumber: Int) {
    println("Big numbers: ${BigNumber}")
}





