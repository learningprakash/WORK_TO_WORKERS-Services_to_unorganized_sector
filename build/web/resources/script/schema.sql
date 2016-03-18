drop database worktoworkers;
create database worktoworkers;
use worktoworkers;
create table Worker
	(
    Worker_id varchar(30) primary key,
    Email_Id varchar(30),
    Password varchar(20),
    Rating_id varchar(20),
    Name varchar(30),
    Age varchar(3),
    Gender varchar(8),
    Job varchar(20),
    Working_area varchar(80),
    City varchar(30),
    Payment_mode varchar(20),
    Daily_charges integer(4),
    Specialization varchar(30),
    Address varchar(30),
    Mobile_no varchar(13),
    Availability varchar(30),
    Rating integer(2)
	);


create table User
	(

    UserId varchar(20) NOT NULL,
    EmailId varchar(30),
    Password varchar(20),
    Name varchar(30),
    Address varchar(30),
    State varchar(30),
    MobileNumber varchar(13),
    EmployeeName varchar(20),
    EmployeeId varchar(20),
    PRIMARY KEY(UserId)
	);


create table Requirement
	(

    OrganisationId varchar(20) NOT NULL,
    RequestNumber integer(8),
    NumberOfWorkers integer(4),
    Gender varchar(10),
    WorkName varchar(30),
    Wages_Mode varchar(10),
    StatDate date,
    EndDate date,
    ReqAddress varchar(30),
    City varchar(30),
    WageRange integer(5),
    PRIMARY KEY(OrganisationId , RequestNumber)
	);

create table Admin
	(
	Admin_id varchar(20),
	Password varchar(20)
	);