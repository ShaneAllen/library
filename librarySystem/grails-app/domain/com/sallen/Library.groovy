package com.sallen

class Library {
	
		String building
		String address
		Int openingHours
		String location
		String studySpaces
		Librarian librarian
		Book book

		static hasMany[students:Student]

    static constraints = {
		
		building blank:false, nullable:false
		address blank:false, nullable:false, widget:'textarea' 
		openingHours blank:false, nullable:false 
		location blank:false, nullable:false
		studySpaces blank:false, nullable:false
		librarian blank:false, nullable:false
		book blank:false, nullable:false
    }
}
