package com.tap.entity;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="phonenumber")
	private String phonenumber;
	@Column(name="address")
	private String address;
	@Column(name="password")
	private String password;
	
	public Student() {
		super();
	}

	public Student(int id, String name, String email, String phonenumber,String address,String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.address=address;
		this.password = password;
	}

	public Student(String name, String email, String phonenumber,String address, String password) {
		super();
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.address=address;
		this.password = password;
	}
	
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phonenumber=" + phonenumber
				+ ", Address=" + address + ", password=" + password + "]";
	}
	
	
}
 