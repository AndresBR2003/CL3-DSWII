create database IF NOT EXISTS CL3DSWII;
USE CL3DSWII;

CREATE TABLE IF NOT EXISTS Habitacion (
    id INT AUTO_INCREMENT,
    nro INT,
    estado VARCHAR(20),
    PRIMARY KEY (id),
    INDEX habi_NroHabitacion (nro) 
);

CREATE TABLE IF NOT EXISTS Reservacion (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fecha VARCHAR(25),
    nro INT,
    costo DECIMAL(10, 2),
    FOREIGN KEY (nro) REFERENCES Habitacion(nro)
);

INSERT INTO Habitacion (nro, estado) VALUES
(101, 'Libre'),
(102, 'Libre'),
(103, 'Ocupada'),
(104, 'Libre'),
(105, 'Ocupada'),
(106, 'Libre'),
(107, 'Ocupada'),
(108, 'Libre'),
(109, 'Ocupada'),
(110, 'Libre');


-- Inserción de datos en la tabla Reservacion
INSERT INTO Reservacion (fecha, nro, costo) VALUES
('2023-11-23', 101, 150.00),
('2023-11-24', 102, 120.50),
('2023-11-25', 103, 200.00),
('2023-11-26', 104, 180.75),
('2023-11-27', 105, 220.25),
('2023-11-28', 106, 130.00),
('2023-11-29', 107, 190.50),
('2023-11-30', 108, 175.25),
('2023-12-01', 109, 210.75),
('2023-12-02', 110, 160.00);



