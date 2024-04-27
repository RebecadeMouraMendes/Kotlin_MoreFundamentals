data class Eventdata(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)
enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING,
}

fun Events() {
    val event1 = Eventdata("Wake up", "Time to get up", Daypart.MORNING,  0)
  	val event2 = Eventdata("Eat breakfast", null, Daypart.MORNING,  15)
  	val event3 = Eventdata("Learn about Kotlin", null, Daypart.AFTERNOON,  30)
  	val event4 = Eventdata("Practice Compose", null, Daypart.AFTERNOON,  60)
  	val event5 = Eventdata("Watch latest DevBytes video", null, Daypart.AFTERNOON,  10)
  	val event6 = Eventdata("Check out latest Android Jetpack library", null, Daypart.EVENING,  45)
  	val events = mutableListOf<Eventdata>(event1, event2, event3, event4, event5, event6)
    val shortEvents = events.filter { it.durationInMinutes < 60 }
println("You have ${shortEvents.size} short events.")
println("Last event of the day: ${events.last().title}")
    val min = events[0].durationInMinutes
    if (min < 60) {
      println("short")
    } 
    else {
      println("long")
    }

}

fun main() {
    Events()   
}


