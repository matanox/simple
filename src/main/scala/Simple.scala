/*

import scala.collection.mutable.HashMap
import scala.reflect._
import scala.reflect.runtime.universe._

object Simple extends App {

  trait Node[+keyType] {
    /* a function returning an ID value, required for graph indexing */
    def key: keyType
    
    /* a function providing serialization to CSV */
    def toCsvRow: String 
  }  
  
  case class A(foo: Int) extends Node[Int] {
    def toCsvRow = foo.toString
    def key: Int = foo
  }
  
  case class B(foo: String) extends Node[String] {
    def toCsvRow = foo.toString
    def key: String = foo
  }
    
  def Traverse(l: List[Node[Any]]) {
    l foreach { node =>
      println(node.key.toString)
      node match {
        case A(n) => println("is an A")  
        case B(n) => println("is a B")
      }
    }
  }
  
  def add[T: TypeTag](node: Node[T]) {
    node match {
      case _:Node[_] if (typeOf[T] =:= typeOf[Node[Int]]) => intIndex put (node.asInstanceOf[Node[Int]].key, node) 
      case _:Node[_] if (typeOf[T] =:= typeOf[Node[String]]) => stringIndex put (node.asInstanceOf[Node[String]].key, node) 
    }
  }
    
  val intIndex = new HashMap[Int, Node[Any]]
  val stringIndex = new HashMap[String, Node[Any]]
  
  Traverse(List(A(3), B("foo")))

}

*/