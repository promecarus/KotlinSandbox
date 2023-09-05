package codewars

import org.junit.Assert.assertEquals
import org.junit.Test

fun evenOrOdd(number: Int) = if (number % 2 == 0) "Even" else "Odd"

class TestEvenOrOdd {
    @Test
    fun test() {
        assertEquals("Even", evenOrOdd(2))
        assertEquals("Even", evenOrOdd(0))
        assertEquals("Odd", evenOrOdd(7))
        assertEquals("Odd", evenOrOdd(1))
    }
}
