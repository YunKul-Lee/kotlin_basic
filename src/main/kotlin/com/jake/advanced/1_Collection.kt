package com.jake.advanced

import java.util.ArrayList
import java.util.LinkedList
import java.util.stream.Collectors

fun main() {



    // immutable  (List, Set, Map)
    val currentList = listOf("달러", "유로", "원")


    // mutable      (MutalbleList, MutableSet, MutableMap)
    val mutableCurrencyList = mutableListOf<String>().apply {
        add("달러")
        add("유로")
        add("원")
    }
//    val mutableCurrencyList = mutableListOf<String>()
//    mutableCurrencyList.add("달러")
//    mutableCurrencyList.add("유로")
//    mutableCurrencyList.add("원")


    // immutable set
    val numberSet = setOf(1, 2, 3, 4)

    // mutable set
    val mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }


    // immutable map
    val numberMap = mapOf("one" to 1, "two" to 2)

    // mutable map
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1
    mutableNumberMap.put("two", 2)


    // Collection Builder
    // Builder 내부에서는 mutable. 반환은 immutable
    val numberList: List<Int> = buildList {
        add(1)
        add(2)
        add(3)
    }

    // linkedList
    val linkedList = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
        addLast(1)
    }

    // arrayList
    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    val iterator = currentList.iterator()
    while(iterator.hasNext()) {
        println(iterator.next())
    }

    println("====================================")

    for (currency in currentList) {
        println(currency)
    }

    println("====================================")

    currentList.forEach {
        println(it)
    }

    println("====================================")

    // for loop -> map
    val lowerList = listOf("a", "b", "c")
    val upperList = mutableListOf<String>()

    for(lowerCase in lowerList) {
        upperList.add(lowerCase.uppercase())
    }

    val upperList2 = lowerList.map { it.uppercase() }

    println(upperList)
    println(upperList2)


    // filter

    val filteredList = mutableListOf<String>()
    for(upperCase in upperList) {
        if (upperCase == "A" || upperCase == "C") {
            filteredList.add(upperCase)
        }
    }
    println(filteredList)

    // kotlin
    val filteredList2 = upperList.filter { it == "A" || it == "C" }
    println(filteredList2)

    // java
    val filteredList3 = upperList.stream().filter { it == "A" || it =="C" }.collect(Collectors.toList())
    println(filteredList3)

    val filteredList4 = upperList
        .asSequence()
        .filter { it == "A" || it == "C" }
        .toList()
    println(filteredList4)

}