package org.mrksbu

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    HelloWorld("Example Programm to be compiled with GitHub actions").print()
    HelloWorld("End").print()
}

class HelloWorld(val text: String) {
    fun print(): String {
        println(text)
        return text
    }
}