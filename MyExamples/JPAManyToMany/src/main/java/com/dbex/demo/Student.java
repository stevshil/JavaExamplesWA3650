package com.dbex.demo;

import jakarta.persistence.*; // for Spring Boot 3

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "student")
public class Student {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="registered")
    private boolean registered;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(
        name = "student_tutorial",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "tutorial_id"))
    private Set<Tutorial> takesTutorials = new HashSet<>();


    public Student() {

    }

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        registered = true;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean isRegistered) {
        this.registered = isRegistered;
    }

    @Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", registered=" + registered + "]";
	}
}
