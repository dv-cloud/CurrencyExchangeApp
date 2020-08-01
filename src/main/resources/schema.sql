DROP TABLE IF EXISTS schimb-valutar;
DROP TABLE IF EXISTS filiala;
DROP TABLE IF EXISTS numerar;
DROP TABLE IF EXISTS curs-valutar;
DROP TABLE IF EXISTS angajati;

CREATE TABLE IF NOT EXISTS schimb-valutar(id integer IDENTITY UNIQUE PRIMARY KEY NOT NULL, filiala-id integer FOREIGN REFERENCES filiala(id));
CREATE TABLE IF NOT EXISTS filiala(id integer IDENTITY UNIQUE PRIMARY KEY NOT NULL, nume VARCHAR(50), adresa VARCHAR(100));
CREATE TABLE IF NOT EXISTS numerar(id integer IDENTITY UNIQUE NOT NULL, suma REAL, curs-valutar-id integer FOREIGN REFERENCES curs-valutar(id));
CREATE TABLE IF NOT EXISTS curs-valutar(id integer IDENTITY UNIQUE PRIMARY KEY NOT NULL, cod-valutar VARCHAR(3), curs REAL, data-curs VARCHAR(10));
CREATE TABLE IF NOT EXISTS angajati(id integer IDENTITY UNIQUE NOT NULL, nume VARCHAR(50), prenume VARCHAR(50), varsta integer, schimb-valutar-id FOREIGN REFERENCES schimb-valutar(id));