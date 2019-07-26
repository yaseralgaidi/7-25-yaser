class Cheetah : Animal() {
    override val image = "Cheetah.jpg"
    override val food = "meat"
    override val habitat = "land"
    override fun makeNoise() {
        println("rawr??")
    }

    override fun eat() {
        println("the cheetah is eating $food")

    }
}
}