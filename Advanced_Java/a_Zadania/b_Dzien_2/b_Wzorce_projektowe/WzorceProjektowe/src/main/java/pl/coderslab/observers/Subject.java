package pl.coderslab.observers;

// Subject
interface Subject {
    void addPost(Post post);
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}