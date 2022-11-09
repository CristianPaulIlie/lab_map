package model;

import java.util.Objects;

public abstract class Task {
    private String taskID;
    private String description;

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getTaskID() { return taskID;}
    public String getDescription() { return description;}

    public Task(String _taskID, String _description)
    {
        taskID = _taskID;
        description = _description;
    }

    public abstract void execute();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(taskID, task.taskID) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskID, description);
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskID='" + taskID + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
