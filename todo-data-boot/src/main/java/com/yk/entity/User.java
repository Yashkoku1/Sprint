package com.yk.entity;
 
import java.util.List;
 
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
 
@Entity
@Table(name="users")
public class User {
	@Id
	@NotNull
	private int uid;
	@Column(length = 30)
	@NotEmpty
    @Pattern(regexp="[A-Za-z]+" , message = "the name only contain character")
	private String uname;
	@OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
	private List<Todo> todos;

 
	public User() {
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}

}

