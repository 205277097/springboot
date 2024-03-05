CREATE TABLE `user` (
     `id` VARCHAR(32) NOT NULL PRIMARY KEY,
     `username` VARCHAR(32) NOT NULL COLLATE 'utf8_general_ci',
     `password` VARCHAR(100) NOT NULL COLLATE 'utf8_general_ci',
     `email` VARCHAR(100) NULL COLLATE 'utf8_general_ci',
     `gender` VARCHAR(100) NULL COLLATE 'utf8_general_ci'
)
