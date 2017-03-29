package com.sallen

class Course {

		String title
		String code
		String leader
		String department
		String description
		String studyMode
		Date startDate
		Date endDate
		double cost
		
		static hasMany=[students:Student]

		double calculateCost(){
		2*cost
		}
		
		String toString(){
		return title
		}


    static constraints = {
		
		title blank:false, nullable:false
		code blank:false, nullable:false
		leader blank:false, nullable:false
		department blank:false, nullable:false
		description blank:false, nullable:false, maxSize:5000, widget:'textarea'
		studyMode blank:false, nullable:false
		startDate blank:false, nullable:false
		endDate blank:false, nullable:false
		cost blank:false, nullable:false, scale:2
    }
}
