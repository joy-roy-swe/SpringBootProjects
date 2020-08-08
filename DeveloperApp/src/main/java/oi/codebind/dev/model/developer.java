package oi.codebind.dev.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class developer {
	
	@Id
	private int id;
	private String name;
	private String lang;
	private String password;
	
	public developer() {
		
	}

	public developer(int id, String name, String lang, String password) {
		super();
		this.id = id;
		this.name = name;
		this.lang = lang;
		this.password = password;
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

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "developer [id=" + id + ", name=" + name + ", lang=" + lang + ", password=" + password + "]";
	}

	
	
	
	

}
