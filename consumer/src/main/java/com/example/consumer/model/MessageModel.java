package com.example.consumer.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_MESSAGES")
public class MessageModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String value;

    public MessageModel(Long id, String value) {
        this.id = id;
        this.value = value;
    }

    public MessageModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
