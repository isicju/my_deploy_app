CREATE TABLE users (
                       id          BIGSERIAL PRIMARY KEY,
                       name        VARCHAR(100) NOT NULL,
                       nick        VARCHAR(50)  NOT NULL,
                       dob         DATE         NOT NULL,
                       email       VARCHAR(255) NOT NULL,
                       password    VARCHAR(255) NOT NULL,
                       description TEXT         NOT NULL,
                       state       varchar(100) NOT null default 'CREATED',

                       CONSTRAINT name_not_blank
                           CHECK (btrim(name) <> '' AND length(name) >= 1),

                       CONSTRAINT nick_length
                           CHECK (length(nick) >= 1 AND length(nick) <= 50),

                       CONSTRAINT email_unique
                           UNIQUE (email),

                       CONSTRAINT email_format
                           CHECK (email ~ '^[^@\s]+@[^@\s]+\.[^@\s]+$'),

                       CONSTRAINT password_min_length
                           CHECK (length(password) >= 60),

                       CONSTRAINT description_min_length
                           CHECK (length(description) >= 10)
);
