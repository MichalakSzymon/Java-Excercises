package pl.coderslab.observers;
class MainObservers {

    public static void main(String[] args) {

        final Facebook facebook = new Facebook();
        facebook.attach(new FacebookObserver());

        facebook.addPost(new Post());

        final Subscription subscription = new Subscription();
        subscription.attach(new SubscriberObserver());

        subscription.addPost(new Post());

        final Blog blog = new Blog();
        blog.attach(new PublishSubscriber());

        blog.addPost(new Post());
    }
}