val lst = List(('a', 1), ('b', 1), ('c', 1), ('d', 1))


def builder(ls:List[(Char, Int)]):List[List[(Char, Int)]] = {
  ls match {
    case x::xs =>builder(xs):::List(ls)
    case x:: Nil => List(List(x))
    case Nil => List(List())
  }
}

builder(lst)

List(1,2,3):::List(4,5,6)
