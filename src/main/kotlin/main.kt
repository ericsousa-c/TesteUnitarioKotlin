fun countXO(str: String) :Boolean {
    val text = str.lowercase()
    var cont = 0
    var quantO = 0
    var quantX = 0
    while (cont < text.length) {
        if (text[cont] == 'x') {
            quantX ++
        } else if (text[cont] == 'o') {
            quantO ++
        }
        cont++
    }
    return quantO == quantX && quantO != 0
}

fun main() {
    println(countXO("xxoo"))
    println(countXO("xxxo"))
}