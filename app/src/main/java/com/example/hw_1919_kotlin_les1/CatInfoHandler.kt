package com.example.hw_1919_kotlin_les1

class CatInfoHandler {

    var catList = listOf<Cat>(
        Cat("Fedor", 12, "Markis"),
        (Cat("Roxy", 2, "Grey")),
        (Cat("Timon", 2, "Tabby"))
    )
    var kittyList = listOf<Kitty>(
        Kitty("William", 2, "ColorPoint"),
        Kitty("William", 2, "ColorPoint"),
        Kitty("Buny", 5, "Tortoiseshell ")
    )

    /**
     * Метод возвращает 1 элемент из коллекции catList
     */
    fun getRandomCat(cats: List<Cat>): Cat {
        val x: Int = (cats.indices).random()
        return cats[x]
    }

    /**
     * Метода возвращает строку с информацией об объекте Cat
     */
    fun getCatInfo(cat: Cat): String {
        return "Cat: " + cat.name + "\n Age: " + cat.age + "\n Color: " + cat.color
    }



    /**
     * Метод возвращает 1
     */
    fun getRandomKitty(kittens: List<Kitty>): Kitty {
        val x: Int = (kittens.indices).random()
        return kittens[x]
    }

    /**
     * Метод возращает строку с информацией об объекте Kitty
     */
    fun getKittyInfo(kitty: Kitty): String {
        return "Kitty: " + kitty.name + "\n Age: " + kitty.age + "\n Color: " + kitty.color
    }


}