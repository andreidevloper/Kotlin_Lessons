class Player(val name: String,
             var level: Int = 1,
             var lives : Int = 3,
             var score : Int = 0) {
    // Moved to constructor
    // var lives = 3
    // var level = 1
    // var score = 0

    var weapon : Weapon = Weapon("First", 1)
    private var inventory = ArrayList<Loot>()

    fun show() {
        if(lives > 0) {
            println("$name is alive")
        } else {
            println("$name is dead")
        }
    }

    override fun toString() : String {
        return """
            name: $name
            lives: $lives
            level: $level
            score: $score
            $weapon
        """
    }

    fun getLoot(item : Loot) {
        inventory.add(item)
        // code to saved the inventory goes here
    }

    fun dropLoot(item : Loot) : Boolean {
        return if(inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            false
        }
    }

    fun dropLoot(name : String) : Boolean {
        var result = false
        for(item in inventory) {
            if(item.name == name) {
                inventory.remove(item)
                result = true
                break
            }
        }
        return result

//        for(item in inventory) {
//            if(item.name == name) {
//                inventory.remove(item)
//                return true
//            }
//        }
//        return false

//        var size = inventory.size - 1
//        for(i in 0..size) {
//            val item = inventory.get(i)
//            if(item.name == name) {
//                inventory.remove(item)
//                return true
//            }
//        }
//        return false

        // Remove all items if return true
        // return inventory.removeIf({it.name == name})
    }

    fun showInventory(){
        println("=======================")
        var total = 0.0
        println("$name's Inventory")
        for(item in inventory) {
            println(item)
            total += item.value
        }
        println("=======================")
        println("Total score is $total")
        println("=======================")
    }

}