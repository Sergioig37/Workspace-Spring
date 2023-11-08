package com.spring.start.clase;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
// @Table(name="xxx) sirve para cambiarle el nombre a la tabhla
public class Tasks implements Serializable{

	
	
	@Id
	//sirve para indicar que el id es autoincremental
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column
	private String description;
	@Column
	private Integer status;
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

	
	
}
