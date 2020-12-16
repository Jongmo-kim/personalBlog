create table "user"(
    user_no number primary key,
    user_id char(20) unique not null,
    user_pw char(20) not null,
    nickname char(20) unique not null,
    email varchar(100) not null,
    grade char(15) check(grade in('사용자','관리자'))
);
create sequence user_seq;

create table "category"(
    category_no number primary key,
    category_name varchar2(20)
);
create sequence category_seq;

create table "comment"(
    comment_no number primary key,
    user_no number,
    comment_content varchar2(2000),
    reg_date date,
    Constraint foreign_key_comment_writer foreign key(user_no)
     REFERENCES "user"(user_no) on delete cascade 
);
create sequence comment_seq;

create table board(
    board_no number primary key,
    category_no number,
    comment_no number,
    user_no number,
    board_title varchar2(200),
    board_content varchar2(4000),
    reg_date datE,
    CONSTRAINT FOREIGN_KEY_BOARD_CATEGORY_NO FOREIGN KEY(CATEGORY_NO)
    REFERENCES "category"(CATEGORY_NO) ON DELETE CASCADE,
    
    constraint FOREIGN_KEY_BOARD_COMMENT_NO FOREIGN KEY(COMMENT_NO)
    REFERENCES "comment"(COMMENT_NO) ON DELETE CASCADE,
    
    CONSTRAINT FOREIGN_KEY_BOARD_USER_NO FOREIGN KEY(USER_NO)
    REFERENCES "user"(USER_NO) ON DELETE CASCADE
); 
 create sequence board_seq;