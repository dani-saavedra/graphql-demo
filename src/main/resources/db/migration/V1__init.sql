CREATE TABLE Clientes
(
    cliente_id         INT PRIMARY KEY,
    nombre             VARCHAR(50),
    apellido           VARCHAR(50),
    direccion          VARCHAR(100),
    correo_electronico VARCHAR(100),
    telefono           VARCHAR(20)
);
CREATE TABLE Cuentas
(
    cuenta_id      INT PRIMARY KEY,
    cliente_id     INT,
    tipo_cuenta    VARCHAR(50),
    saldo          INT,
    fecha_apertura DATE,
    FOREIGN KEY (cliente_id) REFERENCES Clientes (cliente_id)
);

CREATE TABLE Transacciones
(
    transaccion_id   INT PRIMARY KEY,
    cuenta_origen    INT,
    cuenta_destino   INT,
    monto            INT,
    tipo_transaccion VARCHAR(50),
    fecha            TIMESTAMP,
    FOREIGN KEY (cuenta_origen) REFERENCES Cuentas (cuenta_id),
    FOREIGN KEY (cuenta_destino) REFERENCES Cuentas (cuenta_id)
);
CREATE TABLE Sucursales
(
    sucursal_id     INT PRIMARY KEY,
    nombre_sucursal VARCHAR(100),
    direccion       VARCHAR(100),
    telefono        VARCHAR(20),
    ciudad          VARCHAR(50)
);
CREATE TABLE Empleados
(
    empleado_id INT PRIMARY KEY,
    nombre      VARCHAR(50),
    apellido    VARCHAR(50),
    cargo       VARCHAR(50),
    sucursal_id INT,
    FOREIGN KEY (sucursal_id) REFERENCES Sucursales (sucursal_id)
);

