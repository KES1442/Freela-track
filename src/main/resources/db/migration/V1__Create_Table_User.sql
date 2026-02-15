Create table `users`(
    `id` int primary key auto_increment,
    `first_name` varchar(100) not null,
    `last_name` varchar(120) not null,
    `email` varchar(200) unique not null,
    `birthday` DATE,
    `gender` varchar(10),
    `created_at` TIMESTAMP DEFAULT current_timestamp
)