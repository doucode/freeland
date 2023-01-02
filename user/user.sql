CREATE TABLE IF NOT EXISTS users
(
    user_id serial NOT NULL,
    user_name text NOT NULL,
    phone_number text NOT NULL,
    email text NOT NULL,
    password text NOT NULL,
    primary key(user_id)
    )