package br.com.mlib.esfinge.cassandra.kundera.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
public class User {
	
	@Getter @Setter
	@Id
	@Column(name="lastname")
	private String lastname;
	
	@Getter @Setter
	@Column(name="age")
	private int age;
	
	@Getter @Setter
	@Column(name="city")
	private String city;
	
	@Getter @Setter
	@Column(name="email")
	private String email;
	
	@Getter @Setter
	@Column(name="firstname")
	private String firstname;
	
	public User() {
		
	}

}
