CREATE TABLE `Clinics` (
	`clinic_id` INT NOT NULL AUTO_INCREMENT,
	`clinic_name` varchar(45) NOT NULL DEFAULT '45',
	`address` varchar(100) NOT NULL UNIQUE,
	`services` varchar(45) NOT NULL,
	`offices_number` INT NOT NULL,
	PRIMARY KEY (`clinic_id`)
);

CREATE TABLE `services` (
	`service_id` INT NOT NULL AUTO_INCREMENT,
	`tittle` varchar(255) NOT NULL UNIQUE,
	`clinic_id` INT NOT NULL,
	`service_cost` DECIMAL NOT NULL,
	`service_duration` TIME NOT NULL,
	`service_information` varchar(255) NOT NULL,
	PRIMARY KEY (`service_id`)
);

CREATE TABLE `Clients` (
	`client_id` INT NOT NULL AUTO_INCREMENT,
	`Name` varchar(45) NOT NULL,
	`Last_Name` varchar(45) NOT NULL,
	`Patronymic` varchar(45) NOT NULL,
	`birth_date` DATE NOT NULL,
	`address` varchar(100) NOT NULL,
	`phone` INT NOT NULL,
	`email` varchar(45) NOT NULL,
	`medical_polis` INT NOT NULL,
	`medical_police` INT NOT NULL,
	`passport_number` INT NOT NULL,
	`passport_serie` INT NOT NULL,
	`snills` INT NOT NULL,
	PRIMARY KEY (`client_id`)
);

CREATE TABLE `Appointments_booking` (
	`id_appointment` INT NOT NULL AUTO_INCREMENT,
	`appointments_time` DATETIME NOT NULL,
	`client_id` INT NOT NULL,
	`clinic_id` INT NOT NULL,
	`doctor_id` INT NOT NULL,
	`service_id` INT NOT NULL,
	`status` varchar(25) NOT NULL,
	PRIMARY KEY (`id_appointment`)
);

CREATE TABLE `Doctors` (
	`doctor_id` INT NOT NULL AUTO_INCREMENT,
	`Name` varchar(255) NOT NULL,
	`Last_Name` varchar(255) NOT NULL,
	`Patronymic` varchar(255) NOT NULL,
	`birth_date` DATETIME NOT NULL,
	`address` varchar(255) NOT NULL,
	`phone` INT NOT NULL,
	`email` varchar(255) NOT NULL,
	`education` varchar(255) NOT NULL,
	`experience` varchar(255) NOT NULL,
	`specialization` varchar(255) NOT NULL,
	`clinic_id` INT NOT NULL,
	`office` INT NOT NULL,
	PRIMARY KEY (`doctor_id`)
);

CREATE TABLE `medical_card` (
	`medical_card_id` INT NOT NULL AUTO_INCREMENT,
	`client_id` INT NOT NULL,
	`last_appointment` DATE NOT NULL,
	`disease history` varchar(255) NOT NULL,
	`discharge_summary` varchar(255) NOT NULL,
	`brief_history` varchar(255) NOT NULL,
	`diagnosis` varchar(255) NOT NULL,
	`research` varchar(255) NOT NULL,
	PRIMARY KEY (`medical_card_id`)
);

CREATE TABLE `research` (
	`research_id` INT NOT NULL AUTO_INCREMENT,
	`research_tittle` varchar(255) NOT NULL,
	`name_who_did_research` varchar(255) NOT NULL,
	`research_date_time` DATETIME(255) NOT NULL,
	`research_result` varchar(255) NOT NULL,
	PRIMARY KEY (`research_id`)
);

CREATE TABLE `specialization` (
	`specialization_id` INT NOT NULL AUTO_INCREMENT,
	`specialization_name` varchar(255) NOT NULL,
	PRIMARY KEY (`specialization_id`)
);

CREATE TABLE `admins` (
	`admin_id` INT NOT NULL AUTO_INCREMENT,
	`Name` varchar(45) NOT NULL,
	`Last_Name` varchar(45) NOT NULL,
	`Patronymic` varchar(45) NOT NULL,
	`birth_date` varchar(45) NOT NULL,
	`address` varchar(45) NOT NULL,
	`phone` INT NOT NULL,
	`email` varchar(25) NOT NULL,
	PRIMARY KEY (`admin_id`)
);

ALTER TABLE `Clinics` ADD CONSTRAINT `Clinics_fk0` FOREIGN KEY (`services`) REFERENCES ``(``);

ALTER TABLE `services` ADD CONSTRAINT `services_fk0` FOREIGN KEY (`clinic_id`) REFERENCES `Clinics`(`services`);

ALTER TABLE `Appointments_booking` ADD CONSTRAINT `Appointments_booking_fk0` FOREIGN KEY (`client_id`) REFERENCES `Clients`(`client_id`);

ALTER TABLE `Appointments_booking` ADD CONSTRAINT `Appointments_booking_fk1` FOREIGN KEY (`clinic_id`) REFERENCES `Clinics`(`clinic_id`);

ALTER TABLE `Appointments_booking` ADD CONSTRAINT `Appointments_booking_fk2` FOREIGN KEY (`doctor_id`) REFERENCES `Doctors`(`doctor_id`);

ALTER TABLE `Appointments_booking` ADD CONSTRAINT `Appointments_booking_fk3` FOREIGN KEY (`service_id`) REFERENCES `services`(`service_id`);

ALTER TABLE `Doctors` ADD CONSTRAINT `Doctors_fk0` FOREIGN KEY (`specialization`) REFERENCES `specialization`(`specialization_id`);

ALTER TABLE `Doctors` ADD CONSTRAINT `Doctors_fk1` FOREIGN KEY (`clinic_id`) REFERENCES `Clinics`(`clinic_id`);

ALTER TABLE `Doctors` ADD CONSTRAINT `Doctors_fk2` FOREIGN KEY (`office`) REFERENCES `Clinics`(`offices_number`);

ALTER TABLE `medical_card` ADD CONSTRAINT `medical_card_fk0` FOREIGN KEY (`client_id`) REFERENCES `Clients`(`client_id`);

ALTER TABLE `medical_card` ADD CONSTRAINT `medical_card_fk1` FOREIGN KEY (`last_appointment`) REFERENCES `Appointments_booking`(`appointments_date`);

ALTER TABLE `medical_card` ADD CONSTRAINT `medical_card_fk2` FOREIGN KEY (`research`) REFERENCES `research`(`research_id`);










