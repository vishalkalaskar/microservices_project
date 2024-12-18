package com.example.request.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="REST_TOURIST")
public class Tourist {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tid;
    
	@Column(length=20)
	@NonNull
	private String tname;
	
	@Column(length=20)
	@NonNull
	private String tcity;
	@Column(length=20)
	@NonNull
	private String packageType;
	
	@NonNull
	private Integer budget;
	
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTcity() {
		return tcity;
	}
	public void setTcity(String tcity) {
		this.tcity = tcity;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public Integer getBudget() {
		return budget;
	}
	public void setBudget(Integer budget) {
		this.budget = budget;
	}
	
}
