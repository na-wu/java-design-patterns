import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class StockGrabber extends Observable {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private StockGrabber(){
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }


    public void setIbmPrice(double price){
        this.ibmPrice = price;
        setChanged();
        notifyObservers();
    }
    public void setAaplPrice(double price){
        this.aaplPrice = price;
        setChanged();
        notifyObservers();
    }
    public void setGoogPrice(double price){
        this.googPrice = price;
        setChanged();
        notifyObservers();
    }
}
