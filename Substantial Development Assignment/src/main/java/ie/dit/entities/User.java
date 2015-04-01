package ie.dit.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User  {

	// Instance variables
	@Id
	@Column(name = "username" ,unique=true)
	private String username;
	private String password;
	@OneToOne
	private Library library;
	
	

	public User() {
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public User(String email, String password2) {
		// TODO Auto-generated constructor stub
		username = email;
		password = password2;

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
