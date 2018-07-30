package pl.coderslab.observers;

import java.util.ArrayList;
import java.util.List;

abstract class AbstractSubject implements Subject {

    private List<Observer> observers
            = new ArrayList<>();
    @Override
    public void addPost(Post post) {
        notifyObservers();
    }
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
