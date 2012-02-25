-- Create tag table
CREATE TABLE tag (
	tagId	INT(10) PRIMARY KEY AUTO_INCREMENT,
	label	VARCHAR(100),
	description	TEXT,
	userId	INT(10),
	modified	TIMESTAMP,
	created		TIMESTAMP,
	FOREIGN KEY (userId) REFERENCES user(userId)
) ENGINE=InnoDB;

-- Create log->tag xref table
CREATE TABLE tagLog (
	logId	INT(10),
	tagId	INT(10),
	FOREIGN KEY (logId) REFERENCES log(logId),
	FOREIGN KEY (tagId) REFERENCES tag(tagId)
) ENGINE=InnoDB;