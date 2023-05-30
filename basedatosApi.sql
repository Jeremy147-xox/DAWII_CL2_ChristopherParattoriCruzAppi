CREATE TABLE especialidad (
idespe CHAR(3) NOT NULL PRIMARY KEY,
nombre VARCHAR(30) NOT NULL,
costo NUMERIC(8,1) NOT NULL
);

CREATE TABLE alumno (
id CHAR(5) NOT NULL PRIMARY KEY,
apealumno VARCHAR(30) NOT NULL,
nomalumno VARCHAR(30) NOT NULL,
idespe CHAR(3) NOT NULL,
proce CHAR(1),
FOREIGN KEY (idespe) REFERENCES especialidad(idespe)
);


-- ==============================
Insert Into especialidad Values('E01','Educacion Informatica',2500);
Insert Into especialidad Values('E02','Administracion',1800);
Insert Into especialidad Values('E03','Contabilidad',2000);
Insert Into especialidad Values('E04','Idiomas',1800);
Insert Into especialidad Values('E05','Ingenier�a de Sistemas',2800);

-- Agregar Datos a la Tabla Alumno
-- ==============================
Insert Into alumno Values('A0001','Valencia Salcedo','Christian','E01','N');
Insert Into alumno Values('A0002','Ortiz Rodriguez','Freddy','E01','P');
Insert Into alumno Values('A0003','Silva Mejia','Ruth Ketty','E02','N');
Insert Into alumno Values('A0004','Melendez Noriega','Liliana','E03','P');
Insert Into alumno Values('A0005','Huerta Leon','Silvia','E04','N');
Insert Into alumno Values('A0006','Carranza Fuentes','Maria Elena','E02','P');
Insert Into alumno Values('A0007','Prado Castro','Gabriela','E01','N');
Insert Into alumno Values('A0008','Atuncar Mesias','Juan','E05','P');
Insert Into alumno Values('A0009','Aguilar Zavala','Patricia Elena','E01','P');
Insert Into alumno Values('A0010','Rodruigez Trujillo','Rubén Eduardo','E01','N');
Insert Into alumno Values('A0011','Canales Ruiz','Gino Leonel','E02','P');
Insert Into alumno Values('A0012','Ruiz Quispe','Edgar','E02','N');
Insert Into alumno Values('A0013','PanduroTerrazas','Omar','E03','P');
Insert Into alumno Values('A0014','Zita Padilla','Peter Wilmer','E03','N');
Insert Into alumno Values('A0015','Ternero Ubillas','Luis','E05','P');
Insert Into alumno Values('A0016','Rivera Garcia','Raul Joel','E04','P');
Insert Into alumno Values('A0017','Pomar Garcia','Ana','E04','P');
Insert Into alumno Values('A0018','Palomares Venegas','Mercedes','E04','N');
