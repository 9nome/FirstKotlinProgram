class FirstClass {
    fun iAmAMethod() {
        println("wow such compact")
    }
}
//Weird! Main cannot be in a class in Kotlin. Needs to be outside a class def
fun main(){
    val firstClass = FirstClass()
    firstClass.iAmAMethod()
}
