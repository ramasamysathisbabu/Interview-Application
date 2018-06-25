package com.interview.domain;

import javax.persistence.*;

@Entity
public class Candidate {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "prefix")
	private String prefix;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "middleName")
	private String middleName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "suffix")
	private String suffix;

	@Column(name = "phoneNumber")
	private String phoneNumber;

	@Column(name = "emailAddress")
	private String emailAddress;
	
	@Column(name = "skypeId")
	private String skypeId;

	@Column(name = "roleApplied")
	private String roleApplied;

	@Column(name = "technicalStack")
	private String technicalStack;

	@Column(name = "interviewer")
	private String interviewer;

	@Column(name = "interviewScheduleDate")
	private String interviewScheduleDate;

	@Column(name = "yearsOfExperience")
	private int yearsOfExperience;

	@Column(name = "resume")
	private String resume;

	public Candidate() {
	}

	public Candidate(String prefix, String firstName, String middleName, String lastName) {
		this.prefix = prefix;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getRoleApplied() {
		return roleApplied;
	}

	public void setRoleApplied(String roleApplied) {
		this.roleApplied = roleApplied;
	}

	public String getTechnicalStack() {
		return technicalStack;
	}

	public void setTechnicalStack(String technicalStack) {
		this.technicalStack = technicalStack;
	}

	public String getInterviewer() {
		return interviewer;
	}

	public void setInterviewer(String interviewer) {
		this.interviewer = interviewer;
	}

	public String getInterviewScheduleDate() {
		return interviewScheduleDate;
	}

	public void setInterviewScheduleDate(String interviewScheduleDate) {
		this.interviewScheduleDate = interviewScheduleDate;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getSkypeId() {
		return skypeId;
	}

	public void setSkypeId(String skypeId) {
		this.skypeId = skypeId;
	}

}
