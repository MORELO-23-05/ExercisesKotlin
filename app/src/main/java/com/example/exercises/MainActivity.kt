package com.example.exercises

import kotlin.math.max
import kotlin.math.min

fun main() {
    // Iniciar el programa
    showMainMenu()
}

// Show the menú principal
private fun showMainMenu() {
    var option: Int

    while (true) {
        println("===== MENÚ PRINCIPAL =====")
        println("1. Operadores")
        println("2. Condicionales")
        println("3. Ciclos")
        println("99. Salir")
        println("===========================")
        print("Ingrese una opción: ")
        option = readLine()?.toIntOrNull() ?: 0

        when (option) {
            1 -> showOperatorsMenu()
            2 -> showConditionalsMenu()
            3 -> showLoopsMenu()
            99 -> {
                println("Saliendo del programa...")
                return
            }
            else -> println("Opción inválida. Intente nuevamente.")
        }
    }
}

//Show Operators submenu
private fun showOperatorsMenu() {
    var option: Int

    while (true) {
        println("===== SUBMENÚ DE OPERADORES =====")
        println("1. Calcular el área de un triángulo")
        println("2. Ingresar dos números y sumarlos")
        println("3. Ingresar un número y visualizar el número elevado al cuadrado")
        println("4. Convertir de euros a dólares")
        println("5. Calcular área y perímetro de un cuadrado")
        println("6. Calcular área y volumen de un cilindro")
        println("7. Calcular la longitud y el área del círculo inscrito")
        println("8. Calcular el promedio de tres números")
        println("99. Volver al menú principal")
        println("=================================")
        print("Ingrese una opción: ")
        option = readLine()?.toIntOrNull() ?: 0

        when (option) {
            1 -> calculateTriangleArea()
            2 -> sumTwoNumbers()
            3 -> squareOfNumber()
            4 -> convertEurosToDollars()
            5 -> squareAreaAndPerimeter()
            6 -> cylinderAreaAndVolume()
            7 -> calculateCircleInfo()
            8 -> calculateAverage()
            99 -> return
            else -> println("Opción inválida. Intente nuevamente.")
        }
    }
} 
private fun calculateTriangleArea() {
    println("Ingrese la base del triángulo:")
    val base = readLine()?.toDoubleOrNull() ?: return

    println("Ingrese la altura del triángulo:")
    val height = readLine()?.toDoubleOrNull() ?: return

    val area = 0.5 * base * height
    println("El área del triángulo es: $area")
}

private fun sumTwoNumbers() {
    println("Ingrese el primer número:")
    val num1 = readLine()?.toDoubleOrNull() ?: return

    println("Ingrese el segundo número:")
    val num2 = readLine()?.toDoubleOrNull() ?: return

    val sum = num1 + num2
    println("La suma es: $sum")
}

private fun squareOfNumber() {
    println("Ingrese un número:")
    val num = readLine()?.toDoubleOrNull() ?: return

    val square = num * num
    println("El número elevado al cuadrado es: $square")
}

private fun convertEurosToDollars() {
    println("Ingrese la cantidad en euros:")
    val euros = readLine()?.toDoubleOrNull() ?: return

    val dollars = euros * 1.17 // Suponiendo una tasa de cambio fija de 1 EUR = 1.17 USD
    println("$euros euros equivalen a $dollars dólares.")
}

private fun squareAreaAndPerimeter() {
    println("Ingrese el lado del cuadrado:")
    val side = readLine()?.toDoubleOrNull() ?: return

    val area = side * side
    val perimeter = 4 * side

    println("El área del cuadrado es: $area")
    println("El perímetro del cuadrado es: $perimeter")
}

private fun cylinderAreaAndVolume() {
    println("Ingrese el radio del cilindro:")
    val radius = readLine()?.toDoubleOrNull() ?: return

    println("Ingrese la altura del cilindro:")
    val height = readLine()?.toDoubleOrNull() ?: return

    val area = 2 * Math.PI * radius * (radius + height)
    val volume = Math.PI * radius * radius * height

    println("El área del cilindro es: $area")
    println("El volumen del cilindro es: $volume")
}

