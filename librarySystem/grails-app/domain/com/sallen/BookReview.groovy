package com.sallen

class BookReview {

		Book book
		Date datePublished
		Student student
		String review

		String toString(){
		return book
		}


    static constraints = {

		book blank:false, nullable:false
		datePublished blank:false, nullable:false
		student blank:false, nullable:false
		review blank:false, nullable:false, maxSize:5000, widget:'textarea'
    }
}
