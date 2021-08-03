object Keyword2{
  def main(args: Array[String]){
    var p=10; // var is mutable
    println("P = "+p)
    p+=100 //p is mutated
    println("P = "+p)

    //Immutable variables
    val q=5 //val is immutable
    println("Q = "+q)
    //q+=100  *it gives error bcz its immutable
    println("Q = "+q)
  }
}