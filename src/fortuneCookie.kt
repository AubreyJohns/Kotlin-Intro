fun main(){
    print("Your fortune is: ${getFortuneCookie()}")
}

fun getFortuneCookie(): String {
    val fortunes = listOf ("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    print("Enter your birthday: (day only e.g 9)    ")
    val  birthday = (readLine().toString())?.toIntOrNull() ?: 1
    if (fortunes[birthday%7] != "Take it easy and enjoy life!"){
        for(fortune in fortunes){
            print("Try your luck till you get: Take it easy and enjoy life!\n")
            print("Enter your birthday: ")
            val  birthday = (readLine().toString())?.toIntOrNull() ?: 1
            if (fortunes[birthday%7] == "Take it easy and enjoy life!") {4
                println("Your fortune is: Take it easy and enjoy life!")
                break
            }
            }
        }
    return fortunes[birthday % 7]
}
