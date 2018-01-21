
enum class LootType { POTION, RING, ARMOR }

class Loot(val name : String, val lootType : LootType, val value : Double) {
    override fun toString() : String {
        return """
                loot name = $name
                loot type = $lootType
                loot value = $value
               """
    }
}