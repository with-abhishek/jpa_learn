package jpa.training.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int fees;
	private String branch;
	
	public Student() {
		super();
	}

	public Student(String name, int fees, String branch) {
		super();
		this.name = name;
		this.fees = fees;
		this.branch=branch;
	}
	
	
}
