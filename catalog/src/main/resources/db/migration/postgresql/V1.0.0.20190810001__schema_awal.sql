create table product (
    id varchar (36),
    code varchar (100) not null,
    name varchar(225) not null,
    price numeric (19,2) not null,
    primary key (id),
    unique (code)
);