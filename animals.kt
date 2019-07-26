abstract class Animal {
    abstract val image = ""
    abstract val food = ""
    abstract val habitat = ""
    var hunger = 10

    abstract fun makeNoise()
        println("The Animal is making a noise")


    abstract fun eat()
        println("the animal is eating")


    abstract fun roam()
        println("the animal is roaming")


    abstract sleep() {
        println("the animal is sleeping")
    }
 }



    abstract class Canine: Animal(){
        override fun roam() {
            println("the canine is roaming0")
        }
}

    abstract class Feline: Animal(){

        override fun roam() {
            println("The Feline is Romaing")
        }
    }