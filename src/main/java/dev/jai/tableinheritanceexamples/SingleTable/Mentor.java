package dev.jai.tableinheritanceexamples.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@DiscriminatorValue(value = "Mentor")
@Entity(name = "st_mentors")
public class Mentor extends User {
    private String company;

}
