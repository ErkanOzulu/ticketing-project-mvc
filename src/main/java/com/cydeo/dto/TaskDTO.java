package com.cydeo.dto;

import com.cydeo.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@Data
public class TaskDTO {
    private Long id;
    private ProjectDTO project;
    private UserDTO user;
    private String taskSubject;
    private  String taskDetail;
    private LocalDate assignedTask;
    private Status taskStatus;

    public TaskDTO(ProjectDTO project, UserDTO user, String taskSubject, String taskDetail, LocalDate assignedTask, Status taskStatus) {
        this.project = project;
        this.user = user;
        this.taskSubject = taskSubject;
        this.taskDetail = taskDetail;
        this.assignedTask = assignedTask;
        this.taskStatus = taskStatus;
        this.id= UUID.randomUUID().getMostSignificantBits();

    }
}