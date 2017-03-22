package com.sallen

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void calculateFees() {
	//This says that when a certain task is done 
	when: "A Course has information and a cost"
	// This part defines a new course 
	def computing=new Course(title: 'BSc Hon Computing', cost:200)
	//This says what will happen
	then:"The calculateFees method will total fees"
	//This calculates the cost
	computing.calculateCost()==400
    }
}
