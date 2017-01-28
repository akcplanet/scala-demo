package org.test.cts.scala;

import java.util
import scala.collection.JavaConversions._
import scala.collection.mutable._
import org.test.cts.model.Book
 import scala.collection.mutable.ListBuffer

object BooksProcessor {
  def filterByAuthor(author: String)(implicit books: util.ArrayList[Book]) =  {
    books.filter(book => book.getAuthor == author)
  }
}