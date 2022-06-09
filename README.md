Create query for Log Table:
SELECT * FROM springBoot_DB.EVENT_LOGS;CREATE TABLE `EVENT_LOGS` (
  `ID` varchar(40) NOT NULL,
  `DATE_TIME` datetime DEFAULT NULL,
  `CLASS_INFO` varchar(45) DEFAULT NULL,
  `LEVEL` varchar(45) DEFAULT NULL,
  `MESSAGE` longtext,
  `EXCEPTION_INFO` longtext,
  PRIMARY KEY (`ID`)
) 
