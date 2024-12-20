INSERT INTO users (name)
VALUES
    ('John Doe'),
    ('Jane Smith'),
    ('Alice Brown');

INSERT INTO category (name)
VALUES
    ('Food'),
    ('Transport'),
    ('Entertainment');

INSERT INTO records (user_id, category_id, creation_date, costs)
VALUES
    (1, 1, CURRENT_TIMESTAMP, 50.25),
    (2, 2, CURRENT_TIMESTAMP, 15.75),
    (3, 3, CURRENT_TIMESTAMP, 120.00);

INSERT INTO accounts (user_id, balance) VALUES
    (1, 100.00),
    (2, 200.50),
    (3, 150.75);
