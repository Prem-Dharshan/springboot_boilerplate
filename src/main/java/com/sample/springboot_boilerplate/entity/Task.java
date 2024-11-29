package com.sample.springboot_boilerplate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tid", nullable = false, updatable = false)
    private Integer tid;

    @Column(name = "task_title", nullable = false, length = 255)
    private String taskTitle;

    @ManyToOne
    @JoinColumn(name = "created_by", nullable = false)
    private User createdBy;

    @ManyToOne
    @JoinColumn(name = "assigned_to", nullable = false)
    private User assignedTo;

    @Column(name = "task_start_date", nullable = false)
    private LocalDate taskStartDate;

    @Column(name = "task_end_date", nullable = false)
    private LocalDate taskEndDate;

    @Column(name = "task_created_date", nullable = false)
    private LocalDate taskCreatedDate;

    @Column(name = "task_updated_date", nullable = false)
    private LocalDate taskUpdatedDate;

    @Column(name = "task_status", nullable = false, length = 25)
    private String taskStatus;

    @Column(name = "task_desc", nullable = false, length = 255)
    private String taskDesc;

    @Column(name = "task_priority", nullable = false)
    private Integer taskPriority;

    @Column(name = "task_ref", nullable = false, length = 255)
    private String taskRef;

    @ManyToOne
    @JoinColumn(name = "gid")
    private Goal goal;
}
