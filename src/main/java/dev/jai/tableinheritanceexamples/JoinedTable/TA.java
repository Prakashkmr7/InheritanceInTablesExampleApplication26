package dev.jai.tableinheritanceexamples.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "jt_tas")
@PrimaryKeyJoinColumn(name = "ta_id")
public class TA extends User{
    private Integer helpRequests;

}

/*
TA
helpRequests xyz_id
 */
