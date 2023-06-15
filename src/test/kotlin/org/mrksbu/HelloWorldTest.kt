package org.mrksbu

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HelloWorldTest {

    @Test
    fun print() {
        val text = "Input"
        Assertions.assertEquals(text, HelloWorld(text).print())
    }
}