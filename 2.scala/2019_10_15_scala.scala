// Start writing your ScalaFiddle code here
println("Hello")

val a:Int = 43
var b:Int = 43

//val   Inmutable
//var   Mutable

//Inferencia de tipos

val c = 43
var d = 43

def mult(x:Int):Int = {x*x}
def mult2(x:Int)    = {x*x}
def mult3(x:Int = 10) = {x*x}

mult(5)
mult3()


//En Scala devuelves, entonces siempre tiene que devolver algo. NO hace falta returns
def varabs(a:Int) = {
  if(a>0){
    a
  }
  else{
    a.abs
  }
}

//Pattern matching

val x: Int = Random.nextInt(10)

//Si cumple dos conciciones, se pararía en la primera
def f1(x:Int){
  x match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
}

//
println(s"Asi se formatean strings")
val s:String = "pepe"
println(s"Asi se incluye $s")
val n:Int = 2
println(s"Asi se imprime un numero, $n (llamaria al metodo toString")


def matcherList(li:List[Int]):Int = {
  li match {
    case Nil => 0
    case head :: tail => head + matcherList(tail)
  }
}

{
  //Atención!!
  //En el pattern matching, si el nombre es con mayúsculas.
  val Name= "Alf"
  ("John","Doe") match{
    case (Name, alias) => println(s"Name is $Name")
    case (name, alias) => println(s"Name is $name")
  }
}

//RECURSIVIDAD NORMAL

def sum(x:List[Int]):Int = {
  if(x.nonEmpty){
    x.head + sum(x.tail)
  }
  else{
    0
  }
}

//TAIL RECURSIVE

def sumTail(x:List[Int]):Int = {
  def sumAux(x:List[Int], acc:Int):Int = {
    x match {
      case h::tail => sumAux(tail, h+ acc)
      case Nil => acum
    }
  }
  sumAux(x, 0)
}

//LAZY VAL

//VAL
val a = {
  println("executing a")
  5
}

println("Starting")
println(a+a)
println("ending")

//executing a
//starting
//10
//ending

//DEF
def a = {
  println("executing a")
  5
}

println("Starting")
println(a+a)
println("ending")


//starting
//executing a
//executing a
//10
//ending

//LAZY VAL
lazy val a = {
  println("executing a")
  5
}

println("Starting")
println(a+a)
println("ending")

//starting
//executing a
//10
//ending

// LAMBDAS

def stringToInt(s:String):Int = s.toInt + 10

val stringToIntLambda: String => Int = {s=>s.toInt + 10}

val stringToIntLambdaSugar: String => Int = {_.toInt + 10}

