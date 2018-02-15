

Running Application:

If you want to run the application locally you’ll need to follow these steps:

If You want to use MySQL database 
spring.datasource.url= jdbc:mysql://localhost:3306/dogdata
spring.datasource.username=<username>
spring.datasource.password=<password>
server.port=<port>
spring.jpa.hibernate.ddl-auto=create

Create Tables in Local Database:

CREATE TABLE `breed` (
  `breed_id` int(11) NOT NULL AUTO_INCREMENT,
  `breed_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`breed_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


CREATE TABLE `dog` (
  `dog_id` int(11) NOT NULL AUTO_INCREMENT,
  `dog_name` varchar(255) DEFAULT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  `breed_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`dog_id`),
  FOREIGN KEY (`breed_id`) REFERENCES `breed` (`breed_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;



CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


CREATE TABLE `userdoglike` (
  `id_user_dog_like` int(11) NOT NULL AUTO_INCREMENT,
  `is_like` TINYINT(1) DEFAULT NULL,
  `dog_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_user_dog_like`),
   FOREIGN KEY (`dog_id`) REFERENCES `dog` (`dog_id`),
   FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

Insert Data into different tables.

//Insert Data into Breed Table
insert into breed(breed_id, 
breed_name) 
VALUES 
(1, 
'B1'),(2, 
'B2'),(3, 
'B3');

//Insert Data into DogTable
insert into dog
(dog_id,
dog_name,
image_url,
breed_id)
values
(1,'dog1','images',1),(2,'dog2','funky',1),(3,'dog3','puppy',2),(4,'dog4','bubbly',2),(5,'dog5','fluffy',3),(6,'dog6','hairy',3);

//Insert Data in to User Table
insert into user
(user_id,first_name,last_name,user_name)
values (1,'Runner','Jacker','JRunner'),(2,'Marley','Bob','Bmarley'),(3,'Greg','jinz','GJinz');

//Insert Data into UserDogLike Table
insert into userdoglike (id_user_dog_like,is_like,dog_id,user_id)values
(1,1,1,1)(2,0,1,2),(3,1,1,3),(4,0,2,1),(5,1,2,2); 

Package the application
$ mvn package

Run the application 
$ mvc spring-boot:run

Testing using Swagger
Swagger can be used for the test of api please run the link in browser to look at the api documentation.
http://localhost:8080/swagger-ui.html


















