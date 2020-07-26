package com.stackoverflow.models;

import java.util.Date;

public class Post {

    /*
    * create table posts(
	p_id integer primary key,
	content varchar2(256),
	post_type varcha2(64),
	owner integer references users.uid,
	parent_post integer,
	creation_date date,
	tag_id integer references tags.tag_id,
	check ( post_type in ('MAIN_POST','ANSWER_POST','COMMENT'))
    )
    * */
    public enum POST_TYPE {MAIN_POST,ANSWER_POST,COMMENT};

    private Integer pId;
    private String content;
    private POST_TYPE postType;
    private Integer owner;
    private Date creationDate;
    private Integer tagId;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public POST_TYPE getPostType() {
        return postType;
    }

    public void setPostType(POST_TYPE postType) {
        this.postType = postType;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
}
