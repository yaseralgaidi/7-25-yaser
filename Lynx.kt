class Lynx : Animal() {
    override val image = "Lynx.jpg"
    override val food = "meat"
    override val habitat = "land"
    override fun makeNoise() {
        println("Meow?")
    }

    override fun eat() {
        println("the lynx" +
                " is eating $food")

    }
}
}


        var one = "ace"