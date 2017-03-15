package com.sallen

class BookReview {

		String book
		Date dateCreated
		String student
		String review
		static hasMany=[students:Student,books:Book]

    static constraints = {

		book blank:false, nullable:false
		dateCreated blank:false, nullable:false
		student blank:false, nullable:false
		review blank:false, nullable:false, maxSize:5000, widget:'textarea'
    }
}
