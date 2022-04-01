package com.rfoliveira.controller;

import com.rfoliveira.model.Task;
import com.rfoliveira.service.TaskService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("")
public class TaskController {
    @Inject
    TaskService taskService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/add/task")
    public Response addTask(Task task){
        return taskService.addTask(task);
    }

}
