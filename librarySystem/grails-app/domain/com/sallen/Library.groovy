package com.sallen

class Library {
	
		String building
		String address
		Int openingHours
		String location
		String studySpaces

    static constraints = {
		
		building blank:false, nullable:false
		address blank:false, nullable:false, widget:'textarea' 
		openingHours blank:false, nullable:false 
		location blank:false, nullable:false
		studySpaces blank:false, nullable:false
    }
}
