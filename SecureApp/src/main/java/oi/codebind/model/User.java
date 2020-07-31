package oi.codebind.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private int id;
	private String name;
	private String password;
	private String lang;
	
	public User() {
		
	}
	
	public User(int id, String name, String password, String lang) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.lang = lang;
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
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", lang=" + lang + "]";
	}
	
	
	

}
