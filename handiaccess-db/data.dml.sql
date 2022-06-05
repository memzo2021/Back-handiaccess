 /*Data Lanipulation Language
 * Command lines from 'handiaccess-db' folder:
 * psql -h localhost -p 5432 -U postgres -d handiaccessdb
 * \i data.dml.sql
 * \q
 */
DELETE FROM users;
DELETE FROM roles;
DELETE FROM lines;
DELETE FROM stations;
DELETE FROM lines_stations;



 
 
 
  INSERT INTO roles (name) VALUES ('ROLE_ADMIN');

  INSERT INTO users (username, password, role_id) VALUES ('mahomedmachel@gmail.com','$2a$12$ptxQNPEXGEIi09oZ6LeK1OlJDSR6sodhhFn8rSII3H45bss7/hsIm',(SELECT r.id FROM roles r WHERE r.name = 'ROLE_ADMIN'));
  INSERT INTO users (username, password) VALUES ('memzohabou@gmail.com','$2a$10$jtjVcOpwmLp4Zqn2vHYLUeTSqnXxrvU3FIzuFI2nt62U1FAAbhq3S');

    INSERT INTO lines (number, landing_door) VALUES
    (8,FALSE),(14,TRUE),(13,FALSE),(2,FALSE),(6,FALSE),
    (4,TRUE),(10,FALSE),(12,FALSE),(5,FALSE),
    (11,FALSE),(3,FALSE),(7,FALSE),(9,FALSE),(1,TRUE);
 
  INSERT INTO stations(name,lift,escalator,call_terminal) VALUES
 ('NATION',FALSE,FALSE,TRUE),
 ('REAUMUR-SEBASTOPOL',FALSE,FALSE,TRUE),
 ('RASPAIL',FALSE,FALSE,TRUE),
 ('CITE',TRUE,FALSE,TRUE),
 ('LEDRU-ROLIN',FALSE,FALSE,TRUE),
 ('SAINT-LAZARE',TRUE,TRUE,TRUE),
 ('MARCADET-POISSONNIERS',TRUE,TRUE,TRUE),
 ('CHATELET',TRUE,TRUE,TRUE),
 ('POISSONNIERE',FALSE,FALSE,TRUE);
 
 INSERT INTO lines_stations VALUES 
 ((select l.id FROM lines l WHERE l.number = 9),
 (SELECT l.id FROM stations l WHERE l.name ='NATION')),
 ((select l.id FROM lines l WHERE l.number = 3),
 (SELECT l.id FROM stations l WHERE l.name ='REAUMUR-SEBASTOPOL')),
 ((select l.id FROM lines l WHERE l.number = 6),
 (SELECT l.id FROM stations l WHERE l.name ='RASPAIL')),
 ((select l.id FROM lines l WHERE l.number = 14),
 (SELECT l.id FROM stations l WHERE l.name ='SAINT-LAZARE')),
 ((select l.id FROM lines l WHERE l.number = 8),
 (SELECT l.id FROM stations l WHERE l.name ='LEDRU-ROLIN')),
 ((select l.id FROM lines l WHERE l.number = 12),
 (SELECT l.id FROM stations l WHERE l.name ='MARCADET-POISSONNIERS')),
 ((select l.id FROM lines l WHERE l.number = 11),
 (SELECT l.id FROM stations l WHERE l.name ='CHATELET')),
 
 
 ((select l.id FROM lines l WHERE l.number = 4),
 (SELECT l.id FROM stations l WHERE l.name ='CITE')),
 ((select l.id FROM lines l WHERE l.number = 7),
 (SELECT l.id FROM stations l WHERE l.name ='POISSONNIERE'));
 
 
 
 