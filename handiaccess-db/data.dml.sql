 /*Data Lanipulation Language
 * Command lines from 'handiaccess-db' folder:
 * psql -h localhost -p 5432 -U postgres -d handiaccessdb
 * \i data.dml.sql
 * \q
 */
 
 
  INSERT INTO roles (name) VALUES ('ROLE_ADMIN');

  INSERT INTO users (username, password, role_id) VALUES ('mahomedmachel@gmail.com','$2a$12$ptxQNPEXGEIi09oZ6LeK1OlJDSR6sodhhFn8rSII3H45bss7/hsIm',(SELECT r.id FROM roles r WHERE r.name = 'ROLE_ADMIN'));
  INSERT INTO users (username, password) VALUES ('memzohabou@gmail.com','$2a$10$jtjVcOpwmLp4Zqn2vHYLUeTSqnXxrvU3FIzuFI2nt62U1FAAbhq3S');

    INSERT INTO lines (number, landing_door) VALUES
    (8,TRUE),(14,TRUE),(13,TRUE),(2,FALSE),(6,FALSE),(11,FALSE),(3,FALSE),(7,FALSE),(9,FALSE);
 
  INSERT INTO stations(name,lift,escalator,call_terminal) VALUES
 ('Opera',TRUE,FALSE,TRUE),
 ('Mairie de Montreuil',FALSE,FALSE,TRUE),
 ('Pyramide',TRUE,TRUE,TRUE),
 ('Cité',TRUE,FALSE,TRUE),
 ('Pont de Levallois',FALSE,FALSE,TRUE),
 ('Saint-Lazare',TRUE,TRUE,TRUE),
 ('Bibliothèque F.Mitterand',TRUE,TRUE,TRUE),
 ('Chatêlet',TRUE,TRUE,TRUE),
 ('Poissonnière',FALSE,FALSE,TRUE);
 
 INSERT INTO lines_stations VALUES 
 ((select l.id FROM lines l WHERE l.number = 8),
 (SELECT l.id FROM stations l WHERE l.name ='Opera')),
 ((select l.id FROM lines l WHERE l.number = 14),
 (SELECT l.id FROM stations l WHERE l.name ='Saint-Lazare')),
 ((select l.id FROM lines l WHERE l.number = 7),
 (SELECT l.id FROM stations l WHERE l.name ='Poissonnière'));
 
 
 
 