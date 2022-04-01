package com.rfoliveira.service;

import com.rfoliveira.model.Task;
import io.quarkus.redis.client.RedisClient;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.core.Response;
import java.util.Arrays;

@Singleton
public class TaskService {
    @Inject
    RedisClient redisClient;

    public Response addTask(Task task) {
        if(task.checkTitle()){
            redisClient.set(Arrays.asList(task.getTitle(), task.getDescription()));
            return Response.ok(task).build();
        }else{
            throw new IllegalArgumentException("Error title");
        }
    }

}
