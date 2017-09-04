package com.kafka.msg;

/**
 * Created by wodezuiaishinageren on 2017/9/4.
 */
public class MsgModel {
    private long id;
    private Object msg;
    private String  topic;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
