package helloworld

object HelloWorld {
  def main(args: Array[String]) {
     println(args.toList)
     println(args.update(1, "ophir"))
    println(args.toList)
  }
}