package jpa.training.dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jpa.training.entity.Student;
import jpa.training.utils.PersistenceUtil;

public class StudentRepo {

	static EntityManager entityManager = PersistenceUtil.getEntityManager();

	public static void persist(Student stu) {
		System.out.println(">>>>>>>>>>>>>>> persist >>>>>>>>>>>>>");
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(stu);
		tx.commit();
		System.out.println("<<<<<<<<<<<<<<  persist <<<<<<<<<<<<<<");
	}

	public void findAndUpdate(int id) {
		System.out.println(">>>>>>>>>>>>>>> findAndUpdate >>>>>>>>>>>>>");
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		Student find = entityManager.find(Student.class, id);
		System.out.println("Find: " + find);
		find.setName(find.getName() + "Jo");
		System.out.println("Update: " + find);
		tx.commit();
		System.out.println("<<<<<<<<<<<<<<  findAndUpdate <<<<<<<<<<<<<<");
	}

	public static void findAndDelete(int id) {
		System.out.println(">>>>>>>>>>>>>>> findAndDelete >>>>>>>>>>>>>");
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		Student find = entityManager.find(Student.class, id);
		System.out.println("Find: " + find);
		find.setName(find.getName() + "123");
		entityManager.remove(find);
		tx.commit();
		System.out.println("<<<<<<<<<<<<<<  findAndDelete <<<<<<<<<<<<<<");
	}
	
	public List<Student> findAll() {
		return entityManager.createQuery("select s from Student s  order by s.age asc", Student.class).getResultList();
	}
	
	
}
