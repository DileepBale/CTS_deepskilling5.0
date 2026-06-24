-- Creating a basic table for Associate tracking
CREATE TABLE Cognizant_Associates (
    Associate_ID INT PRIMARY KEY,
    First_Name VARCHAR(50),
    Track VARCHAR(50),
    Joining_Date DATE
);

-- Inserting sample data into the table
INSERT INTO Cognizant_Associates VALUES (101, 'Rahul', 'Java FSE', '2026-06-19');
INSERT INTO Cognizant_Associates VALUES (102, 'Priya', 'Python FSE', '2026-06-19');
INSERT INTO Cognizant_Associates VALUES (103, 'Amit', 'DotNet FSE', '2026-06-19');

-- Writing a basic query to retrieve the data
SELECT * FROM Cognizant_Associates WHERE Track = 'Java FSE';