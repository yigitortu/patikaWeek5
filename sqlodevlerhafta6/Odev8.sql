1. test veritabanınızda employee isimli sütun bilgileri id(INTEGER), 
name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo 
oluşturalım.


CREATE TABLE employee (
	id INTEGER,
	name VARCHAR(50),
	birthday DATE,
	email VARCHAR(100)
);


2. Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 
50 adet veri ekleyelim.


Eklendi.

3. Sütunların her birine göre diğer sütunları güncelleyecek 5 adet 
UPDATE işlemi yapalım.

Örnek bir update işlemi.
UPDATE employee
SET 
	name = 'Hasan'
WHERE name LIKE 'P%'
RETURNING *;

4. Sütunların her birine göre ilgili satırı silecek 5 adet DELETE 
işlemi yapalım.

DELETE FROM employee
WHERE name LIKE 'H%';

DELETE FROM employee
WHERE id < 10;

DELETE FROM employee
WHERE email ILIKE 'M%';