private fun calculateCircleInfo() {
    println("Ingrese el radio de la circunferencia:")
    val radius = readLine()?.toDoubleOrNull() ?: return

    val circumference = 2 * Math.PI * radius
    val area = Math.PI * radius * radius

    println("La longitud de la circunferencia es: $circumference")
    println("El área del círculo es: $area")
}

private fun calculateAverage() {
    println("Ingrese el primer número:")
    val num1 = readLine()?.toDoubleOrNull() ?: return

    println("Ingrese el segundo número:")
    val num2 = readLine()?.toDoubleOrNull() ?: return

    println("Ingrese el tercer número:")
    val num3 = readLine()?.toDoubleOrNull() ?: return

    val average = (num1 + num2 + num3) / 3
    println("El promedio de los tres números es: $average")
}


// Show Conditionals submenu
private fun showConditionalsMenu() {
    var option: Int

    while (true) {
        println("===== SUBMENÚ DE CONDICIONALES =====")
        println("1. Determinar si un número es positivo o negativo")
        println("2. Comparar dos números y mostrar el mayor y menor")
        println("3. Encontrar el menor y el mayor de tres números")
        println("4. Sumar o restar dos números según condición")
        println("5. Calcular el cociente entre dos números")
        println("6. Sumar o multiplicar dos números según condición")
        println("7. Determinar si un año es bisiesto")
        println("99. Volver al menú principal")
        println("=====================================")
        print("Ingrese una opción: ")
        option = readLine()?.toIntOrNull() ?: 0

        when (option) {
            1 -> checkPositiveOrNegative()
            2 -> compareTwoNumbers()
            3 -> findMinMaxOfThreeNumbers()
            4 -> sumOrSubtractAccordingToCondition()
            5 -> calculateQuotient()
            6 -> sumOrMultiplyAccordingToCondition()
            7 -> checkLeapYear()
            99 -> return
            else -> println("Opción inválida. Intente nuevamente.")
        }
    }
}
private fun checkPositiveOrNegative() {
    println("Ingrese un número:")
    val num = readLine()?.toDoubleOrNull() ?: return

    if (num > 0) {
        println("El número es positivo.")
    } else if (num < 0) {
        println("El número es negativo.")
    } else {
        println("El número es cero.")
    }
}

private fun compareTwoNumbers() {
    println("Ingrese el primer número:")
    val num1 = readLine()?.toDoubleOrNull() ?: return

    println("Ingrese el segundo número:")
    val num2 = readLine()?.toDoubleOrNull() ?: return

    val max = max(num1, num2)
    val min = min(num1, num2)

    println("El número mayor es: $max")
    println("El número menor es: $min")
}

private fun findMinMaxOfThreeNumbers() {
    println("Ingrese el primer número:")
    val num1 = readLine()?.toDoubleOrNull() ?: return

    println("Ingrese el segundo número:")
    val num2 = readLine()?.toDoubleOrNull() ?: return

    println("Ingrese el tercer número:")
    val num3 = readLine()?.toDoubleOrNull() ?: return

    val max = maxOfThreeNumbers(num1, num2, num3)
    val min = minOfThreeNumbers(num1, num2, num3)

    println("El número mayor es: $max")
    println("El número menor es: $min")
}

fun minOfThreeNumbers(num1: Double, num2: Double, num3: Double): Double {
    return min(min(num1, num2), num3)
}

fun maxOfThreeNumbers(num1: Double, num2: Double, num3: Double): Double {
    return max(max(num1, num2), num3)
}

private fun sumOrSubtractAccordingToCondition() {
    println("Ingrese el primer número:")
    val num1 = readLine()?.toDoubleOrNull() ?: return

    println("Ingrese el segundo número:")
    val num2 = readLine()?.toDoubleOrNull() ?: return

    val result = if (num1 < num2) {
        num1 + num2
    } else {
        num1 - num2
    }

    println("El resultado es: $result")
}

