#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------
CREATE DATABASE rentcar;
use rentcar;
#------------------------------------------------------------
# Table: PROGRAMME DE FIDELITE
#------------------------------------------------------------

CREATE TABLE PROGRAMME_DE_FIDELITE
(
    idProgramme     Int         NOT NULL Auto_increment,
    duree           Int         NOT NULL,
    description     Varchar(70) NOT NULL,
    prix            float       NOT NULL,
    tauxDeReduction float       NOT NULL,
    CONSTRAINT PROGRAMME_DE_FIDELITE_PK PRIMARY KEY (idProgramme)
);


#------------------------------------------------------------
# Table: ASSURANCE
#------------------------------------------------------------

CREATE TABLE ASSURANCE
(
    idAssurance INT     NOT NULL AUTO_INCREMENT,
    tarif       Numeric NOT NULL,
    CONSTRAINT ASSURANCE_PK PRIMARY KEY (idAssurance)
);


#------------------------------------------------------------
# Table: FACTURE
#------------------------------------------------------------

CREATE TABLE FACTURE
(
    idFacture       INT         NOT NULL AUTO_INCREMENT,
    penalite        Numeric     NOT NULL,
    niveauCarburant Numeric     NOT NULL,
    supplement      Numeric     NOT NULL,
    etatVehicule    Varchar(250) NOT NULL,
    CONSTRAINT FACTURE_PK PRIMARY KEY (idFacture)
);


#------------------------------------------------------------
# Table: Adresse
#------------------------------------------------------------

CREATE TABLE Adresse
(
    idAdresse   Int         NOT NULL AUTO_INCREMENT,
    rue         Varchar(50) NOT NULL,
    ville       Varchar(50) NOT NULL,
    code_postal Int         NOT NULL,
    CONSTRAINT Adresse_PK PRIMARY KEY (idAdresse)
);


#------------------------------------------------------------
# Table: AGENCE
#------------------------------------------------------------

CREATE TABLE AGENCE
(
    idAgence      int         NOT NULL auto_increment,
    nom           Varchar(70) NOT NULL,
    telephone     Numeric     NOT NULL,
    nbrPlace      Int         NOT NULL,
    coordonnesGPS Varchar(70) NOT NULL,
    recette       Numeric     NOT NULL,
    idAdresse     Int         NOT NULL,
    CONSTRAINT AGENCE_PK PRIMARY KEY (idAgence),
    CONSTRAINT AGENCE_Adresse_FK FOREIGN KEY (idAdresse) REFERENCES Adresse (idAdresse),
    CONSTRAINT AGENCE_Adresse_AK UNIQUE (idAdresse)
);


#------------------------------------------------------------
# Table: Categorie
#------------------------------------------------------------

CREATE TABLE Categorie
(
    idCategorie INT         NOT NULL AUTO_INCREMENT,
    nom         VARCHAR(70) NOT NULL,
    tarif       FLOAT       NOT NULL,
    caution     FLOAT       NOT NULL,
    CONSTRAINT Categorie_PK PRIMARY KEY (idCategorie)
);


#------------------------------------------------------------
# Table: VEHICULE
#------------------------------------------------------------

CREATE TABLE VEHICULE
(
    matricule   INT         NOT NULL,
    marque      Varchar(30) NOT NULL,
    modele      Varchar(30) NOT NULL,
    kilometrage Numeric     NOT NULL,
    automatique boolean     NOT NULL,
    climatise   boolean     NOT NULL,
    carburant   Varchar(30) NOT NULL,
    etatOrigine Varchar(250) NOT NULL,
    idCategorie INT     NOT NULL,
    CONSTRAINT VEHICULE_PK PRIMARY KEY (matricule),
    CONSTRAINT VEHICULE_CATEGORIE_FK FOREIGN KEY (idCategorie) REFERENCES Categorie (idCategorie)
);


#------------------------------------------------------------
# Table: Personne
#------------------------------------------------------------

CREATE TABLE Personne
(
    idPersonne Int         NOT NULL auto_increment,
    nom        Varchar(30) NOT NULL,
    prenom     Varchar(30) NOT NULL,
    email      Varchar(70) NOT NULL,
    telephone  Numeric     NOT NULL,
    login      Varchar(70) NOT NULL,
    password   Varchar(70) NOT NULL,
    idAdresse  Int         NOT NULL,
    CONSTRAINT Personne_PK PRIMARY KEY (idPersonne),
    CONSTRAINT Personne_Adresse_FK FOREIGN KEY (idAdresse) REFERENCES Adresse (idAdresse),
    CONSTRAINT Personne_Adresse_AK UNIQUE (idAdresse)
);


#------------------------------------------------------------
# Table: CLIENT
#------------------------------------------------------------

CREATE TABLE CLIENT
(
    idPersonne Int         NOT NULL auto_increment,
    nom        Varchar(30) NOT NULL,
    prenom     Varchar(30) NOT NULL,
    email      Varchar(70) NOT NULL,
    telephone  Numeric     NOT NULL,
    login      Varchar(70) NOT NULL,
    password   Varchar(70) NOT NULL,
    idAdresse  Int         NOT NULL,
    CONSTRAINT CLIENT_PK PRIMARY KEY (idPersonne),
    CONSTRAINT CLIENT_Personne_FK FOREIGN KEY (idPersonne) REFERENCES Personne (idPersonne),
    CONSTRAINT CLIENT_Adresse0_FK FOREIGN KEY (idAdresse) REFERENCES Adresse (idAdresse),
    CONSTRAINT CLIENT_Adresse_AK UNIQUE (idAdresse)
);


#------------------------------------------------------------
# Table: EMPLOYE
#------------------------------------------------------------

