open class Enemy(val name : String, var hitPoints : Int, var lives : Int) {

    open fun takeDamage(damage : Int) {
        val remainingHitPoints = hitPoints - damage
        if(remainingHitPoints > 0) {
            hitPoints = remainingHitPoints
            println("$name took $damage points of damage, and has $hitPoints")
        } else {
            lives -= 1
            if(lives > 0) {
                println("$name lost a life")
            } else {
                println("$name is dead")
            }
        }
    }

    override fun toString() : String {
        return """
            name: $name
            lives: $lives
            hitPoints: $hitPoints
        """
    }
}

// lives += 9
// lives -= 8
// lives %= 2
// lives /= 3
// lives *= 2