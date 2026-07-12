CREATE TABLE tasks
(
    id UUID NOT NULL PRIMARY KEY,
    title VARCHAR (255) NOT NULL ,
    description VARCHAR(255),
    completed BOOLEAN DEFAULT FALSE ,
    due_date DATE,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    user_id UUID,
    CONSTRAINT fk_UserTask FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
)