package pl.coderslab.observers;

class PublishSubscriber implements Observer {

    @Override
    public void update() {
        System.out.println("dodanie postu na powiązanych z naszym systemem blogach");
    }
}