fun main() {
    val likes = 25 //Количество лайков
    val declination = if(likes==0){  //Выбор склонения
        "никому"
    } else if (likes%10==1){
        "человеку"
    } else {
        "людям"
    }
    println("Понравилось${if (likes==0) "" else " $likes"} $declination") //Вывод в консоль
}