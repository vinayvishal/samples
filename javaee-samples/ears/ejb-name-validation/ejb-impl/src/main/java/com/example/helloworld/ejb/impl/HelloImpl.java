package com.example.helloworld.ejb.impl;

import com.example.helloworld.ejb.api.Hello;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.Queue;

@Stateless
public class HelloImpl implements Hello {

    /*
     * A jms queue resource should be pre-configured and bound to jndi name:
     * java:comp/env/myQueue
     */
    @Resource(name="myQueue")
    private javax.jms.Queue myQueue;
    
    @Override
    public String hello() {
        return "Hello World!";
    }

}
