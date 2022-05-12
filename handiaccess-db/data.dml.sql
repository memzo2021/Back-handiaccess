 /*Data Lanipulation Language
 * Command lines from 'handi-db' folder:
 * psql -h localhost -p 5432 -U postgres -d handi
 * \i data.dml.sql
 * \q
 
  INSERT INTO roles (name) VALUES ('Role_Administrator');
  

   
  
  INSERT INTO users (username, password, role_id) VALUES ('mahomedmachel@gmail.com', '$2a$10$jtjVcOpwmLp4Zqn2vHYLUeTSqnXxrvU3FIzuFI2nt62U1FAAbhq3S',(SELECT r.id FROM roles r WHERE r.name = 'ROLE_Administrator'));
  INSERT INTO users (username, password) VALUES ('memzohabou@gmail.com', '$2a$10$jtjVcOpwmLp4Zqn2vHYLUeTSqnXxrvU3FIzuFI2nt62U1FAAbhq3S');
  */
  
  INSERT INTO lignes (number,landing_door)VALUES (13,TRUE);
  INSERT INTO stations(name,lift,escalator,call_terminal) VALUES('OPERA',FALSE,TRUE,FALSE);