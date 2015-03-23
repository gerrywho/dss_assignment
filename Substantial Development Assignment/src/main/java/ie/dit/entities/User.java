package ie.dit.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {

	// Instance variables
	@Id
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@OneToOne(fetch=FetchType.LAZY)
	  @JoinColumn(name="id")
	  private Library lib;

	

	public Library getLib() {
		return lib;
	}

	public void setLib(Library lib) {
		this.lib = lib;
	}

	public User() {
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
