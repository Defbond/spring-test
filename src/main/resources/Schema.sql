DROP TABLE IF EXISTS Utilisateurj;
  
CREATE TABLE Utilisateurj (
  id LONG AUTO_INCREMENT  PRIMARY KEY,
  usernamex VARCHAR(20) NOT NULL,
  passwordx VARCHAR(25) NOT NULL,
  role INTEGER(2) NOT NULL,
  numtel INTEGER(8) NOT NULL
);