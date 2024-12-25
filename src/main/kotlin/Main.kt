fun main() {
    println("Введите первую цифру:")
    val digit1 = readLine()?.toIntOrNull()

    println("Введите вторую цифру:")
    val digit2 = readLine()?.toIntOrNull()

    if (digit1 == null || digit2 == null || digit1 !in 0..9 || digit2 !in 0..9) {
        println("Ошибка: Введите две различные цифры от 0 до 9.")
        return
    }

    if (digit1 == digit2) {
        println("Ошибка: Цифры должны быть различны.")
        return
    }

    if (digit1 % 2 != 0) {
        println("Нечетное число: $digit1$digit2")
    } else if (digit2 % 2 != 0) {
        println("Нечетное число: $digit2$digit1")
    } else {
        println("Создать нечетное число невозможно.")
    }
}
