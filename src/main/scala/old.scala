class old {
  
  
  //class P[T <: List[Int]]
  //val p = new P[List[Int]]
  
  //class Q[T[T1 <: Int] <: List[Int]]
  //class D[T <: Seq[Int], T1[T1 <: T] <: T](s: Seq[T])
  
  //class A[T <: Int](s: Seq[Int]) { }
  //class B extends A[Int](Seq(3,4))
  
  //class A1[T](i: Seq[T])
  //class B1 extends A1[Int](Seq(3))
  
  //def foo[T] {}
  
  
  //class C(s: Int) { val a = 3 }
  //val c = new C(3)
  
  //class CC[A[T]](s: A[Int])
  
  //class QQ extends P[Q]
  
  //def a(implicit f: A[Int]) = { }

  //trait W
  //class X extends V with W

  /* higher kinded I */
  
  
  /*
  class D[T]
  val d = new D[(Float, Int) => Int]
   
  /* higher kinded II */
  class E[T <: List[Int] => Int]

  /* self type */
  class C
  trait T {
    self: C => 
  }

  class CC extends C
  
  class S[T <: List[{ def get: Int }]]
  
  class U[T <: { def get: Int }]
  */
  /*
  class A[T]
  val a = new A[Int]
  
  class U[T <: { def get: Int }]
  */
  


}