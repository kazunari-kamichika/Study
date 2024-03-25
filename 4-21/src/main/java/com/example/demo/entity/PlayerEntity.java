package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Player")

public class PlayerEntity {
	
	/**
	 * ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	/**
	 * 名前
	 */
	@Column(name = "name")
	private String name;
	
	/**
	 * 学校名
	 */
	@Column(name = "school")
	private String school;
	
	/**
	 * 部活
	 */
	@Column(name = "club")
	private String club;
	
	/**
	 * 種目
	 */
	@Column(name = "sports_event")
	private String sports_event;
	
	
	

}
