DROP TABLE IF EXISTS till;

CREATE TABLE IF NOT EXISTS till (
    id SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(50),
    oneP DECIMAL,
    twoP DECIMAL,
    fiveP DECIMAL,
    tenP DECIMAL,
    twentyP DECIMAL,
    fiftyP DECIMAL,
    onePound DECIMAL,
    twoPound DECIMAL,
    fivePound DECIMAL,
    tenPound DECIMAL,
    twentyPound DECIMAL,
    fiftyPound DECIMAL
);