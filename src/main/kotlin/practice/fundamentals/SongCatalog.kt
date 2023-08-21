package practice.fundamentals

/*
* Imagine that you need to create a music-player app.
* Create a class that can represent the structure of a song. The Song class must include these code elements:
*
* - Properties for the title, artist, year published, and play count
* - A property that indicates whether the song is popular. If the play count is less than 1,000, consider it unpopular.
* - A method that prints a song description in this format:
"[Title], performed by [artist], was released in [year published]."
* */

class Song(
    private val title: String,
    private val artist: String,
    private val yearPublished: Int,
    private var playCount: Int
) {
    val isPopular: Boolean
        get() = playCount > 1000

    fun play() {
        playCount++
    }

    fun description() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}

fun main() {
    val song = Song("The Mesopotamians", "They Might Be Giants", 2007, 1000)
    song.play()
    song.description()
    println(song.isPopular)
}