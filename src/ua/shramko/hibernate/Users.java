package ua.shramko.hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity (name="users")
public class Users {

	@Id
	private int id;
	@Column(name="name")
	private String Name;
	private String LastName;
	private Date Date_Birth;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getDate_Birth() {
		return Date_Birth;
	}
	public void setDate_Birth(Date date_Birth) {
		Date_Birth = date_Birth;
	}
	
	
}
