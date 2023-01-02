CREATE TABLE IF NOT EXISTS blogs
(
    blog_id int PRIMARY KEY NOT NULL,
    category_id int NOT NULL,
    blog_title text NOT NULL,
    blog_content text NOT NULL,
    published_at text NOT NULL,
    updated_at text,
    tags text NOT NULL,
    user_id int NOT NULL,
    user_name text NOT NULL
)


INSERT INTO blogs VALUES ('1', '3', 'world cup final', 'argentina vs france', '2022.12.15','','football','1001','dxw');