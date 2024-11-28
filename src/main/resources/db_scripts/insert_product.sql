CREATE TABLE t_product (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           org_id INT,
                           product_name VARCHAR(255),
                           FOREIGN KEY (org_id) REFERENCES t_organization(id)
);

-- Insert products for each organization
INSERT INTO t_product (org_id, product_name) VALUES (1, 'Product 1A');
INSERT INTO t_product (org_id, product_name) VALUES (1, 'Product 1B');
INSERT INTO t_product (org_id, product_name) VALUES (1, 'Product 1C');
INSERT INTO t_product (org_id, product_name) VALUES (1, 'Product 1D');
INSERT INTO t_product (org_id, product_name) VALUES (1, 'Product 1E');

INSERT INTO t_product (org_id, product_name) VALUES (2, 'Product 2A');
INSERT INTO t_product (org_id, product_name) VALUES (2, 'Product 2B');
INSERT INTO t_product (org_id, product_name) VALUES (2, 'Product 2C');
INSERT INTO t_product (org_id, product_name) VALUES (2, 'Product 2D');
INSERT INTO t_product (org_id, product_name) VALUES (2, 'Product 2E');

INSERT INTO t_product (org_id, product_name) VALUES (3, 'Product 3A');
INSERT INTO t_product (org_id, product_name) VALUES (3, 'Product 3B');
INSERT INTO t_product (org_id, product_name) VALUES (3, 'Product 3C');
INSERT INTO t_product (org_id, product_name) VALUES (3, 'Product 3D');
INSERT INTO t_product (org_id, product_name) VALUES (3, 'Product 3E');

INSERT INTO t_product (org_id, product_name) VALUES (4, 'Product 4A');
INSERT INTO t_product (org_id, product_name) VALUES (4, 'Product 4B');
INSERT INTO t_product (org_id, product_name) VALUES (4, 'Product 4C');
INSERT INTO t_product (org_id, product_name) VALUES (4, 'Product 4D');
INSERT INTO t_product (org_id, product_name) VALUES (4, 'Product 4E');

INSERT INTO t_product (org_id, product_name) VALUES (5, 'Product 5A');
INSERT INTO t_product (org_id, product_name) VALUES (5, 'Product 5B');
INSERT INTO t_product (org_id, product_name) VALUES (5, 'Product 5C');
INSERT INTO t_product (org_id, product_name) VALUES (5, 'Product 5D');
INSERT INTO t_product (org_id, product_name) VALUES (5, 'Product 5E');

INSERT INTO t_product (org_id, product_name) VALUES (6, 'Product 6A');
INSERT INTO t_product (org_id, product_name) VALUES (6, 'Product 6B');
INSERT INTO t_product (org_id, product_name) VALUES (6, 'Product 6C');
INSERT INTO t_product (org_id, product_name) VALUES (6, 'Product 6D');
INSERT INTO t_product (org_id, product_name) VALUES (6, 'Product 6E');

INSERT INTO t_product (org_id, product_name) VALUES (7, 'Product 7A');
INSERT INTO t_product (org_id, product_name) VALUES (7, 'Product 7B');
INSERT INTO t_product (org_id, product_name) VALUES (7, 'Product 7C');
INSERT INTO t_product (org_id, product_name) VALUES (7, 'Product 7D');
INSERT INTO t_product (org_id, product_name) VALUES (7, 'Product 7E');

INSERT INTO t_product (org_id, product_name) VALUES (8, 'Product 8A');
INSERT INTO t_product (org_id, product_name) VALUES (8, 'Product 8B');
INSERT INTO t_product (org_id, product_name) VALUES (8, 'Product 8C');
INSERT INTO t_product (org_id, product_name) VALUES (8, 'Product 8D');
INSERT INTO t_product (org_id, product_name) VALUES (8, 'Product 8E');

INSERT INTO t_product (org_id, product_name) VALUES (9, 'Product 9A');
INSERT INTO t_product (org_id, product_name) VALUES (9, 'Product 9B');
INSERT INTO t_product (org_id, product_name) VALUES (9, 'Product 9C');
INSERT INTO t_product (org_id, product_name) VALUES (9, 'Product 9D');
INSERT INTO t_product (org_id, product_name) VALUES (9, 'Product 9E');

INSERT INTO t_product (org_id, product_name) VALUES (10, 'Product 10A');
INSERT INTO t_product (org_id, product_name) VALUES (10, 'Product 10B');
INSERT INTO t_product (org_id, product_name) VALUES (10, 'Product 10C');
INSERT INTO t_product (org_id, product_name) VALUES (10, 'Product 10D');
INSERT INTO t_product (org_id, product_name) VALUES (10, 'Product 10E');