package org.skni.student_was.utils;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {

    private static final AtomicInteger counter = new AtomicInteger(0);

    public static Integer getUniqueId(){
        return counter.incrementAndGet();
    }
}