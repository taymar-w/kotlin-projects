//MAD LIBS

fun main () {
  
  val costOfGas = 2.28
  val mileage = 25
  // Declare the variable distance below   
  val distance: Int
  println("What's your name?")
  var name = readLine()
  // Write your code below
  println("Enter a friend's name.")
  var friendsName = readLine()

  println("Enter an adjective.")
  var adjective = readLine()

  println("Enter a city.")
  var city = readLine()

  println("Enter a band name.")
  var bandName = readLine()

  println("Enter a type of Job.")
  var work = readLine()

  println("Enter distance.")
  distance = Integer.valueOf(readLine())
  
  var totalForGas = (costOfGas/mileage) * distance

  var totalForGas = Math.round(totalForGas * 100)/100.00
  var totalMoneySaved = totalForGas + 200


  println("""
    A long time ago, $name and their friend $friendName planned a(n) $adjective road trip to see their favorite band: $bandName. 
    The venue was $distance miles away which meant they needed to save $ $totalForGas dollars to get there.\n
    Both of them worked as $work for the whole summer and managed to save up a total of $ $totalMoneySaved dollars!
    To celebrate, they ended up driving to $city for the whole weekend; seeing their band and buying $bandName t-shirts to remember their trip.
    """.trimIndent())
}