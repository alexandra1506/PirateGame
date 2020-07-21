package services;

import exceptions.OutOfMapException;

public interface EventListener {
    // событие произошло
    void eventHappened(String eventName, Object parameter) throws OutOfMapException;

}
