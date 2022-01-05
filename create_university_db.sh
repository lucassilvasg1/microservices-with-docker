set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
    CREATE DATABASE university;
    create table address (
        id_address numeric(10,0) NOT NULL,
        street varchar,
        city varchar,
        CONSTRAINT pk_id PRIMARY KEY (id_address)
    );
    create table student (
        id_student numeric(10,0) NOT NULL,
        first_name varchar,
        last_name varchar,
        email varchar,
        id_address numeric(10, 0),
        CONSTRAINT pk_id_student PRIMARY KEY (id_student),
        CONSTRAINT fk_student_address FOREIGN KEY (id_address)
          REFERENCES address (id_address) MATCH SIMPLE
          ON UPDATE NO ACTION ON DELETE NO ACTION
    );
EOSQL
