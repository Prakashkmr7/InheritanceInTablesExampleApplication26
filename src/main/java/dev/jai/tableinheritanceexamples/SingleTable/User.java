package dev.jai.tableinheritanceexamples.SingleTable;

import jakarta.persistence.*;

import java.util.UUID;


@Entity(name="st_user")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type",discriminatorType = DiscriminatorType.STRING)
public class User {
    private String name;

    @Id
    private UUID id;
}

/*
name, id, noOfHR, rating, company, user_type(string)
Vinor  1    2      null     null     "TA"
 */
/*
users
id | name | user_type | help_requests | ratings | company

25 Umang
 */
/*
Homework

Implement and run the application and see the tables
 */