fun main() {
    val myFirstDice = Dice(6)
    var diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")
    
    val mySecondDice = Dice(10)
    println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
}


class Dice(val numSides : Int) {
    

    fun roll(): Int {
        return (1..numSides).random()
   		
    }
}