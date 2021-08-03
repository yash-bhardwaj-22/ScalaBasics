class Demo{
  var name = "Rahul";
  var age = 22;
  var position ="intern";

  def show(){
    println("Hello! my name is "+name+" and age is "+age);
    println("I am working as a "+position);
  }
}

object Demo{
  def main(args: Array[String]): Unit = {
    var ob = new Demo();
    ob.show();
  }
}

