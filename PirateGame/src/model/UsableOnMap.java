package model;

import exceptions.OutOfMapException;

public interface UsableOnMap {

    void doStep() throws OutOfMapException; // объект делает шаг
    boolean isMovable(); // true - если объект может перемещаться сам
    int X(); // получить координаты
    int Y();
}
