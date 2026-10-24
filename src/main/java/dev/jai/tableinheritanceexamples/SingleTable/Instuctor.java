package dev.jai.tableinheritanceexamples.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@DiscriminatorValue(value = "Instructor")
@Entity(name = "st_instructors")


public class Instuctor extends User{
    private Double ratings;
}
