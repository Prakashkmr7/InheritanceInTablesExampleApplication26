package dev.jai.tableinheritanceexamples.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

/*
@PrimaryKeyJoinColumn - this annotation tells Mentor table will be related to User table on the primary
key in this ex, primary key of User table will also be the primary key of Mentor table.
We can give any unique name like 'mentor_id'.
 */

@Entity(name = "jt_mentors")
@PrimaryKeyJoinColumn(name = "mentor_id")
public class Mentor extends User{
    private String company;

}