CREATE TABLE EMPLOYE
(
    idPersonne Int         NOT NULL auto_increment,
    nom        Varchar(30) NOT NULL,
    prenom     Varchar(30) NOT NULL,
    email      Varchar(70) NOT NULL,
    telephone  Numeric     NOT NULL,
    login      Varchar(70) NOT NULL,
    password   Varchar(70) NOT NULL,
    idAdresse  Int         NOT NULL,
    CONSTRAINT EMPLOYE_PK PRIMARY KEY (idPersonne),
    CONSTRAINT EMPLOYE_Personne_FK FOREIGN KEY (idPersonne) REFERENCES Personne (idPersonne),
    CONSTRAINT EMPLOYE_Adresse0_FK FOREIGN KEY (idAdresse) REFERENCES Adresse (idAdresse),
    CONSTRAINT EMPLOYE_Adresse_AK UNIQUE (idAdresse)
);


#------------------------------------------------------------
# Table: CHAUFFEUR
#------------------------------------------------------------

CREATE TABLE CHAUFFEUR
(
    idPersonne Int         NOT NULL auto_increment,
    nom        Varchar(30) NOT NULL,
    prenom     Varchar(30) NOT NULL,
    email      Varchar(70) NOT NULL,
    telephone  Numeric     NOT NULL,
    login      Varchar(70) NOT NULL,
    password   Varchar(70) NOT NULL,
    idAdresse  Int         NOT NULL,
    CONSTRAINT CHAUFFEUR_PK PRIMARY KEY (idPersonne),
    CONSTRAINT CHAUFFEUR_EMPLOYE_FK FOREIGN KEY (idPersonne) REFERENCES EMPLOYE (idPersonne),
    CONSTRAINT CHAUFFEUR_Adresse0_FK FOREIGN KEY (idAdresse) REFERENCES Adresse (idAdresse),
    CONSTRAINT CHAUFFEUR_Adresse_AK UNIQUE (idAdresse)
);



#------------------------------------------------------------
# Table: repartir
#------------------------------------------------------------
CREATE TABLE repartir
(
    idPersonne Int NOT NULL,
    matricule  int NOT NULL,
    idAgence   int NOT NULL,
    CONSTRAINT REPARTIR_CHAUFFEUR_FK FOREIGN KEY (idPersonne) REFERENCES CHAUFFEUR (idPersonne),
    CONSTRAINT REPARTIR_VEHICULE_FK FOREIGN KEY (matricule) REFERENCES VEHICULE (matricule),
    CONSTRAINT REPARTIR_AGENCE_FK FOREIGN KEY (idAgence) REFERENCES AGENCE (idAgence),
    CONSTRAINT GERER_PK PRIMARY KEY (idPersonne, matricule, idAgence)
);

#------------------------------------------------------------
# Table: gerer
#------------------------------------------------------------
CREATE TABLE gerer
(
    idPersonne Int NOT NULL,
    matricule  int NOT NULL,
    CONSTRAINT GERER_CHAUFFEUR_FK FOREIGN KEY (idPersonne) REFERENCES CHAUFFEUR (idPersonne),
    CONSTRAINT GERER_VEHICULE_FK FOREIGN KEY (matricule) REFERENCES VEHICULE (matricule),
    CONSTRAINT GERER_PK PRIMARY KEY (idPersonne, matricule)
);

#------------------------------------------------------------
# Table: louer
#------------------------------------------------------------
CREATE TABLE louer
(
    idPersonne  Int NOT NULL,
    matricule   int NOT NULL,
    idAssurance int not null,
    idFacture   int not null,
    dateDebut   DATE,
    dateFin     DATE,
    dateRendu   DATE,
    CONSTRAINT LOUER_ASSURANCE_FK FOREIGN KEY (idAssurance) REFERENCES ASSURANCE (idAssurance),
    CONSTRAINT LOUER_CHAUFFEUR_FK FOREIGN KEY (idPersonne) REFERENCES CLIENT (idPersonne),
    CONSTRAINT LOUER_VEHICULE_FK FOREIGN KEY (matricule) REFERENCES VEHICULE (matricule),
    CONSTRAINT LOUER_FACTURE_FK FOREIGN KEY (idFacture) REFERENCES FACTURE (idFacture),
    CONSTRAINT LOUER_PK PRIMARY KEY (idPersonne, matricule, idAssurance, idFacture)
);


#------------------------------------------------------------
# Table: souscrire
#------------------------------------------------------------
CREATE TABLE souscrire
(
    idPersonne  Int NOT NULL,
    idProgramme int NOT NULL,
    dateDebut   DATE,
    dateFin     DATE,
    CONSTRAINT SOUSCRIRE_CLIENT_FK FOREIGN KEY (idPersonne) REFERENCES CLIENT (idPersonne),
    CONSTRAINT SOUSCRIRE_PROGRAMME_FK FOREIGN KEY (idProgramme) REFERENCES PROGRAMME_DE_FIDELITE (idProgramme),
    CONSTRAINT SOUSCRIRE_PK PRIMARY KEY (idPersonne, idProgramme)
);


#------------------------------------------------------------
# Table: renouveler
#------------------------------------------------------------

CREATE TABLE renouveler
(
    idPersonne  Int NOT NULL,
    idProgramme int NOT NULL,
    dateDebut   DATE,
    dateFin     DATE,
    CONSTRAINT RENOUVELER_CLIENT_FK FOREIGN KEY (idPersonne) REFERENCES CLIENT (idPersonne),
    CONSTRAINT RENOUVELER_PROGRAMME_FK FOREIGN KEY (idProgramme) REFERENCES PROGRAMME_DE_FIDELITE (idProgramme),
    CONSTRAINT RENOUVELER_PK PRIMARY KEY (idPersonne, idProgramme)
);
