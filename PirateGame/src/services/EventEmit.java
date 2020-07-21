package services;

import exceptions.OutOfMapException;

public interface EventEmit {

    void AddNewListener(String evenName, EventListener listener);

    void remove(String eventName, EventListener listener);

    void eventEmitting(String eventName, Object parameter) throws OutOfMapException;
}
