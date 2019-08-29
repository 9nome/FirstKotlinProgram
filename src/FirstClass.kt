class FirstClass {
    val iAmAnInteger: Int = 1
    val iAmAnIntegerInDisguise = 1

    fun iAmAMethod() {
        println("wow such compact")
    }

    fun iHateMath(x: Int, y: Int){
        println(x+y)
        //return this //why dont work?! no this?!
    }
}
//Weird! Main cannot be in a class in Kotlin. Needs to be outside a class def
fun main(){
    val firstClass = FirstClass()
    firstClass.iAmAMethod()
    firstClass.iHateMath(firstClass.iAmAnInteger, firstClass.iAmAnIntegerInDisguise)
}
