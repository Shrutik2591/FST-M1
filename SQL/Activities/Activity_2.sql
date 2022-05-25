REM   Script: Activity2-SQL
REM   Activity2-SQL

CREATE TABLE salesman(salesman_id int primary key, salesman_name varchar2(20),  
salesman_city varchar2(20),commission int);

DESCRIBE salesman


INSERT INTO salesman VALUES(1,'shruti',''chennai', 2);

INSERT ALL 
        INTO salesman VALUES(2, 'kaushik','london', 3) 
        INTO salesman VALUES(2, 'kK','Australia', 3) 
        INTO salesman VALUES(2, 'ss','Singapore', 3) 
        INTO salesman VALUES(2, 'shashi','Portblair', 3) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

INSERT INTO salesman VALUES(1,'shruti',''chennai', 2);

INSERT ALL 
        INTO salesman VALUES(2, 'kaushik','london', 3), 
        INTO salesman VALUES(2, 'kK','Australia', 3), 
        INTO salesman VALUES(2, 'ss','Singapore', 3), 
        INTO salesman VALUES(2, 'shashi','Portblair', 3), 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

INSERT INTO salesman VALUES(1,'shruti','chennai', 2);

INSERT ALL 
        INTO salesman VALUES(2, 'kaushik','london', 3), 
        INTO salesman VALUES(2, 'kK','Australia', 3), 
        INTO salesman VALUES(2, 'ss','Singapore', 3), 
        INTO salesman VALUES(2, 'shashi','Portblair', 3), 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

INSERT INTO salesman VALUES(1,'shruti','chennai', 2);

INSERT ALL 
        INTO salesman VALUES(2, 'kaushik','london', 3) 
        INTO salesman VALUES(2, 'kK','Australia', 3) 
        INTO salesman VALUES(2, 'ss','Singapore', 3) 
        INTO salesman VALUES(2, 'shashi','Portblair', 3) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

INSERT INTO salesman VALUES(1,'shruti','chennai', 2);

INSERT ALL 
        INTO salesman VALUES(2, 'kaushik','london', 3) 
        INTO salesman VALUES(3, 'kK','Australia', 3) 
        INTO salesman VALUES(4, 'ss','Singapore', 3) 
        INTO salesman VALUES(5, 'shashi','Portblair', 3) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

INSERT INTO salesman VALUES(9,'shruti','chennai', 2);

INSERT ALL 
        INTO salesman VALUES(3, 'kaushik','london', 3) 
        INTO salesman VALUES(4, 'kK','Australia', 3) 
        INTO salesman VALUES(5, 'ss','Singapore', 3) 
        INTO salesman VALUES(6, 'shashi','Portblair', 3) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

