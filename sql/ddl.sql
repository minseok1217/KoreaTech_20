drop table if exists user CASCADE;
create table user
(
    id bigint generated by default as identity,
    name varchar(255),USER
        primary key (id)
);