package pl.coderslab.observers;

class SubscriberObserver implements Observer {

    @Override
    public void update() {
        System.out.println("powiadomienie subskrybentów o pojawieniu się nowego postu");
    }
}