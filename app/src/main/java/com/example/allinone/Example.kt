package com.example.allinone

//class Example {
//}

fun main(){
    val name:String? = "Steven"
    println("The length of name string is ${name?.length}")
}

//fun main(){
//    val james = Guy()
//    james.actualAge = 15
//    james.age = 15
//    println("James: actual age = ${james.actualAge}")
//    println("James : pretended age = ${james.age}")
//}
//
//class Guy(){
//    var age:Int = 0
//    get(){
//        println("> age has been accessed")
//        return field
//    }
//
//    set(value){
//        field = when{
//            value < 18 -> 18
//            value in 18..30 -> value
//            else -> value -3
//        }
//        println("> age has been set")
//    }
//    var actualAge = 0
//}

//fun main(){
//    var mutableSet = mutableSetOf<Int>(6,6,9,9)
//
//    mutableSet.add(2)
//    mutableSet.add(5)
//    mutableSet.remove(6)
//
//    for(item in mutableSet){
//        println(item)
//    }
//}