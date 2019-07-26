class Fox : Animal() {
    override val image = "Fox.jpg"
    override val food = "grass"
    override val habitat = "land"

    override fun makeNoise() {
        println("ding ding")
    }

    override fun eat() {
        println("the fox is eating $food")

    }
}