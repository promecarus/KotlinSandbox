package codewars

import org.junit.Assert.assertEquals
import org.junit.Test

fun multiply(x: Double, y: Double) = x * y

class TestMultiply {
    @Test
    fun test() {
        for (i in 0..99) {
            val a = Math.random()
            val b = Math.random()
            val c = Math.random()
            val message = String.format("(%g * %g) * %g == %g * (%g * %g)", a, b, c, a, b, c)
            assertEquals(
                message, multiply(multiply(a, b), c), multiply(a, multiply(b, c)), 1E-14
            )
            assertEquals(multiply(a, b), a * b, 1e-3)
        }
    }
}
