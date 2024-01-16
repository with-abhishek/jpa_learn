package jpa.training;

import jpa.training.dao.StudentRepo;
import jpa.training.entity.Student;

public class Runner {
	
	static StudentRepo stuRepo = new StudentRepo();
	public static void main(String[] args) {
		save();
//		stuRepo.findAndUpdate(1);
//		stuRepo.findAndDelete(3);
//		System.out.println("Operation completed");
//		
//		List<Student> findAll = stuRepo.findAll();
//		findAll.forEach(System.out::println);
		
//		for (Student student : findAll) {
//			System.out.println(student);
//		}
//		stuRepo.findAndUpdate(1);
//		StudentRepo.findAndDelete(1);
//		System.out.println("..........");
	}

	private static void save() {
		Student stu1 = new Student("Vimal",2400,"EE");
		Student stu2 = new Student("Rajesh",2500,"ECE");
		Student stu3 = new Student("Sanket",2600,"CE");
		stuRepo.persist(stu1);
		System.out.println("Successully save in db" + stu1);
		stuRepo.persist(stu2);
		System.out.println("Successully save in db" + stu2);
		stuRepo.persist(stu3);
		System.out.println("Successully save in db" + stu3);
	}

}
