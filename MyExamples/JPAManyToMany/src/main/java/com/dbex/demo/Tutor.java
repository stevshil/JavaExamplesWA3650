package com.dbex.demo;

import jakarta.persistence.*; // for Spring Boot 3

@Entity
@Table(name = "tutor")
@SecondaryTable(name = "tutorial", pkJoinColumns = @PrimaryKeyJoinColumn(name = "tutorial_id", referencedColumnName = "id"))
public class Tutor {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @ManyToOne
	@JoinColumn(name = "tutorial_id")
	private Tutorial tutorial;

    public Tutor() {

    }

    public Tutor(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
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

    public Tutorial getTutorial() {
        return tutorial;
    }

    public void setTutorial(Tutorial tutorial) {
        this.tutorial = tutorial;
    }

    @Override
	public String toString() {
		return "Tutor [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
}
