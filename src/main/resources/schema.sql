DROP TABLE IF EXISTS `testdb`.`todo`;
CREATE TABLE `testdb`.`todo` (
  `id` VARCHAR(36) NOT NULL,
  `description` varchar(255) NOT NULL,
  `created` TIMESTAMP NULL,
  `modified` TIMESTAMP NULL,
  `completed` BOOLEAN NULL,
  PRIMARY KEY (`id`));