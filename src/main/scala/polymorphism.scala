object polymorphism extends App{
  val obj1 = new example2
  obj1.func("swift", "hatchback")
  obj1.func("honda-city", "sedan")
  obj1.func("Ashok", 95)

}

// Polymorphism is the ability of any data to be processed in more than one form.
class example2 {
  // Function 1
  def func(vehicle: String, category: String) {
    println("The Vehicle is:" + vehicle);
    println("The Vehicle category is:" + category);
  }

  // Function 2
  def func(name: String, Marks: Int) {
    println("Student Name is:" + name);
    println("Marks obtained are:" + Marks);
  }

  // Function 3
  def func(a: Int, b: Int) {
    var Sum = a + b;
    println("Sum is:" + Sum)
  }

}
