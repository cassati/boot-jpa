package com.example.study.bootjpa.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="t_user")
public class User implements Serializable {
	
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String name;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String salt;
	@Column
	private String remark;


	public void setId(Integer value) {
		this.id = value;
	}

	public Integer getId() {
		return this.id;
	}
	public void setName(String value) {
		this.name = value;
	}

	public String getName() {
		return this.name;
	}
	public void setUsername(String value) {
		this.username = value;
	}

	public String getUsername() {
		return this.username;
	}
	public void setPassword(String value) {
		this.password = value;
	}

	public String getPassword() {
		return this.password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}

