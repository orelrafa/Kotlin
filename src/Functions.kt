fun main() {
    //Exercise 1
    fun validateData(name: String?, age: String?): Boolean{
        return when {
            !age.isNullOrBlank() && age.toInt() >= 18 -> {
                println("$name is old enough to drive")
                true
            }
            else -> {
                println("$name is not old enough to drive")
                false
            }
        }
    }
    fun getUserData(){
        println("What's your name?")
        val name = readln()
        println("How old are you?")
        val age = readln()
        validateData(name, age)
    }
    //getUserData()

    //Exercise 2
    fun concat(strings: List<String>, separator: String = ",") = strings.joinToString(separator)
//    val list=listOf("moshe", "dave", "yael")
//    println(concat(list))
//    println(concat(list, "|"))

    //Exercise 3
    // a simple function that takes a parameter of type string and returns unit
    fun simpleFunc(param: String) {return}
    //a function that takes two strings message and a prefix, the second parameter is optional with default value "info"
    //the function will not return anything but this time use omitted Unit return value and
    //print to the screen the prefix followed by the message.
    fun printMessageWithPrefix(message: String, prefix: String="Info"){
        println("${prefix}${message}")
    }

    //A function that receives two integers and returns their sum
    fun sum(numA: Int, numB: Int) =  numA+numB
    //a single expression function that returns an integer (inferred) -
    //the function receives two Int and return their multiplication
    fun mult(numA: Int, numB: Int) = numA*numB

    //a function that takes String varargs and prints them
    fun printAll(vararg messages: String){
        for(m in messages)
            println(m)
    }

    //Infix function called "onto" that works on two strings
    // This and the parameters and return a new Pair containing
    // both of them) - Pairs can be add to maps like we seen before
    // use your infix function with map initialization

    //create a main function and test all your functions
}

infix fun Int.times(string: String) = string.repeat(this)