package dev.jai.tableinheritanceexamples.MappedSupreClass;

import jakarta.persistence.Entity;

@Entity(name = "tbc_instructors")
public class Instuctor extends User {
    private Double ratings;
}
