
-- -----------------------------------------------------
-- Data for table TipoEstablecimiento
-- -----------------------------------------------------


INSERT INTO TipoEstablecimiento (idTipoEstablecimiento, nombreTipo) VALUES (NULL, 'Plaza Comercial');
INSERT INTO TipoEstablecimiento (idTipoEstablecimiento, nombreTipo) VALUES (NULL, 'Restaurante AAA');
INSERT INTO TipoEstablecimiento (idTipoEstablecimiento, nombreTipo) VALUES (NULL, 'Restaurante AA');
INSERT INTO TipoEstablecimiento (idTipoEstablecimiento, nombreTipo) VALUES (NULL, 'Restaurante A');
INSERT INTO TipoEstablecimiento (idTipoEstablecimiento, nombreTipo) VALUES (NULL, 'Hospital');
INSERT INTO TipoEstablecimiento (idTipoEstablecimiento, nombreTipo) VALUES (NULL, 'Clinica');
INSERT INTO TipoEstablecimiento (idTipoEstablecimiento, nombreTipo) VALUES (NULL, 'Estetica');
INSERT INTO TipoEstablecimiento (idTipoEstablecimiento, nombreTipo) VALUES (NULL, 'Club Deportivo');
INSERT INTO TipoEstablecimiento (idTipoEstablecimiento, nombreTipo) VALUES (NULL, 'Bar');
INSERT INTO TipoEstablecimiento (idTipoEstablecimiento, nombreTipo) VALUES (NULL, 'Otro');


-- -----------------------------------------------------
-- Data for table TipoAsentamiento
-- -----------------------------------------------------

INSERT INTO TipoAsentamiento (idTipoAsentamiento, nombreTipo) VALUES (NULL, 'Colonia');
INSERT INTO TipoAsentamiento (idTipoAsentamiento, nombreTipo) VALUES (NULL, 'Barrio');
INSERT INTO TipoAsentamiento (idTipoAsentamiento, nombreTipo) VALUES (NULL, 'Unidad Habitacional');



-- -----------------------------------------------------
-- Data for table Plaza
-- -----------------------------------------------------

INSERT INTO Plaza (idPlaza, nombrePlaza) VALUES (NULL, 'Mexico');
INSERT INTO Plaza (idPlaza, nombrePlaza) VALUES (NULL, 'San Luis Potosi');
INSERT INTO Plaza (idPlaza, nombrePlaza) VALUES (NULL, 'Queretaro');
INSERT INTO Plaza (idPlaza, nombrePlaza) VALUES (NULL, 'Puebla');
INSERT INTO Plaza (idPlaza, nombrePlaza) VALUES (NULL, 'Aguascalientes');
INSERT INTO Plaza (idPlaza, nombrePlaza) VALUES (NULL, 'Guadalajara');
INSERT INTO Plaza (idPlaza, nombrePlaza) VALUES (NULL, 'Acapulco');
INSERT INTO Plaza (idPlaza, nombrePlaza) VALUES (NULL, 'Toluca');
INSERT INTO Plaza (idPlaza, nombrePlaza) VALUES (NULL, 'Guanajuato');
INSERT INTO Plaza (idPlaza, nombrePlaza) VALUES (NULL, 'Merida');
INSERT INTO Plaza (idPlaza, nombrePlaza) VALUES (NULL, 'Logitel');
INSERT INTO Plaza (idPlaza, nombrePlaza) VALUES (NULL, 'Mexico Sur');



-- -----------------------------------------------------
-- Data for table EntidadFederativa
-- -----------------------------------------------------

INSERT INTO EntidadFederativa (idEntidadFederativa, nombreEntidadFederativa) VALUES (NULL, 'Distrito Federal');



-- -----------------------------------------------------
-- Data for table Municipio
-- -----------------------------------------------------

INSERT INTO Municipio (idMunicipio, nombreMunicipio, idPlaza, idEntidadFederativa) VALUES (NULL, 'Gustavo A. Madero',1,1);


-- -----------------------------------------------------
-- Data for table CodigoPostal
-- -----------------------------------------------------

INSERT INTO CodigoPostal (idCodigoPostal, numeroCodigo, idMunicipio) VALUES (NULL, '07320', 1);



-- -----------------------------------------------------
-- Data for table Asentamiento
-- -----------------------------------------------------

INSERT INTO Asentamiento (idAsentamiento, idTipoAsentamiento, nombreAsentamiento, idCodigoPostal) VALUES (NULL, 1, 'Residencial La Escalera', 1);


