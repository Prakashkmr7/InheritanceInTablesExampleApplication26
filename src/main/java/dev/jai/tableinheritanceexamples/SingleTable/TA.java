package dev.jai.tableinheritanceexamples.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@DiscriminatorValue(value = "TA")
@Entity(name = "st_tas")
public class TA extends User{
    private Integer helpRequests;

}
