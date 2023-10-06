package com.cydeo.dto;

import com.cydeo.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
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


}