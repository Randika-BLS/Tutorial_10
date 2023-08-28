package T10

object Q02 {
 def countLetterOccurence(words:List[String]):Int={
   val count=words.map(_.length)
   val totalLetters=count.reduce(_+_)
   totalLetters
 }
  
  def main(args:Array[String]){
    println("Enter words seperated by spaces: ");
    val input=scala.io.StdIn.readLine()
    val inputWord=input.split(" ").toList
    val countLetter=countLetterOccurence(inputWord)
    println(s"Total count of letter occurence: $countLetter")
  }
}
