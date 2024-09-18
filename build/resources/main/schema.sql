-- Crear tabla Category
CREATE TABLE IF NOT EXISTS category (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    code TEXT NOT NULL,
    name TEXT NOT NULL
);

-- Crear tabla Product
CREATE TABLE IF NOT EXISTS product (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name TEXT NOT NULL,
    price REAL NOT NULL,
    stock INTEGER,
    category_id INTEGER,
    FOREIGN KEY (category_id) REFERENCES category(id)
);

-- Insertar algunos datos de ejemplo
INSERT INTO category (code, name) VALUES ('GAS', 'Gastronomía');
INSERT INTO category (code, name) VALUES ('VIA', 'Viajes');
INSERT INTO category (code, name) VALUES ('IND', 'Indumentaria');
INSERT INTO category (code, name) VALUES ('BIE', 'Bienestar');
INSERT INTO category (code, name) VALUES ('DYH', 'Deco y Hogar');
INSERT INTO category (code, name) VALUES ('ENT', 'Entretenimiento');
INSERT INTO category (code, name) VALUES ('AUT', 'Automóvil');
INSERT INTO category (code, name) VALUES ('SUP', 'Supermercado');
INSERT INTO category (code, name) VALUES ('SAL', 'Salud');
INSERT INTO category (code, name) VALUES ('FIN', 'Finanzas');
INSERT INTO category (code, name) VALUES ('SUS', 'Sustentabilidad');
INSERT INTO category (code, name) VALUES ('COM', 'Compras');
INSERT INTO category (code, name) VALUES ('EDU', 'Educacion');
INSERT INTO category (code, name) VALUES ('EYT', 'Electro y tecnología');
INSERT INTO category (code, name) VALUES ('SER', 'Servicios');
INSERT INTO category (code, name) VALUES ('CTR', 'Constructora');
INSERT INTO category (code, name) VALUES ('DEI', 'Desarrollos inmobiliarios');
INSERT INTO category (code, name) VALUES ('MPC', 'Materiales para las construccción');
INSERT INTO category (code, name) VALUES ('OYO', 'Oficios y ocupaciones');
INSERT INTO category (code, name) VALUES ('POR', 'Profesionales');
INSERT INTO category (code, name) VALUES ('VYA', 'Propiedades (Venta-Alquiler)');
INSERT INTO category (code, name) VALUES ('SEG', 'Seguros');
INSERT INTO category (code, name) VALUES ('SEG', 'Servicios para las construcción');
INSERT INTO category (code, name) VALUES ('OTR', 'Otro');
INSERT INTO category (code, name) VALUES ('DEP', 'Deportes');
INSERT INTO category (code, name) VALUES ('LBR', 'Librería');
INSERT INTO category (code, name) VALUES ('IND', 'Industria');
INSERT INTO category (code, name) VALUES ('P&C', 'Panadería & Confitería');

INSERT INTO product (name, price, stock, category_id) VALUES ('Smartphone', 599.99, 50, 14);
INSERT INTO product (name, price, stock, category_id) VALUES ('Laptop', 999.99, 30, 14);
INSERT INTO product (name, price, stock, category_id) VALUES ('Camiseta', 19.99, 100, 3);