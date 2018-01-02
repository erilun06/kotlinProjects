package demo
import java.util.Scanner
import java.util.Random

fun main(args : Array<String>) {
    //val input = Scanner(System.`in`)
    // skapa basvariabler här
    val blank = "                    "
//  val blank = "********************"
    // skapa program-variabler här
 //   println("Hello, world!")

 var items = arrayOf(" WELCOME  ","   MENY  ","   test  ",blank+blank)
 // You can access values using indexes starting at 0
 //     println(items[2])
 var dos = arrayOf(" for first"," for second"," for third"," for forth"," for fifth"," for sixth"," for seventh"," for ninth"," for tenth"," to exit")
 //defines the text for the first,second,third and so on items in the menu
 //change in the final product. OBS keep the "exit option as last"

fun menu ()
{

  for (x in 0..3)
  {
      //println("Loop : $x")
      println(blank +items[x])
  }

    for (i in 0..9)//(0..x)were x is the number of menu options -2
    {
      var y=i+1
        println(blank + "PRESS "+y+dos[i])
    }
    println(blank)

}

var rep=1;

while(rep==1)//run the program over and over again until the user want to exit
{
      menu()
    // comment ONE of the folowing statements   (no 1 mainly for debugging)
    //int MenyVal=(); //1 2 3 or 4
    //var MenyVal = input.nextInt()
    //var MenyVal = readLine()
    val (MenyVal) = readLine()!!.split(' ').map(String::toInt)
    when (MenyVal) {
        1 ->
        {
          val (b) = readLine()!!.split(' ').map(String::toInt)
          println(b)
        }
        2 ->
        {
            val x= 3
            for(i in 1..x)
            {
                println("hello"+i)
            }
            val (b) = readLine()!!.split(' ').map(String::toInt)
            if (b>0)
            {


            }

        }
        3 ->
        {

        }
        4 ->
        {

        }
        5 ->
        {

        }
        6 ->
        {

        }
        7 ->
        {

        }
        8 ->
        {

        }
        9 ->
        {

        }
        10 ->
        {

        }
        11 ->
        {

        }
    }
}
}
