package com.stackoverflow.models;


import java.util.Date;

public class Vote {

    private Integer voteId, pId, owner;

    private Date creationDate;
    private VOTE_TYPE voteType;

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
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

    public VOTE_TYPE getVoteType() {
        return voteType;
    }

    public void setVoteType(VOTE_TYPE voteType) {
        this.voteType = voteType;
    }

    /**
     * create table votes(
     * vote_id integer primary key,
     * p_id integer,
     * owner integer,
     * creation_date date,
     * vote_type varchar(56),
     * check (vote_type in ('UP','DOWN')),
     * constraint fk_p_id foreign key(p_id) references posts(p_id),
     * constraint fk_owner foreign key(owner) references users(uid)
     * );
     */

    public enum VOTE_TYPE {UP, DOWN}
}
