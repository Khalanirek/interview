package com.example.interview.persistence.entity;

public abstract class EntityNotFoundException extends Exception {
    public EntityNotFoundException(String message) {
        super(message);
    }
}
