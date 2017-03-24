CREATE DATABASE morosystems
    WITH 
    OWNER = "user"
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;
    
CREATE SEQUENCE public.message_id_seq
    INCREMENT 1
    START 1;
    
CREATE TABLE public.messages
(
    id integer NOT NULL DEFAULT nextval('message_id_seq'),
    name text NOT NULL,
    email text,
    message text NOT NULL,
    created date NOT NULL,
    PRIMARY KEY (id)
);
