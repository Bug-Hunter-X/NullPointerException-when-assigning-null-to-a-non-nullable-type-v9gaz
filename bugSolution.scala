```scala
object Main extends App {
  val x: Option[Int] = None // Or Some(10) if a value is present

  // Safe access using pattern matching
  x match {
    case Some(value) => println(s"Value: $value")
    case None => println("Value is not available")
  }

  //Safe access using getOrElse
  println(s"Value or default: "+ x.getOrElse(0)) 
}
```