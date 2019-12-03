package org.skni.student_was.utils;

import org.skni.student_was.domain.Task;

public class TaskUtils {

    private static TaskUtils instance = null;

    private TaskUtils () {

    }

    public TaskUtils getInstance () {
        if (instance == null) {
            instance = new TaskUtils();
        }
        return instance;
    }

    public final boolean isTaskValid (Task task) {
        String description = task.getDescription();
        if (description != null && !description.isEmpty()) {
            return true;
        }

        return false;
    }
}