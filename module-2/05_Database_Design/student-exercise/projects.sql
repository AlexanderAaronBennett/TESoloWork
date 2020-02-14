BEGIN;
CREATE TABLE department
        (
        department_number SERIAL CONSTRAINT department_number_constraint PRIMARY KEY,
        department_name NAME CONSTRAINT department_name_constraint NOT NULL
        )
COMMIT;

BEGIN;
CREATE TABLE employee
(
	employee_number SERIAL CONSTRAINT pk_employee_number PRIMARY KEY,
	job_title VARCHAR CONSTRAINT job_title_constraint NOT NULL,
	first_name NAME CONSTRAINT first_name_constraint NOT NULL,
	last_name NAME CONSTRAINT last_name_constraint NOT NULL,
	gender VARCHAR CONSTRAINT gender_constraint NULL,
	date_of_birth DATE CONSTRAINT date_of_birth_constraint NOT NULL,
        date_of_hire DATE CONSTRAINT date_of_hire_constraint NOT NULL,
        employee_department INTEGER, 
	CONSTRAINT employee_department_constraint FOREIGN KEY (employee_department) REFERENCES department (department_number)
)
COMMIT;

BEGIN;

CREATE TABLE project
        (
        project_number SERIAL CONSTRAINT pk_project_number_constraint PRIMARY KEY,
        project_name NAME CONSTRAINT project_name_constraint NOT NULL,
        project_start_date DATE CONSTRAINT project_start_date_constraint NOT NULL
        )
COMMIT;     

BEGIN;
CREATE TABLE employee_project
        (
        employee_number INTEGER,
        CONSTRAINT fk__employee_number_constraint FOREIGN KEY (employee_number) REFERENCES employee (employee_number),
        project_number INTEGER,
        CONSTRAINT fk_project_number_constraint FOREIGN KEY (project_number) REFERENCES project (project_number)
        )
COMMIT;

BEGIN;
INSERT INTO department (department_number, department_name)
VALUES ('Human Resources'), ('Accounting'), ('IT'), ('Wizards');
COMMIT;

BEGIN;
INSERT INTO employee (employee_number, job_title, first_name, last_name, gender, date_of_birth, date_of_hire, employee_department)
VALUES ('Director Of Human Resources', 'Hugh', 'Mann', NULL , '1947-06-14', '2000-01-01' , 1),
       ('Human Resources Officer', 'Betty', 'Gray', 'female' , '1989-10-01', '2010-06-05' , 1),
       ('Head Accountant', 'Andrew', 'McMurray', 'male' , '1989-06-27', '2017-09-17' , 2),
       ('Accountant', 'Lenny', 'Poorman', 'male' , '1994-08-22', '2019-09-29' , 2),
       ('Scrum Master', 'Trevor', 'Tenessee', 'male' , '1991-08-22', '2020-01-13' , 3),
       ('Head Technician', 'Chris', 'Chicken', NULL , '2019-09-09', '2020-02-13' , 3),
        ('The White', 'Gandalf', 'Thegray', male , '0002-01-01', '0003-02-14' , 4),
        ('Archmage', 'The', 'Dragonborn', male , '0777-07-07', '0012-12-12' , 4)
       
COMMIT;