package com.systex.springboot.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "task_table")
public class TaskTable implements Serializable {

    @Id
    @SequenceGenerator(name = "task_seq")
    @Column(name = "task_seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int task_seq;

    @Column(name = "task_name", length = 255)
    String task_name;

    @Column(name = "description", length = 255)
    String description;

    public void setName(String data) {
        task_name = data;
    }

    public void setDescription(String data) {
        description = data;
    }

    public int getSeq() {
        return task_seq;
    }

    public String getName() {
        return task_name;
    }

    public String getDescription() {
        return description;
    }

}
