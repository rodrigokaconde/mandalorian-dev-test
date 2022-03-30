package com.rfoliveira.controller;

import com.rfoliveira.model.Task;
import com.rfoliveira.service.TaskService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("")
public class TaskController {
    @Inject
    TaskService taskService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/add/task")
    public Task addTask(Task task){
        return taskService.addTask(task);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/get/task")
    public String getTask(Task task){
        return taskService.getTask(task);
    }

}
