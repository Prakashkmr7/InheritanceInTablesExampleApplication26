package dev.jai.tableinheritanceexamples.MappedSupreClass;

import jakarta.persistence.*;

import java.util.UUID;


@Entity(name = "tbc_users")
@MappedSuperclass
public abstract class User {
    private String name;

    @Id
    private UUID id;
}

/*
@mappeduperclass = we can not create table for this class but we can use it as a parent class for other entities. and all the properties of this class will be inherited by the child class and will be mapped to the child class table.
 */


/*
User Post
User has a post
Association = cadinalities
@OneToMany

 */
