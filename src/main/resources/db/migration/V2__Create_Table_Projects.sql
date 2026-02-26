Create table `projects`(
                        `id` BIGINT primary key auto_increment,
                        `title` varchar(200) not null,
                        `price` DECIMAL(10,2) not null,
                        `description` varchar(500) not null,
                        `user_id` Bigint not null,

                        CONSTRAINT fk_project_user
                            FOREIGN KEY (user_id)
                            REFERENCES users(id)
)