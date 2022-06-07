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
  INSERT INTO users (username, password) VALUES ('memzohabou@gmail.com','$2a$12$YvrKLnBlEHRtFLpFaR3fOO3A9bZuV.YGw2S6vIjVJ0zLscywR5Z4m');

    INSERT INTO lines (number, landing_door) VALUES
    (1,TRUE),(2,FALSE),(3,FALSE),(4,TRUE),(5,FALSE),
    (6,FALSE),(7,FALSE),(8,FALSE),(9,FALSE),
    (10,FALSE),(11,FALSE),(12,FALSE),(13,FALSE),(14,TRUE);
 
  INSERT INTO stations(name,lift,escalator,call_terminal) VALUES
 ('REUILLY-DIDEROT',FALSE,TRUE,TRUE),
 ('VILLERS',FALSE,FALSE,TRUE),
 ('GAMBETTA',FALSE,FALSE,TRUE),
 ('REAUMUR-SEBASTOPOL',FALSE,FALSE,TRUE),
 ('BASTILLE',FALSE,FALSE,TRUE),
 ('DUPLEIX',FALSE,FALSE,TRUE),
 ('CADET',FALSE,FALSE,TRUE),
 ('LEDRU ROLLIN',FALSE,FALSE,TRUE),
 ('SAINT LAZARE',TRUE,TRUE,TRUE);
 
 INSERT INTO lines_stations VALUES 
 ((select l.id FROM lines l WHERE l.number = 1),
 (SELECT l.id FROM stations l WHERE l.name ='REUILLY-DIDEROT')),
 ((select l.id FROM lines l WHERE l.number = 2),
 (SELECT l.id FROM stations l WHERE l.name ='VILLERS')),
 ((select l.id FROM lines l WHERE l.number = 3),
 (SELECT l.id FROM stations l WHERE l.name ='GAMBETTA')),
 ((select l.id FROM lines l WHERE l.number = 4),
 (SELECT l.id FROM stations l WHERE l.name ='REAUMUR-SEBASTOPOL')),
 ((select l.id FROM lines l WHERE l.number = 5),
 (SELECT l.id FROM stations l WHERE l.name ='BASTILLE')),
 ((select l.id FROM lines l WHERE l.number = 6),
 (SELECT l.id FROM stations l WHERE l.name ='DUPLEIX')),
 ((select l.id FROM lines l WHERE l.number = 7),
 (SELECT l.id FROM stations l WHERE l.name ='CADET')),
 ((select l.id FROM lines l WHERE l.number = 8),
 (SELECT l.id FROM stations l WHERE l.name ='LEDRU ROLLIN')),
 ((select l.id FROM lines l WHERE l.number = 14),
 (SELECT l.id FROM stations l WHERE l.name ='SAINT LAZARE'));
 
 
 
 