package com.example.hw_1919_kotlin_les1

import android.util.Log

class CatInfoHandler {

    var catList = mutableListOf<Cat>(
        Cat("Fedor", 12, "Markis"),
        Cat("Fedor", 12, "Markis"),
        (Cat("Timon", 2, "Tabby"))
    )
    var kittyList = listOf<Kitty>(
        Kitty("William", 2, "ColorPoint"),
        Kitty("William", 2, "ColorPoint"),
        Kitty("Buny", 5, "Tortoiseshell ")
    )

    /**
     * Функция возвращает 1 элемент из коллекции j объектов Cat
     */
    fun getRandomCat(cats: List<Cat>): Cat {
        comparingClassObject()
        val x: Int = (cats.indices).random()
        return cats[x]
    }

    /**
     * Функция возвращает строку с информацией об объекте Cat
     */
    fun getCatInfo(cat: Cat): String {
        return "Cat: " + cat.name + "\n Age: " + cat.age + "\n Color: " + cat.color
    }


    /**
     * Функция возвращает 1 элемент из коллекции объектов класса Kitty
     */
    fun getRandomKitty(kittens: List<Kitty>): Kitty {
        comparingClassObject()
        val x: Int = (kittens.indices).random()
        return kittens[x]
    }

    /**
     * Функция возращает строку с информацией об объекте Kitty
     */
    fun getKittyInfo(kitty: Kitty): String {
        return "Kitty: " + kitty.name + "\n Age: " + kitty.age + "\n Color: " + kitty.color
    }

    /**
     * Функция сравнивает объекты классов Cat и Kitty, чтобы посмотреть разность реальзации equals(0)
     */
    private fun comparingClassObject() {
        createObjectByCopy()
        Log.i("###", if (kittyList[0] == kittyList[1]) "true" else "false")
        Log.i("###", if (catList[0] == catList[1]) "true" else "false")
    }

    /**
     * Функция копирования объектов классов Cat и Kitty
     */
    fun createObjectByCopy(){
        val catClone = catList[1].copy(age = 4)
        catList.add(3,catClone)

    }

}