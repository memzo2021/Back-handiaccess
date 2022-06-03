 /*
 * DDL = Data Definition Language
 * Command lines from 'handiaccessdb' folder:
 * psql -h localhost -p 5432 -U postgres -d handiaccessdb
 * \i schema.ddl.sql
 * \q
 */
 
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
 
 
CREATE TABLE lines (
 id SERIAL PRIMARY KEY,
 number  INTEGER NOT NULL,   
 landing_door BOOLEAN NOT NULL 
 );

CREATE TABLE stations(
 id SERIAL PRIMARY KEY,
 name VARCHAR(60)  UNIQUE NOT NULL,
 lift BOOLEAN NOT NULL,
 escalator BOOLEAN NOT NULL,
 call_terminal BOOLEAN NOT NULL
   
 );
CREATE TABLE lines_stations(
 	line_id INTEGER,
	station_id INTEGER,
  	PRIMARY KEY (line_id, station_id),
  	CONSTRAINT fk_line_id
    	FOREIGN KEY(line_id)
    	REFERENCES lines(id),
  	CONSTRAINT fk_station_id
    	FOREIGN KEY (station_id)
    	REFERENCES stations(id)
 );

