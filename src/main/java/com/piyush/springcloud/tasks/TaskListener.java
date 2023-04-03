package com.piyush.springcloud.tasks;

import org.springframework.cloud.task.listener.TaskExecutionListener;
import org.springframework.cloud.task.repository.TaskExecution;

public class TaskListener implements TaskExecutionListener {
    @Override
    public void onTaskStartup(TaskExecution taskExecution) {
        System.out.println("Before Task Execution");
    }

    @Override
    public void onTaskEnd(TaskExecution taskExecution) {
        System.out.println("After Task Execution");
    }

    @Override
    public void onTaskFailed(TaskExecution taskExecution, Throwable throwable) {
        System.out.println("After the Task failed");
    }
}
