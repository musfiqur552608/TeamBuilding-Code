fun main() {
    val personNames = arrayOf(
        "BM Salauddin", "Arpita Saha", "Md. Asraful Islam", "Syed Raihanuzzaman",
        "MD. Mahabub Rabbani", "Saif", "Alomgir Hossain", "Md. Abid Hassan", "Hasnat Ahmed",
        "Yeamin Hasan", "Md. Rumman Mahfuz", "A.N.M Shaiful Hasan Khan", "Md. Ahasanul Haque",
        "Lelin Chakma", "Nu Cha Prue Marma", "Md. Sihab Uddin", "Sohel", "Md. Sohag",
        "Mohammad Anwar Hossain Polash", "Shuvajit Roy", "MD. Jahid Khan",
        "Taskin Jahan Mantasha", "Mst. Tahera Sultana", "Maharu Akter Onika"
    )

    val selectedPersons = mutableSetOf<String>()
    var count = 1
    while (selectedPersons.size < personNames.size) {
        val randomPersons = mutableListOf<String>()
        while (randomPersons.size < 4) {
            val randomIndex = (0 until personNames.size).random()
            val personName = personNames[randomIndex]
            if (!selectedPersons.contains(personName)) {
                randomPersons.add(personName)
                selectedPersons.add(personName)
            }
        }
        println("TEAM: $count")
        println()
        for(i in randomPersons){
            println(i)
        }
        count=count+1
        println()
    }
}
