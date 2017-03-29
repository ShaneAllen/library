package com.sallen

class Librarian {

		String name
		String email
		String office
		String userName
		String password
		String telephone
		Library library

		String toString(){
		return name
		}

    static constraints = {
		
		name blank:false, nullable:false
		email blank:false, nullable:false, email:true
		office blank:false, nullable:false 
		userName blank:false, nullable:false, unique:true
		password blank:false, nullable:false, password:true
		telephone blank:false, nullable:false
		library blank:false, nullable:false
    }
}
