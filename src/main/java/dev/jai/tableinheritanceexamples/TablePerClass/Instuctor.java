package dev.jai.tableinheritanceexamples.TablePerClass;

import jakarta.persistence.Entity;

@Entity(name = "tbc_instructors")
public class Instuctor extends User{
    private Double ratings;
}
