fun main() {
 adding(mutableListOf(Library("Brotherhood","Ann Jeri",34,"Fency",87,"right"),Library("Greenhood","fin",6,"fensy",1,"left")))
 removing(mutableListOf(Library("Boold and water","Ann",56,"Treates",76,"left"),Library("Dicolonaising the Mind","hoprende",76,"Srement",23,"right"),Library("Volience","Remy",65,"yemys",23,"right ")))
 listing(mutableListOf(Library("Brotherhood","Antara",34,"Travel",90,"left"),Library("Boold and water","Quest",45,"Still",23,"left"),Library("Dicolonaising the Mind","Annty",45,"Sreet",91,"left")))


}
//Project: Simple Library Management System
//The goal of this project is to create a Simple Library Management System that
//allows users to manage a collection of books by adding,
//removing, and listing them. You will be working with Kotlin concepts
//like variables, data types, arrays, array methods, strings,
//string methods, functions, and classes.
//

data class Library(var books:String ,var auther:String, var page:Int,var tital:String, var pages:Int, var location:String)
 fun adding(name:MutableList<Library> ){
//  it addes all the items in an item into one list
  name.addAll(mutableListOf(Library("The river between","Treatenment",34,"Streates",34,"left"),Library("The tha cat and the rat","Wlter",56,"Quez",89,"right"),Library("Sisterhood","Antita",43,"Dainner",89,"left side"),Library("Dancer ahead","Steve",90,"Danger",90,"right side")))
println(name)



 }
fun removing(name:MutableList<Library>){
// Removes a single specific elenment fromthe collectiom=n of items
 name.removeAt(2)
 println(name)


}
fun listing(name:MutableList<Library>){
// Foreach it performs a give action on each element
 name.forEach { item-> println(item.books) }

}



