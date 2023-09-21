package codewars

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import kotlin.math.abs

class Kata {
    fun makeNegative(x: Int) = -abs(x)
}

class TestReturnNegative {
    private lateinit var kata: Kata

    @Before
    fun setUp() {
        kata = Kata()
    }

    @Test
    fun test1() {
        assertEquals(-42, kata.makeNegative(42).toLong())
    }
}
