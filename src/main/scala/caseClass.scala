object caseClass extends App{

  // we do not use new keywords for making an object
  val alice = Person("Alice", 25, "Software Engineer")
  val bob = Person("Bob", 30, "Product Manager")
  println(alice)
  println(bob)
  // we can use copy method to create new instance of the class
  val older = alice.copy(age = alice.age + 1)
  println(older)

  // we can test for equality between two instances
  val isAlice = alice == Person("Alice", 25, "Software Engineer")
  println(isAlice)

}

// case class are lightweight data structure
case class Person(name: String, age: Int, occupation: String)
