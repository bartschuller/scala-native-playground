
case class Person(name: String, friends: Seq[Person]) {
  def show: String = s"$name is friends with ${friends.map(_.name).mkString(", ")}"
}
