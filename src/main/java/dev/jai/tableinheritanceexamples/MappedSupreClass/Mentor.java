package dev.jai.tableinheritanceexamples.MappedSupreClass;

import jakarta.persistence.Entity;

@Entity(name = "tbc_mentors")
public class Mentor extends User {
    private String company;

}
