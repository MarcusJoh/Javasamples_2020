



CREATE TABLE animal(
   animal_id      INTEGER  NOT NULL PRIMARY KEY AUTO_INCREMENT
  ,animal_name    VARCHAR(20) NOT NULL
  ,animal_species VARCHAR(20) NOT NULL
);
INSERT INTO animal(animal_id,animal_name,animal_species) VALUES (1,'Nicke','apa');
INSERT INTO animal(animal_id,animal_name,animal_species) VALUES (2,'Dumbo','elefant');



CREATE TABLE cage(
    cage_id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    cage_name VARCHAR(25) NOT NULL
); INSERT INTO cage(cage_id, cage_name)
VALUES(1, 'Savannen');
INSERT INTO cage(cage_id, cage_name)
VALUES(2, 'Apbur');









INSERT INTO animal(
    animal_id,
    animal_name,
    animal_species,
    cage_id
)
VALUES(
    1,
    'Nicke',
    'apa',
    (
    SELECT
        cage_id
    FROM
        cage
    WHERE
        cage_name = 'Savannen'
)
);



SELECT
*
FROM
    animal
 JOIN cage ON cage.cage_id = animal.cage_id


 SELECT
    animal_name,
    animal_species,
    cage.cage_name
FROM    animal
JOIN cage ON cage.cage_id = animal.cage_id
WHERE    cage.cage_name LIKE "%ann%";
