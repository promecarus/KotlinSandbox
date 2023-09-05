package codewars

import junit.framework.TestCase.assertEquals
import org.junit.Test

fun numberToString(num: Int) = num.toString()

class TestConvertANumberToAString {
    @Test
    fun test() {
        assertEquals("67", numberToString(67))
        assertEquals("123", numberToString(123))
        assertEquals("999", numberToString(999))
    }
}
