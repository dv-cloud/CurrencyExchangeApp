INSERT INTO filiala(nume, adresa) VALUES('Central', 'Arborilor 4');
INSERT INTO filiala(nume, adresa) VALUES('South', 'Pajistilor 45');
INSERT INTO filiala(nume, adresa) VALUES('North', 'Alecsandri 12');
INSERT INTO schimb-valutar(filiala-id) VALUES(2);
INSERT INTO schimb-valutar(filiala-id) VALUES(1);
INSERT INTO schimb-valutar(filiala-id) VALUES(3);
INSERT INTO curs-valutar(cod-valutar, curs, data-curs) VALUES('EUR', 19.43, '01.08.2020');
INSERT INTO curs-valutar(cod-valutar, curs, data-curs) VALUES('KZT', 0.56, '01.08.2020');
INSERT INTO curs-valutar(cod-valutar, curs, data-curs) VALUES('JPY', 17.45, '01.08.2020');
INSERT INTO numerar(suma, curs-valutar-id) VALUES(1000, 1);
INSERT INTO numerar(suma, curs-valutar-id) VALUES(1000, 2);
INSERT INTO numerar(suma, curs-valutar-id) VALUES(1000, 3);
INSERT INTO angajati(nume, prenume, varsta, schimb-valutar-id) VALUES('John', 'Doe', 34, 1);
INSERT INTO angajati(nume, prenume, varsta, schimb-valutar-id) VALUES('Jane', 'Doe', 28, 2);
INSERT INTO angajati(nume, prenume, varsta, schimb-valutar-id) VALUES('Janette', 'Doe', 39, 3);