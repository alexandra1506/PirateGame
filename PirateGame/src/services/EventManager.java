package services;

import exceptions.OutOfMapException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager implements EventEmit { // хранит событие и всех подписчиков

    // ключ, список слушателей
    private Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String ...eventNames) {
        for (String evenName: eventNames
             ) {
          listeners.put(evenName, new ArrayList<>());
        }
    }
    // добавляем нового слушателя
    public void AddNewListener(String evenName, EventListener listener){
        // если есть в карте событие, то добавить, если нет события, то создать новое
      List<EventListener> eventListeners = this.listeners.get(evenName);
      if(eventListeners == null){
          eventListeners = new ArrayList<>();
          listeners.put(evenName, eventListeners);
      }
      eventListeners.add(listener);
    }

    // удаление
    public void remove(String eventName, EventListener listener){
        List<EventListener> eventListeners = listeners.get(eventName);
        if(eventListeners !=null)
        eventListeners.remove(listener);
    }

    // информатор - издатель
    public void eventEmitting(String eventName, Object parameter) throws OutOfMapException {
        List<EventListener> eventListeners = listeners.get(eventName);
        if(eventListeners != null){
            for (EventListener s: eventListeners) {
                s.eventHappened(eventName, parameter);
            }
        }
    }

}
