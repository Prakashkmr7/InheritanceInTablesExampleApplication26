package dev.jai.tableinheritanceexamples.TablePerClass;

import jakarta.persistence.*;

import java.util.UUID;


@Entity(name = "tbc_users")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {
    private String name;

    @Id
    private UUID id;
}


/*
User Post
User has a post
Association = cardinalities
@OneToMany

 */
