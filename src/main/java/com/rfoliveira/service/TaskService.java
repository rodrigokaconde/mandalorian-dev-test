package com.rfoliveira.service;

import com.rfoliveira.model.Task;
import io.quarkus.redis.client.RedisClient;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Arrays;

@Singleton
public class TaskService {
    @Inject
    RedisClient redisClient;

    public Task addTask(Task task) {
        if(task.checkTitle()){
            redisClient.set(Arrays.asList(task.getTitle(), task.getDescription()));
            return task;
        }else{
            throw new IllegalArgumentException("Error title");
        }

    }

    public String getTask(Task task) {
        return redisClient.get(task.getTitle()).toString();
    }
}
