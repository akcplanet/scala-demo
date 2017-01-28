package org.test.cts.scala;

import org.test.cts.storage.BookStorage

object ScalaRunner {

  def main(args: Array[String]) {
    implicit val books = (new BookStorage()).getBooks
    BooksProcessor.filterByAuthor("Jules Verne").foreach(b => println(b))
  }
  

}