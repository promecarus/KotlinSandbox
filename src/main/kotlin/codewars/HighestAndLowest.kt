package codewars

import junit.framework.TestCase.assertEquals
import org.junit.Test

fun highAndLow(numbers: String) = numbers.split(" ").map { it.toInt() }.let { "${it.maxOrNull()} ${it.minOrNull()}" }

class TestHighestAndLowest {
    @Test
    fun test1() {
        assertEquals("42 -9", highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))
    }

    @Test
    fun test2() {
        assertEquals("3 1", highAndLow("1 2 3"))
    }
}
