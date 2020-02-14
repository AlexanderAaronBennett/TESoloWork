-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

BEGIN TRANSACTION;
INSERT INTO actor(first_name,last_name)
VALUES ('Hampton', 'Avenue'), ('Lisa','Byway')
COMMIT TRANSACTION;

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
BEGIN TRANSACTION;
INSERT INTO film(title, description, release_year, language_id,length)
VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198);
COMMIT TRANSACTION;
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
BEGIN TRANSACTION;
INSERT INTO film_actor(actor_id, film_id)
VALUES ((SELECT actor_id FROM actor WHERE first_name = 'Hampton' AND last_name ='Avenue'),(SELECT film_id FROM film WHERE title = 'Euclidean PI')),
        ((SELECT actor_id FROM actor WHERE first_name = 'Lisa' AND last_name = 'Byway'), (SELECT film_id FROM film WHERE title = 'Euclidean PI'))
                                               
COMMIT TRANSACTION;
-- 4. Add Mathmagical to the category table.
BEGIN TRANSACTION;
INSERT INTO category(name)
VALUES('Mathmagical')

COMMIT TRANSACTION;

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
BEGIN TRANSACTION;

UPDATE film_category
SET category_id = (SELECT category_id FROM category WHERE name = 'Mathmagical')
WHERE film_id IN (SELECT film_id FROM film WHERE title IN ('Euclidean PI', 'EGG IGBY', 'KARATE MOON', 'RANDOM GO','YOUNG LANGUAGE'));

IF NOT EXISTS(SELECT * FROM film_category WHERE film_id = 1001 AND category_id = 17)
INSERT INTO film_category (film_id, category_id) VALUES ((SELECT film_id FROM film WHERE title = 'EUCLIDEAN PI'), (SELECT category_id FROM category WHERE name = 'Mathmagical'));

--VALUES  ((SELECT film_id FROM film WHERE title = 'Euclidean PI'), (SELECT category_id FROM category WHERE name = 'Mathmagical')),
 --       ((SELECT film_id FROM film WHERE title = 'EGG IGBY'), (SELECT category_id FROM category WHERE name = 'Mathmagical')),
  --      ((SELECT film_id FROM film WHERE title = 'KARATE MOON'), (SELECT category_id FROM category WHERE name = 'Mathmagical')),
  --      ((SELECT film_id FROM film WHERE title = 'RANDOM GO'), (SELECT category_id FROM category WHERE name = 'Mathmagical')),
   --     ((SELECT film_id FROM film WHERE title = 'YOUNG LANGUAGE'), (SELECT category_id FROM category WHERE name = 'Mathmagical'))
ROLLBACK TRANSACTION;
-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
UPDATE film
SET rating ='G'
WHERE film_id IN(SELECT film_id 
                 FROM film_category
                 JOIN category ON category.category_id = film_category.category_id
                 WHERE category.name = 'Mathmagical') );



-- 7. Add a copy of "Euclidean PI" to all the stores.
INSERT INTO inventory(film_id, store_id)
SELECT (SELECT film_id FROM film WHERE title = 'EUCLIDEAN PI'), store_id FROM store;



BEGIN TRANSACTION;
INSERT INTO inventory(film_id, store_id)
VALUES ((SELECT film_id FROM film WHERE title = 'Euclidean PI'), (SELECT store_id FROM store WHERE store_id = 1)),
        ((SELECT film_id FROM film WHERE title = 'Euclidean PI'), (SELECT store_id FROM store WHERE store_id = 2))
COMMIT TRANSACTION;
-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <No, because there is a foreign key constraint >
BEGIN;
DELETE FROM film WHERE title = 'Euclidian PI';
COMMIT;
-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <No, because there is a foreign key constraint>
BEGIN;
DELETE FROM category WHERE name = 'Mathmagical';
COMMIT;
-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <NO, because category_id is connected as a foreign key to another table>
BEGIN;
DELETE FROM film_category WHERE category_id = 17;
COMMIT;
-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <NO because there is a foreign keys connection to actors>
BEGIN;
DELETE FROM category WHERE name = 'Mathmagical';
DELETE FROM film WHERE title = 'Euclidian PI';
ROLLBACK;
-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
