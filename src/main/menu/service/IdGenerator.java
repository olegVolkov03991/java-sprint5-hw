package main.menu.service;

public class IdGenerator {
    private int taskCounter = 0;
    public int generateId(){
        return ++taskCounter;
    }
}