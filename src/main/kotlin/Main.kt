fun main() {
    val  myHuman =Human("Jacklyne",164.84,64.13,"chocolate","Female")
    myHuman.rest(8)
    myHuman.identity("Jackline","female")

    var myHuman2 =Humans ("Ruth",18,65)

    println(myHuman2.birthday())
    println(myHuman2.speak("I am a student"))
    println(myHuman2.eat(5))
    println(myHuman2.weigth)
}
//create a class called Human with the properties name gender color height and weight. i)
// create two functions one called rest and the other one identitiy. function rest prints out
// "sleep eight hours and am female and my name is Jacklyne."

class Human(val name:String,val height:Double,val weight:Double,val color:String,val gender:String){


    fun rest(sleephours:Int){
        println("Sleep $sleephours hours")

    }
    fun identity(name: String,gender:String){
        println("I am a $gender and my name is $name")

    }
}

//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten
//(3 points)
//-
//- speak(speech: String) :Prints the string passed to it (2
//points)
//- birthday( ) :Increments the human’s age by 1 (2
//points)
class Humans(val name:String,var age:Int,var weigth:Int){


    fun eat(foodweigth:Int){
        println("I am eating $foodweigth kgs of fruit")
        weigth+=foodweigth
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age += 1

    }
}