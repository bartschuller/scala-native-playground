import scalanative.native._

object Foo {
  def main(args: Array[String]): Unit = {
    println(Bar.a)
    Demo.demo()

    val people = (1 to 10).map(n => Person(s"Bob$n", Seq.empty))
    val harry = Person("Harry", people)
    println(sizeof[Person])
    println(harry.show)
  }
}
