 /*Data Lanipulation Language
 * Command lines from 'handi-db' folder:
 * psql -h localhost -p 5432 -U postgres -d handiaccess
 * \i data.dml.sql
 * \q
 */
 /*
  INSERT INTO roles (name) VALUES ('Role_Administrator');

  INSERT INTO users (username, password, role_id) VALUES ('mahomedmachel@gmail.com', '$2a$10$jtjVcOpwmLp4Zqn2vHYLUeTSqnXxrvU3FIzuFI2nt62U1FAAbhq3S',(SELECT r.id FROM roles r WHERE r.name = 'ROLE_Administrator'));
  INSERT INTO users (username, password) VALUES ('memzohabou@gmail.com', '$2a$10$jtjVcOpwmLp4Zqn2vHYLUeTSqnXxrvU3FIzuFI2nt62U1FAAbhq3S');
*/
 INSERT INTO lines (number, landing_door) VALUES
 (1,TRUE),(14,TRUE),(13,TRUE),(8,FALSE),(7,FALSE),(11,FALSE)(3,FALSE);
 
 INSERT INTO stations(name,lift,escalator,call_terminal) VALUES('Opera',FALSE,FALSE,TRUE),
 ('Mairie de Montreuil',FALSE,FALSE,TRUE),
 ('Pyramide',TRUE,TRUE,TRUE),
 ('Poissonnière',FALSE,FALSE,TRUE),
 ('Cité',FALSE,FALSE,TRUE),
 ('Pont de Levallois',FALSE,FALSE,TRUE),
 ('Saint-Lazare',FALSE,TRUE,TRUE),
 ('Bibliothèque F.Mitterand',TRUE,TRUE,TRUE),
 ('Chatêlet',TRUE,TRUE,TRUE),
 ('Belle-ville',FALSE,TRUE,TRUE);
 
 INSERT INTO lines_stations VALUES 
 ((select l.id FROM lines l WHERE l.number = 3),
 (SELECT l.id FROM stations l WHERE l.name ='Saint-Lazare')),
 ((SELECT l.id FROM lines l WHERE l.number = 9),
 (SELECT l.id FROM stations l WHERE l.name = 'Havre Caumartin'));
 
 

 
  

  
 
 