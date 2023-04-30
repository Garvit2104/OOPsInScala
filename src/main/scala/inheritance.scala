object inheritance extends App{
  val aDog = new Dog("Fido", "Rottweiler")
  val aMammal = new Mammals("Cow")

  aDog.bark()
  println(aDog.age)
  aMammal.speak()
  val aCarn = new Carnivore("Lion")
  aCarn.eat()
}
//  Multilevel Inheritance And Hierarchical Inheritance

class Animal(name: String) { // Constucor definition
  def speak() = println(s"Animal $name can make sound")
}

class Mammals(var name: String) extends Animal(name) {
  val age: Int = 5 // constuctor arguement and field are not same

}

class Dog(name: String, breed: String) extends Mammals(name) {
  def bark() = println(s"Dog $name makes a lots of noise")
}

class Carnivore(name: String) extends Animal(name: String) {
  def eat() = println(s"$name eats another animal")

}

