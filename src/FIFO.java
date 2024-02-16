import java.rmi.NoSuchObjectException;
import java.util.ArrayList;

public class FIFO {
    private ArrayList<Object> queue;
    private int maxCap;

    public FIFO(){
        queue = new ArrayList<>();
    }
    public void add(Object item){
        this.add(item);
    }

    public  void removeFirst() throws NoSuchObjectException {
        if(isEmpty()){
            throw new NoSuchObjectException("No such object");
        }
        queue.remove(first());
    }

    public Boolean isEmpty(){
        if(queue.isEmpty()){
            return true;
        }
        return false;
    }

    public Object first() throws NoSuchObjectException {
        if(isEmpty()){
            throw new NoSuchObjectException("No such object");
        }
        return queue.get(0);
    }

    public int size(){
        if(queue.size() > maxSize()){
            maxCap = queue.size();
        }
        return queue.size();
    }

    public int maxSize(){
        return maxCap;
    }

    public boolean equals(Object f){
        if(!(f instanceof FIFO)){
            throw new ClassCastException("not samme type");
        }
        if(((FIFO) f).size() != size()){
            return false;
        }
        if()

    }




















}
