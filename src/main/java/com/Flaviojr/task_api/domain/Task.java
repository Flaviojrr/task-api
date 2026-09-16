package com.Flaviojr.task_api.domain;

import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Entity(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String title;
    private String description;
    private Boolean completed;
    private LocalDate due_date;
    private Instant created_at;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
