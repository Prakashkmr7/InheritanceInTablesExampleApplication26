package dev.jai.tableinheritanceexamples.JoinedTable;

import jakarta.persistence.*;

import java.lang.annotation.Inherited;
import java.util.UUID;

//this is parent class - 3 child table - Instructor,Mentor,TA
//better way of working. also @MappedSuperClass we can use.
//in case of @MappedSuperclass - spring will not create table for User - i.e only for child.
//if we will mention strategy as   strategy=InheritanceType.TABLE_PER_CLASS, it will aslo creates
//table for User.



@Entity(name = "jt_users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    private String name;

    @Id
    private UUID id;
}
/*
Sorting, searching
 */

/*
User
id name
 */
/*
Assignment:- Setup this and run the spring appn
please do it. and see all tables created per strategy.
 */