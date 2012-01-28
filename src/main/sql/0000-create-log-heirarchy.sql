-- Rename vehicleFuelLog to log, since it has most of the fields we want.
RENAME TABLE vehicleFuelLog TO log;

-- Change table engine to InnoDB
ALTER TABLE log ENGINE=InnoDB;

-- Rename vehicleFuelLogId to logId
ALTER TABLE log CHANGE vehicleFuelLogId logId INT(10);

-- Create extension table for logFuel
CREATE TABLE logFuel (
	logId	INT(10) PRIMARY KEY,
	fuel	FLOAT(7,3),
	octane	INT(3),
	missedFillup	TINYINT(1),
	FOREIGN KEY (logId) REFERENCES log(logId)
) ENGINE=InnoDB;

-- Populate logFuel with current log entries
INSERT INTO logFuel (logId, fuel, octane, missedFillup)
	SELECT logId, fuel, octane, missedFillup FROM log;

-- Drop old columns from log
ALTER TABLE log DROP COLUMN fuel;
ALTER TABLE log DROP COLUMN octane;
ALTER TABLE log DROP COLUMN missedFillup;