package edu.temple.flossplayer

import org.json.JSONObject
const val ID = "book_id"
const val TITLE = "book_title"
const val AUTHOR = "author_name"
const val COVER = "cover_uri"
const val DURATION = "duration"
data class Book (val book_id: Int, val title: String, val author: String, val coverUri: String,val duration : Int) {

    constructor(book: JSONObject) : this(
        book.getInt(ID),
        book.getString(TITLE),
        book.getString(AUTHOR),
        book.getString(COVER),
        book.getInt(DURATION)
    )

}