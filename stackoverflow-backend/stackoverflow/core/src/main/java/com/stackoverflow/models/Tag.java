package com.stackoverflow.models;

import java.util.Date;

public class Tag {
    /**
     * create table tags(
     * tag_id integer primary key,
     * tag_name varchar(256),
     * creation_date date
     * );
     */

    private Integer tagId;
    private String tagName;
    private Date creationDate;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
