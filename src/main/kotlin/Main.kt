fun main(args: Array<String>) {
    val animals = mutableListOf<Animal>()
    animals.add(Dog())
    animals.add(Cat())

    for (animal in animals) {
        animal.cry()
    }
}

open class Animal {
    open fun cry(): Unit {
        println("Hello.")
    }
}

class Dog : Animal() {
    override fun cry(): Unit {
        println("Hello. I'm Dog.")
    }

}

class Cat : Animal() {
    override fun cry(): Unit {
        println("Hello. I'm Cat.")
    }
}