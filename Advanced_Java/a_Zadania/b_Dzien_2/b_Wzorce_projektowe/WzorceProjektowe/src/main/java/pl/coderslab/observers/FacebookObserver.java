package pl.coderslab.observers;

class FacebookObserver implements Observer {

    @Override
    public void update() {
        System.out.println("dzieki facebook wiem o nowym poscie");
    }
}