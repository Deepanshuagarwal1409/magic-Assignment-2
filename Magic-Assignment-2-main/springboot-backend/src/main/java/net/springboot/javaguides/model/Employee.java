package net.springboot.javaguides.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document(collection="employee")

public class Employee {
	
	@Id  //primary key
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	
	//@Column(name="first_name",nullable=false)
	private String firstName;
	
	//@Column(name="last_name")
	private String lastName;
	
	//@Column(name="email")
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}