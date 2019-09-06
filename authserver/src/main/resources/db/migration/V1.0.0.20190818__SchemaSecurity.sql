create table s_roles(
    id varchar(30),
    name varchar (100) not null,
    primary key(id),
    unique(name)
);

CREATE TABLE s_users(
    id varchar(30),
    username varchar (100) NOT NULL,
    active boolean not null,
    id_role varchar(36) not null,
    primary key(id),
    unique (username),
    foreign key(id_role) references s_roles(id)
);

CREATE TABLE s_users_passwords(
    id_user varchar(25),
    password varchar (255) NOT NULL,
    primary key(id_user),
    foreign key(id_user) references s_users(id)
);

create table s_permissions(
    id varchar(36),
    label varchar(255) not null,
    value varchar(255) not null,
    primary key(id),
    unique(value)
);

create table s_roles_permissions(
    id_role varchar(36),
    id_permission varchar(36),
    primary key (id_role, id_permission),
    foreign key(id_role) references s_roles(id),
    foreign key(id_permission) references s_permissions(id)
);