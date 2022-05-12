/*
 * *
 * DDL = Data Definition Language
 * Command lines from 'handiaccess-db' folder:
 * psql -h localhost -p 5432 -U postgres -d handi
 * \i schema.ddl.sql
 * \q
 

 CREATE TABLE roles (
 	id SERIAL PRIMARY KEY,
 	name VARCHAR(60)  UNIQUE NOT NULL
 );
 
 CREATE TABLE users (
 	id SERIAL PRIMARY KEY, 
 	username VARCHAR (255) UNIQUE NOT  NULL,
 	password CHAR (60) NOT NULL,
 	role_id INTEGER,
 	CONSTRAINT fk_role_id FOREIGN KEY (role_id) REFERENCES roles(id)
 );
 */
 
 CREATE TABLE lines (
 
 id SERIAL PRIMARY KEY,
 number INTEGER NOT NULL,
 landing_door BOOLEAN

 );

/* CREATE TABLE stations(
 id SERIAL PRIMARY KEY,
 name VARCHAR(60) NOT NULL,
 lift BOOLEAN,
 escalator BOOLEAN,
 call_terminal BOOLEAN,
 ligne_id INTEGER,
 CONSTRAINT fk_ligne_id FOREIGN KEY (ligne_id) REFERENCES lignes(id)
 
 
 );
 */
 
 