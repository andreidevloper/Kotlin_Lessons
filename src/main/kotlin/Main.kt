fun main(args: Array<String>) {
    lesson20()
}

fun lesson20() {
    val conan = Player("Conan")
    conan.getLoot(Loot("Invisibility", LootType.POTION, 4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOR, 183.0))
    conan.getLoot(Loot("Ring of speed", LootType.RING, 25.0))
    conan.getLoot(Loot("Red Potion", LootType.POTION, 2.0))
   // conan.getLoot(Loot("Cursed Shield", LootType.ARMOR, -8.0))
    conan.getLoot(Loot("Brass King", LootType.ARMOR, 1.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOR, 4.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Health Potion", LootType.POTION, 3.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.showInventory()

    if(conan.dropLoot("Gold Ring")) {
        println("Does have Gold Ring")
    } else {
        println("Does not have Gold Ring")
    }

    if(conan.dropLoot("Silver Ring")) {
        println("Does have Silver Ring")
    } else {
        println("Does not have Silver Ring")
    }

    if(conan.dropLoot("Cooper Ring")) {
        println("Does have Cooper Ring")
    } else {
        println("Does not have Cooper Ring")
    }
}

// Do-while loop
fun lesson19() {
    val dracula = VampireKing("Dracula")
    println(dracula)
    dracula.lives = 0
    do {
        if(dracula.dodges()) {
            dracula.lives += 1
            continue
        }
        if(dracula.runAway()) {
            println("Dracula run away")
            break
        } else {
            dracula.takeDamage(80)
        }
    } while (dracula.lives > 0)
}

// For loop revisited 2. part
fun lesson18() {
    for (i in 1 .. 10) {
        val dracula = VampireKing("Dracula")
        println(dracula)
        while(dracula.lives > 0) {
            if(dracula.dodges()) {
                continue
            }
            if(dracula.runAway()) {
                println("Dracula run away")
                break
            } else {
                dracula.takeDamage(80)
            }
        }
    }
    println("----------------------------")
}

// For loop revisited
fun lesson17() {
    val conan = Player("Conan")
    conan.getLoot(Loot("Invisibility", LootType.POTION, 4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOR, 183.0))
    conan.getLoot(Loot("Ring of speed", LootType.RING, 25.0))
    conan.getLoot(Loot("Red Potion", LootType.POTION, 2.0))
    conan.getLoot(Loot("Cursed Shield", LootType.ARMOR, -8.0))
    conan.getLoot(Loot("Brass King", LootType.ARMOR, 1.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOR, 4.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Health Potion", LootType.POTION, 3.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.showInventory()
}

// While loop
fun lesson16() {
    val uglyTroll = Troll("Ugly troll")
    println(uglyTroll)
    uglyTroll.takeDamage(8)
    println(uglyTroll)

    val vlad = Vampire("Vlad")
    vlad.takeDamage(8)
    println(vlad)

    val dracula = VampireKing("Dracula")
    println(dracula)
    while(dracula.lives > 0) {
        if(dracula.dodges()) {
            continue
        }
        if(dracula.runAway()) {
            println("Dracula run away")
            break
        } else {
            dracula.takeDamage(8)
        }
    }
}

// Inheritance part 3.
fun lesson15() {
    val uglyTroll = Troll("Ugly troll")
    println(uglyTroll)
    uglyTroll.takeDamage(8)
    println(uglyTroll)

    val vlad = Vampire("Vlad")
    vlad.takeDamage(8)
    println(vlad)

    val dracula = VampireKing("Dracula")
    dracula.takeDamage(8)
    println(dracula)
}

// Inheritance part 2.
fun lesson14() {
    val uglyTroll = Troll("Ugly troll")
    println(uglyTroll)
    uglyTroll.takeDamage(8)
    println(uglyTroll)

    val vlad = Vampire("Vlad")
    vlad.takeDamage(8)
    println(vlad)
}

// Inheritance
fun lesson13() {
    val enemy = Enemy("testEnemy", 10, 3)
    println(enemy)

    enemy.takeDamage(4)
    println(enemy)

    enemy.takeDamage(11)
    println(enemy)

    val uglyTroll = Troll("Ugly troll")
    println(uglyTroll)
    uglyTroll.takeDamage(8)
    println(uglyTroll)
    uglyTroll.takeDamage(19)
    println(uglyTroll)
}

// Overloading
fun lesson12() {
    val louise = Player("Louise", 5)

    louise.weapon = Weapon("Spear", 14)

    val redPotion = Loot("Red potion", LootType.POTION, 7.50)
    louise.getLoot(redPotion)
    val chestArmor = Loot("+3 Chest armor", LootType.ARMOR, 80.00)
    louise.getLoot(chestArmor)
    val protectRing = Loot("Protection ring +2", LootType.RING, 40.25)
    louise.getLoot(protectRing)
    val invisibilityPotion = Loot("Invisibility potion", LootType.POTION, 46.25)
    louise.getLoot(invisibilityPotion)

    if(louise.dropLoot(protectRing)) {
        louise.showInventory()
    } else {
        println("you don't have a ${protectRing.name}")
    }

    val bluePotion = Loot("Blue potion", LootType.POTION, 6.00)
    if(louise.dropLoot(bluePotion)) {
        louise.showInventory()
    } else {
        println("you don't have a ${bluePotion.name}")
    }

    if(louise.dropLoot("Invisibility potion")) {
        louise.showInventory()
    } else {
        println("you don't have a Invisibility potion")
    }
}

// Encapsulation and private properties
fun lesson11() {
    val louise = Player("Louise", 5)

    louise.weapon = Weapon("Spear", 14)

    val redPotion = Loot("Red potion", LootType.POTION, 7.50)
    louise.getLoot(redPotion)
    val chestArmor = Loot("+3 Chest armor", LootType.ARMOR, 80.00)
    louise.getLoot(chestArmor)
    val protectRing = Loot("Protection ring +2", LootType.RING, 40.25)
    louise.getLoot(protectRing)


    if(louise.dropLoot(protectRing)) {
        louise.showInventory()
    } else {
        println("you don't have a ${protectRing.name}")
    }

    val bluePotion = Loot("Blue potion", LootType.POTION, 6.00)
    if(louise.dropLoot(bluePotion)) {
        louise.showInventory()
    } else {
        println("you don't have a ${bluePotion.name}")
    }
}

// Loops 2. part
fun lesson10() {

    // [0; 10]
    for(i in 0..10) {
        println("$i squared is ${i * i}")
    }

    // [0; 10)
    for(i in 0 until 10) {
        println("$i squared is ${i * i}")
    }

    // [10; 0]
    for(i in 10 downTo 0) {
        println("$i squared is ${i * i}")
    }

    for(i in 10 downTo 0 step 2) {
        println("$i squared is ${i * i}")
    }

    for(i in 0..100) {
        if(i % 3 == 0 && i % 5 == 0) {
            println("$i divide by 3 and 5")
        }
    }

    for(value in 3..100 step 3) {
        if(value % 5 == 0) {
            println("$value divide by 3 and 5")
        }
    }
}

// Loops part 1.
fun lesson9() {
//    val louise = Player("Louise", 5)
//
//    louise.weapon = Weapon("Spear", 14)
//
//    val redPotion = Loot("Red potion", LootType.POTION, 7.50)
//    louise.inventory.add(redPotion)
//    val chestArmor = Loot("+3 Chest armor", LootType.ARMOR, 80.00)
//    louise.inventory.add(chestArmor)
//    val protectRing = Loot("Protection ring +2", LootType.RING, 40.25)
//    louise.inventory.add(protectRing)
//
//    louise.showInventory()
//    println(louise)
}

// OOP 4. part (List, toString)
fun lesson6_7_8() {
    val and = Player("And")
    and.weapon = Weapon("Sword", 10)
    and.show()
    println(and)

    val louise = Player("Louise", 5)
    louise.weapon = and.weapon
    louise.show()

    louise.weapon = Weapon("Spear", 14)
    louise.show()

    val redPotion = Loot("Red potion", LootType.POTION, 7.50)
    // louise.inventory.add(redPotion)

    louise.showInventory()
}

// OOP 3. part
fun lesson5() {
    val and = Player("And")
    and.weapon = Weapon("Sword", 10)
    and.show()

    val louise = Player("Louise", 5)
    louise.weapon = and.weapon
    louise.show()

    louise.weapon = Weapon("Spear", 14)
    louise.show()
}

// OOP 2. part
fun lesson4() {
    val and = Player("And")
    and.show()

    val louise = Player("Louise", 5)
    louise.show()

    val mark = Player("Mark", 4, 8)
    mark.show()

    val grenwood = Player("Grenwood", 2, 5, 1000)
    grenwood.show()

    println(grenwood.weapon.name.toUpperCase())
    println(grenwood.weapon.damageInflicted)

    val axe = Weapon("Axe", 12)
    grenwood.weapon = axe
    println(grenwood.weapon.name)
    println(axe.name)
    axe.damageInflicted = 24
    println(axe.damageInflicted)
    println(grenwood.weapon.damageInflicted)

    and.weapon = Weapon("Sword", 10)
    println(and.weapon.name)

    and.weapon = Weapon("Spear", 14)
    println(and.weapon.name)
}

// OOP 1. part
fun lesson3() {
    val and = Player("And")
    // Created show() function instead
    //    println(and.name)
    //    println(and.lives)
    //    println(and.level)
    //    println(and.score)
    and.show()

    val louise = Player("Louise", 5)
    // Moved to constructor
    // louise.level = 5
    louise.show()

    val mark = Player("Mark", 4, 8)
    mark.show()

    val grenwood = Player("Grenwood", 2, 5, 1000)
    grenwood.show()
}

// IF, WHEN
fun lesson2() {
    val lives = 0

    val isGameOver = (lives < 1)
    println(isGameOver)

    if(isGameOver) {
        println("Game over!")
    } else {
        println("You're still alive!")
    }

    println("How old are you: ")
    val age = readLine()!!.toInt()
    println("Age is $age")

    val message: String
    message = when {
        age < 18 -> "You're too young to vote"
        age == 100 -> "Congratulations!"
        else -> "You can vote!"
    }
//    if(age < 18) {
//        "You're too young to vote"
//    } else if (age == 100) {
//        "Congratulations!"
//    } else {
//        "You can vote!"
//    }

    println(message)
}

// BASIC
fun lesson1()
{
    println("My first Kotlin program")

    val name = "And."
    // Immutable compile error. use instead var
    // name = "sss"

    // compile error
    // name = null
    println("name = $name")

    val nullName: String?
    nullName = null
    println("nullname = $nullName")

    val earthAge = 365
    val earthCentury = earthAge * 21
    println("earthage = $earthAge")
    println("eartchCentury = $earthCentury")

    // MATH
    println()

    val apples = 6
    // compile error
    // var apples: Int = 6.5
    val oranges = 5
    val fruit: Int = apples - oranges
    println("fruit = $fruit")
    println("A quarter of the apples is " + apples / 4) // = 1
    println("A quarter of the apples is ${apples / 4}") // = 1

    println()
    val weeks = 130
    val years = weeks / 52.0 // = 2.5
    println("years = $years")
    // compile error
    // var years: Double = weeks / 52

    // STRING OPERATIONS
    println()

    println("My name is " + name)
    println("130 weeks in years is " + years)
    println("My name is $name")
    println("$weeks weeks in years is $years")
}