package com.sallen

class Book {

		String title
		String subject 
		String author
		String isbn
		Date dateBorrowed
		Date returnDate
		string student
		boolean overdue
		Library library

		static hasMany=[students:Student,bookReviews:BookReview]

    static constraints = {
		
		title blank:false, nullable:false
		subject blank:false, nullable:false
		author blank:false, nullable:false
		isbn blank:false, nullable:false min:4, max:10
		dateBorrowed blank:false, nullable:false
		returnDate blank:false, nullable:false
		student blank:false, nullable:false
		overdue? blank:false, nullable:false
		
    }
}
