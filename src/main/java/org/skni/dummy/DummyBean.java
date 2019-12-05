package org.skni.dummy;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DummyBean {

    @PostConstruct
    public void createBean() {
        System.out.println("DummyBean has been created");
    }
}
