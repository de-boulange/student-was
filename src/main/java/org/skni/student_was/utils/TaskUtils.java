package org.skni.student_was.utils;

import org.skni.student_was.domain.Task;

public class TaskUtils {

    private static TaskUtils INSTANCE = null;

    private TaskUtils() {

    }

    public TaskUtils getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TaskUtils();
        }
        return INSTANCE;
    }

    public final boolean isTaskValid (Task task) {
        String description = task.getDescription();
        if (description != null && !description.isEmpty()) {
            return true;
        }

        return false;
    }
}
