

object my_sheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
 //below fnction is used to check weather a give string has unique cahrs or not.
def isUnique(str: String, chrs: Set[Char] = Set()): Boolean =
  str.length == 0 || !chrs(str.head) && isUnique(str.tail, chrs + str.head)
                                                  //> isUnique: (str: String, chrs: Set[Char])Boolean
isUnique("abcdexf")                               //> res0: Boolean = true
isUnique("")                                      //> res1: Boolean = true
isUnique("Harkamal")                              //> res2: Boolean = false

def reverse(s:String):String={
if (s.isEmpty) ""
else  reverse(s.tail) + s.head
}                                                 //> reverse: (s: String)String
reverse("Harkamal")                               //> res3: String = lamakraH


val reverseString = (str: String) => str.foldLeft("")((accumulator, nextChar) => nextChar + accumulator)
                                                  //> reverseString  : String => String = my_sheet$$$Lambda$8/672320506@2acf57e3
reverseString("hi")                               //> res4: String = ih
val a:Int = 7                                     //> a  : Int = 7

def h() = {"this str gets returned"}              //> h: ()String
h()                                               //> res5: String = this str gets returned
}