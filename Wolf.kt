open class  Wolf: Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("howwwl!")
    }

    override fun eat() {
        println("the wolf is eating $food")
    }
}