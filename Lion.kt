 open class Lion : Feline() {
    override val image = "Lion.jpg"
    override val food = "meat"
    override val habitat = "land"
    override fun makeNoise() {
        println("rawr!")
    }

    override fun eat() {
        println("the lion is eating $food")

    }
    }
