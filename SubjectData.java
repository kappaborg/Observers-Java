package Observers;
public interface SubjectData {
    void addObserver(TrafficObserver observer);
    void removeObserver(TrafficObserver observer);
    void notifyObservers();
    Object getState();
}
