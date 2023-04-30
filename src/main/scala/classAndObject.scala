object classAndObject extends App{
  var obj1 = new Smartphone("Pro") // creating an Instance of a Class
  obj1.display()
}
class Smartphone(category: String) {          // class with primary constructor
  var model: Int = 12
  val name: String = "Apple"

  def display(): Unit = {
    println("Name of the company is :" + name)
    println("model of the phone is :" + model)
    println("Category of phone is :" + category)
  }

  def this(name: String, category: String) {      // Auxiliary Constructor
    // invoking primary constructor
    this(category)
    this.model = model

  }

}