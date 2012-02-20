-- Add cost column
ALTER TABLE log ADD COLUMN cost INT(10) AFTER odometer;

-- Create extension table for logFuel
CREATE TABLE logMaintenance (
	logId	INT(10) PRIMARY KEY,
	description	TEXT,
	FOREIGN KEY (logId) REFERENCES log(logId)
) ENGINE=InnoDB;