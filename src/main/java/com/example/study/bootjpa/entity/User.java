package com.example.study.bootjpa.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="t_user")
public class User implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
	@SequenceGenerator(name = "user_id_seq", sequenceName = "t_user_id_seq")
	private Long id;
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


	public void setId(Long value) {
		this.id = value;
	}

	public Long getId() {
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