private fun calculateQuotient() {
    println("Ingrese el dividendo:")
    val dividend = readLine()?.toDoubleOrNull() ?: return

    println("Ingrese el divisor:")
    val divisor = readLine()?.toDoubleOrNull() ?: return

    if (divisor == 0.0) {
        println("La división no es posible, el divisor es cero.")
    } else {
        val quotient = dividend / divisor
        println("El cociente es: $quotient")
    }
}

private fun sumOrMultiplyAccordingToCondition() {
    println("Ingrese el primer número:")
    val num1 = readLine()?.toDoubleOrNull() ?: return

    println("Ingrese el segundo número:")
    val num2 = readLine()?.toDoubleOrNull() ?: return

    val result = if (num1 < 0 || num2 < 0) {
        num1 + num2
    } else {
        num1 * num2
    }

    println("El resultado es: $result")
}

private fun checkLeapYear() {
    println("Ingrese un año:")
    val year = readLine()?.toIntOrNull() ?: return

    val isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)

    if (isLeapYear) {
        println("$year es un año bisiesto.")
    } else {
        println("$year no es un año bisiesto.")
    }
}

//Show Cycles submenu
private fun showLoopsMenu() {
    var option: Int

    while (true) {
        println("===== SUBMENÚ DE CICLOS =====")
        println("1. Imprimir múltiplos de 3 entre 1 y 100")
        println("2. Imprimir números impares entre 0 y 100")
        println("3. Imprimir números pares entre 1 y 100")
        println("4. Imprimir cuadrados de los números del 1 al 30")
        println("5. Sumar cuadrados de los cien primeros números naturales")
        println("6. Generar y mostrar números entre dos valores")
        println("7. Sumar todos los números que se digitan por teclado mientras no sea cero")
        println("99. Volver al menú principal")
        println("=============================")
        print("Ingrese una opción: ")
        option = readLine()?.toIntOrNull() ?: 0

        when (option) {
            1 -> printMultiplesOfThree()
            2 -> printOddNumbers()
            3 -> printEvenNumbers()
            4 -> printSquaresUpTo30()
            5 -> sumSquaresOfFirstHundredNumbers()
            6 -> generateAndShowNumbersInRange()
            7 -> sumNumbersUntilZero()
            99 -> return
            else -> println("Opción inválida. Intente nuevamente.")
        }
    }
}
private fun printMultiplesOfThree() {
    println("Múltiplos de 3 entre 1 y 100:")
    for (i in 1..100) {
        if (i % 3 == 0) {
            print("$i ")
        }
    }
    println()
}

private fun printOddNumbers() {
    println("Números impares entre 0 y 100:")
    for (i in 1..100 step 2) {
        print("$i ")
    }
    println()
}

private fun printEvenNumbers() {
    println("Números pares entre 1 y 100:")
    for (i in 2..100 step 2) {
        print("$i ")
    }
    println()
}

private fun printSquaresUpTo30() {
    println("Cuadrados de los números del 1 al 30:")
    for (i in 1..30) {
        val square = i * i
        print("$square ")
    }
    println()
}

private fun sumSquaresOfFirstHundredNumbers() {
    var sum = 0
    for (i in 1..100) {
        sum += i * i
    }
    println("La suma de los cuadrados de los cien primeros números naturales es: $sum")
}

private fun generateAndShowNumbersInRange() {
    println("Ingrese el primer número:")
    val num1 = readLine()?.toIntOrNull() ?: return

    println("Ingrese el segundo número:")
    val num2 = readLine()?.toIntOrNull() ?: return

    println("Números entre $num1 y $num2 en secuencia ascendente:")
    for (i in num1..num2) {
        print("$i ")
    }
    println()
}
private fun sumNumbersUntilZero() {
    var sum = 0
    var num: Int

    do {
        println("Ingrese un número (0 para terminar): ")
        num = readLine()?.toIntOrNull() ?: 0
        sum += num
    } while (num != 0)

    println("La suma de los números ingresados es: $sum")
}

