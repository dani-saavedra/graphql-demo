INSERT INTO Clientes (cliente_id, nombre, apellido, direccion, correo_electronico, telefono)
VALUES (1, 'Juan', 'Perez', 'Calle 123', 'juan@example.com', '1234567890'),
       (2, 'María', 'González', 'Avenida 456', 'maria@example.com', '9876543210'),
       (3, 'Pedro', 'Martínez', 'Carrera 789', 'pedro@example.com', '4567890123'),
       (4, 'Ana', 'López', 'Calle 321', 'ana@example.com', '0987654321'),
       (5, 'Luis', 'Rodríguez', 'Avenida 654', 'luis@example.com', '5678901234');


INSERT INTO Cuentas (cuenta_id, cliente_id, tipo_cuenta, saldo, fecha_apertura)
VALUES (1, 1, 'Corriente', 1000.00, '2023-01-01'),
       (2, 2, 'Ahorros', 5000.00, '2023-02-01'),
       (3, 3, 'Corriente', 3000.00, '2023-03-01'),
       (4, 4, 'Ahorros', 2000.00, '2023-04-01'),
       (5, 5, 'Corriente', 4000.00, '2023-05-01');

INSERT INTO Transacciones (transaccion_id, cuenta_origen, cuenta_destino, monto, tipo_transaccion,
                           fecha)
VALUES (1, 1, 2, 500.00, 'Transferencia', '2023-01-15'),
       (2, 2, 3, 200.00, 'Transferencia', '2023-02-15'),
       (3, 3, 4, 100.00, 'Transferencia', '2023-03-15'),
       (4, 4, 5, 300.00, 'Transferencia', '2023-04-15'),
       (5, 5, 1, 150.00, 'Transferencia', '2023-05-15');


INSERT INTO Sucursales (sucursal_id, nombre_sucursal, direccion, telefono, ciudad)
VALUES (1, 'Sucursal Central', 'Av. Principal 123', '123-456-7890', 'Ciudad A'),
       (2, 'Sucursal Norte', 'Calle Secundaria 456', '987-654-3210', 'Ciudad B'),
       (3, 'Sucursal Sur', 'Av. Terciaria 789', '456-789-0123', 'Ciudad C'),
       (4, 'Sucursal Este', 'Calle Principal 321', '098-765-4321', 'Ciudad D'),
       (5, 'Sucursal Oeste', 'Av. Secundaria 654', '567-890-1234', 'Ciudad E');


INSERT INTO Empleados (empleado_id, nombre, apellido, cargo, sucursal_id)
VALUES (1, 'Carlos', 'García', 'Cajero', 1),
       (2, 'Laura', 'López', 'Gerente', 2),
       (3, 'Roberto', 'Hernández', 'Cajero', 1),
       (4, 'Elena', 'Martínez', 'Asesor Financiero', 2),
       (5, 'Andrés', 'Rodríguez', 'Gerente', 1);
