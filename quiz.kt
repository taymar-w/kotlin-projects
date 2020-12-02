fun main() {
  val quizAnswer1 = 15
  var quizAnswer2 = 3
  val quizAnswer3 = "isosceles"
  val quizAnswer4 = 47
  var points = 0
  // Write your code below
 println("What is 75 / 5?")
 val studentAnswer1 = Integer.valueOf(readLine())
 println("Solve for y. 6 * 2y = 36")
 val studentAnswer2 = Integer.valueOf(readLine())
 println("Name the type of Triangle that has two equal sides.")
 val studentAnswer3 = readLine()
 println("Find the value of 8 * 6 - (3 - 2)")
 val studentAnswer4 = Integer.valueOf(readLine())

//Question 1
if(studentAnswer1 == quizAnswer1){
  points += 25
}
//Question 2
if(studentAnswer2 == quizAnswer2){
  points += 25
}else if(studentAnswer2 == quizAnswer2++ ||studentAnswer2 == quizAnswer2-- ){
 points += 20
println("The answer $studentAnswer2 is within 1 point of $quizAnswer2 .")
}
//Question 3
if(studentAnswer3 == quizAnswer3){
  points += 25
}else if(studentAnswer3 == "equilateral"){
  points += 10
}else{
  points++
}
//Question 4
if(studentAnswer4 == quizAnswer4){
  points += 25
}else if(studentAnswer4 in 44..54){
  points += 20
}else{
  points++
}

//FINAL GRADE
if(points in 0..59){
  println("You got an F")
}
if(points in 60..69){
  println("You got an D")
}
if(points in 70..79){
  println("You got an C")
}
if(points in 80..89){
  println("You got an B")
}
if(points in 90..100){
  println("You got a A")
}
if(points in 101..110){
  println("You got an A+")
}


}