import java.util.ArrayList;
import java.util.List;

interface Subscriber{
    void update(String news);
}
public class NewAgency {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscribers(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscribers(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String news){
        for(Subscriber subscriber : subscribers){
            subscriber.update(news);
        }
    }
}
