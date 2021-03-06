package com.ubertob.pesticide.examples.fables


enum class Location {
    littleRedRidingHoodHouse, middleOfTheForest, grandMaHouse, insideTheWolfBelly
}

enum class WolfState {
    ignorant, waitingForTheGirl, sleepy, dead
}

data class Basket(val value: Int, val location: Location)