package com.stackoverflow.models;

import java.util.Date;

public class User {
    /*
    * uid integer primary key,
	first_name varchar2(64),
	last_name vachar2(64),
	username varchar2(64) unique not null,
	password varchar2(256),
	role varchar2(256),
	creation_date date,
	check ( role in ('ADMIN','USER') )
    *
    * */
    public enum ROLE{ADMIN,USER};
    private Integer uid;
    private String firstName, lastName, username, password;
    private ROLE role;
    private Date creationDate;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public ROLE getRole() {
        return role;
    }

    public void setRole(ROLE role) {
        this.role = role;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
