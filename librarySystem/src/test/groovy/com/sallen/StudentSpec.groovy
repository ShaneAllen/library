package com.sallen

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
	//This is what we'll be testing
	when:"A Student has name, ID and course"
	//Defining a new student
	def student = new Student(name:'Janet Taylor', studentID:'45907812')
	//what will happen
	then:"the stirng method will merge them"
	//Merges it to a string
	student.toString()=='Janet Taylor, 45907812'
}
}
