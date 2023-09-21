package codewars

import org.junit.Assert.assertArrayEquals
import org.junit.Test

fun fizzBuzz(n: Int) = (1..n).map {
    when {
        it % 15 == 0 -> "FizzBuzz"
        it % 3 == 0 -> "Fizz"
        it % 5 == 0 -> "Buzz"
        else -> it.toString()
    }
}.toTypedArray()

class TestFizzBuzz {
    @Test
    fun `One Number`() {
        val expected = arrayOf("1")
        assertArrayEquals(expected, fizzBuzz(1))
    }

    @Test
    fun `Ten Numbers`() {
        val expected = arrayOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz")
        assertArrayEquals(expected, fizzBuzz(10))
    }
}
