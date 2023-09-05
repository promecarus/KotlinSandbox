package codewars

import junit.framework.TestCase.assertEquals
import org.junit.Test

fun getCount(str: String) = str.count { it in "aeiou" }

class TestVowelCount {
    @Test
    fun test() {
        assertEquals(5, getCount("abracadabra"))
        assertEquals(1, getCount("test"))
        assertEquals(3, getCount("example"))
    }
}
