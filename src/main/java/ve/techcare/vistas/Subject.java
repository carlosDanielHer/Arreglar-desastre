package ve.techcare.vistas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Hernandez
 */

public class Subject {

    private List<Observador> observers = new ArrayList<>();

    public void addObserver(Observador observer) {
        observers.add(observer);
    }

    public void removeObserver(Observador observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observador observer : observers) {
            observer.actualizar();
        }
    }
}
