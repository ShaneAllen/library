package com.sallen

class BootStrap {

    def init = { servletContext ->
	
		def library = new Library(
		building: 'Library',
		address: "'Division Street'",
		openingHours: '12:00 - 18:00',
		location: 'Division Street',
		studySpaces: 3
		).save()
		
		def librarian = new Librarian (
		name: 'ShaneAllen',
		email: 'Shane.allen@outlook.com',
		office: 'Library123',
		username: 'Sallen',
		password: 'password',
		telephone: '01226353252',
		library: library
		).save()

		def course = new Course(
		title: 'Computing',
		code: '2500',
		leader: 'Sallen',
		department: 'Computing',
		description: "'Course to learn computing'",
		studyMode: 'Sessions', 
		startDate: new Date('17/11/2013'),
		endDate: new Date('17/12/2013'),
		cost: 200
		).save()

		def student = new Student(
		name: 'Sam Allen',
		email: 'Sallen@msn.com',
		username: 'Sallen',
		password: 'Password',
		studentID: '2103434',
		course: course, 
		library: library
		).save()

		def book2 = new Book(
		title:'Computing for dumbies',
		subject: 'Computing',
		author: 'Billy',
		isbn: '22123',
		dateBorrowed: new Date('12/02/12'),
		returnDate: new Date('12/03/12'),
		student: student,
		overdue: true,
		library: library		
		).save()

		def review = new BookReview(
		book: book2,
		datePublished: new Date('12/03/12'),
		student: student,
		review: "'This is rubbish '"
		).save()

		def library1 = new Library(
		building: 'Library2',
		address: "'Division Street'",
		openingHours: '12:00 - 18:00',
		location: 'Division Street',
		studySpaces: 50
		).save()
		
		def librarian1 = new Librarian(
		name: 'Lee Catling',
		email: 'Lee.Catling@outlook.com',
		office: 'Library123',
		username: 'Lcatling',
		password: 'password',
		telephone: '01226353252',
		library: library1
		).save()

		def course1 = new Course(
		title: 'Maths',
		code: '2500',
		leader: 'Lcatling',
		department: 'Maths',
		description: "'Course to learn maths'",
		studyMode: 'Sessions', 
		startDate: new Date('17/11/2013'),
		endDate: new Date('17/12/2013'),
		cost: 200
		).save()

		def student1 = new Student(
		name: 'Luke Greenwood',
		email: 'Lgreenwood@msn.com',
		username: 'Lgreedwood',
		password: 'Password',
		studentID: '2103434',
		course: course1, 
		library: library1
		).save()

		def book1 = new Book(
		title:'Mathsfor dumbies',
		subject: 'Maths',
		author: 'Ryan',
		isbn: '123343',
		dateBorrowed: new Date('12/02/12'),
		returnDate: new Date('12/03/12'),
		student: student1,
		overdue: false,
		library: library1		
		).save()

		def review1 = new BookReview(
		book: book1,
		datePublished: new Date('12/03/12'),
		student: student1,
		review: "'This is rubbish '"
		).save()

	library.addToStudents(student)
	library1.addToStudents(student1)

	library.addToBooks(book2)
	library1.addToBooks(book1)

	library.addToLibrarians(librarian)
	library1.addToLibrarians(librarian1)

	course.addToStudents(student)
	course1.addToStudents(student1)

	student.addToBooks(book2)
	student1.addToBooks(book1)
	student.addToBookReviews(review)
	student1.addToBookReviews(review1)

	book2.addToBookReviews(review)
	book1.addToBookReviews(review1)
    }
    def destroy = {
    }
}
