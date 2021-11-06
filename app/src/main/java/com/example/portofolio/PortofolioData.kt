package com.example.portofolio

object PortofolioData {
    private val title :Array<String> = arrayOf(
        "Chat App",
        "Travel App",
        "Contact App",
        "Food App",
        "Event Organized App",
        "Daily Profile App",
        "Petshop App",
        "Family Plan App",
        "Task manager App",
        "Office Automation App"
    )

    private val poster : IntArray = intArrayOf(
        R.drawable.chat,
        R.drawable.travel,
        R.drawable.phoneapp,
        R.drawable.food,
        R.drawable.event,
        R.drawable.dailyprofile,
        R.drawable.familyplan,
        R.drawable.taskmanager,
        R.drawable.office
    )

    private val link : Array<String> = arrayOf(
        "https://search.nuz.li/NmU5MmY5YTM4",
        "https://pin.it/3ttUNfs",
        "https://pin.it/77qUdZ7",
        "https://pin.it/2RdmJ7Y",
        "https://pin.it/2LhIJHX",
        "https://pin.it/BBZq5fV",
        "https://pin.it/6JuvToT",
        "https://pin.it/3tWyoXW",
        "https://pint.it/6xnCZEw",
        "https://pin.it/7pn0qvu"
    )

    val listAppAndroid: ArrayList<Portofolio>
    get() {
        val list :ArrayList<Portofolio> = arrayListOf<Portofolio>()
        for (position:Int in title.indices){
            val android = Portofolio()
            android.title = title[position]
            android.image = poster[position]
            android.link = link[position]
            list.add(android)
        }
        return list
    }

    private val titleExperience = arrayOf(
        "setifkat ini merupakan sertifikat yang diterbitkan langsung oleh Google untuk devolper Android",
        "Android pemula merupakan course yang  diadakan oleh dicoding untuk belajar program android",
        "memulai progres bahasa kotlin merupakan coourse yang bertujuan untuk mempelajari bahas kotlin",
        "memulai progres bahasa kotlin merupakan coourse yang bertujuan untuk mempelajari bahas kotlin",
        "solid principle mempeljari tentang oop, cleand code, dll"
    )

    private val imageExperience = intArrayOf(
        R.drawable.aad,
        R.drawable.androidcert,
        R.drawable.kotlincert,
        R.drawable.pythoncert
    )

    val listDataExperience:ArrayList<Portofolio>
    get() {
        val list = arrayListOf<Portofolio>()
        for (position in titleExperience.indices) {
            val experience = Portofolio()
            experience.title = titleExperience[position]
            experience.detail = titleExperience[position]
            experience.image = imageExperience[position]
            list.add(experience)
        }

        return list
    }

}