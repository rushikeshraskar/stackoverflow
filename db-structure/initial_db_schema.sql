create table users(
        uid integer primary key,
        first_name varchar(64),
        last_name varchar(64),
        username varchar(64) unique not null,
        password varchar(256),
        role varchar(256),
        creation_date date,
        check ( role in ('ADMIN','USER') )
);

create table posts(
        p_id integer primary key,
        content varchar(256),
        post_type varchar(64),
        owner integer,
        parent_post integer,
        creation_date date,
        tag_id integer,
        check ( post_type in ('MAIN_POST','ANSWER_POST','COMMENT')),
        constraint fk_owner foreign key( owner ) references users(uid),
        constraint fk_tag_id foreign key(tag_id) references tags(tag_id)
);

create table votes(
        vote_id integer primary key,
        p_id integer,
        owner integer,
        creation_date date,
        vote_type varchar(56),
        check (vote_type in ('UP','DOWN')),
        constraint fk_p_id foreign key(p_id) references posts(p_id),
        constraint fk_owner foreign key(owner) references users(uid)
);

create table tags(
        tag_id integer primary key,
        tag_name varchar(256),
        creation_date date
);

drop table if exists tags;
drop table if exists votes;
drop table if exists posts;
drop table if exists users;


select * from tags;
select * from votes;
select * from posts;
select * from users;

