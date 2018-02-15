insert into breed(breed_id,breed_name)
values 
(1,'B1'),(2, 'B2'),(3, 'B3');

insert into dog
(dog_id,dog_name,image_url,breed_id)
values
(1,'dog1','images',1),(2,'dog2','funky',1),(3,'dog3','puppy',2),(4,'dog4','bubbly',2),(5,'dog5','fluffy',3),(6,'dog6','hairy',3);


INSERT INTO user
(user_id,first_name,last_name,user_name)
values
(1,'Runner','Jacker','JRunner'),(2,'Marley','Bob','Bmarley'),(3,'Greg','jinz','GJinz');

insert into userdoglike
(id_user_dog_like,is_like,dog_id,user_id)
values
(1,1,1,1),(2,0,1,2),(3,1,1,3),(4,0,2,1),(5,1,2,2); 
 
