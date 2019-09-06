INSERT INTO s_roles(id, name) VALUES ('r001', 'Staff');

INSERT INTO s_roles(id, name) VALUES ('r002', 'Manager');

INSERT INTO s_users(id, username, active, id_role) VALUES ('u001', 'user001', true, 'r001');

INSERT INTO s_users(id, username, active, id_role) VALUES ('u002', 'user002', true, 'r002');

INSERT INTO s_users_passwords(id_user, password) VALUES ('u001', '$2a$10$FxGiz5r7HimbuVJoFuCDWeO/.o85wjWHiKSd9yKSmqw61iT.4W08G');

INSERT INTO s_users_passwords(id_user, password) VALUES ('u002', '$2a$10$U4viIRWnSOosXIqhQWNsb.9sHssDk7cbZd0bSkbNdSqYNe6xl3wTe');

INSERT INTO s_permissions(id, label, value) VALUES ('p001', 'lihat data transaksi', 'VIEW_TRANSAKSI');

INSERT INTO s_permissions(id, label, value) VALUES ('p002', 'edit data transaksi', 'EDIT_TRANSAKSI');

INSERT INTO s_roles_permissions(id_role, id_permission) VALUES ('r002', 'p001');

INSERT INTO s_roles_permissions(id_role, id_permission) VALUES ('r002', 'p002');