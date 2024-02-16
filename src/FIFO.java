import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class FIFO implements Queue {
    private ArrayList<Object> data;
    private int maxCap;

    public static void main(String[] args) {
        FIFOmain.main(args);
    }

    public FIFO(){
        this.data = new ArrayList<>();
    }

    public void add(Object item){
        data.add(item);
    }
    @Override
    public  void removeFirst() throws NoSuchElementException {
        if(isEmpty()){
            throw new NoSuchElementException("No such object");
        }
        data.remove(first());
    }
    @Override
    public boolean isEmpty(){
        if(data.isEmpty()){
            return true;
        }
        return false;
    }
    @Override
    public Object first() throws NoSuchElementException {
        if(isEmpty()){
            throw new NoSuchElementException("No such object");
        }
        return data.get(0);
    }
    @Override
    public int size(){
        if(data.size() > maxSize()){
            maxCap = data.size();
        }
        return data.size();
    }

    public int maxSize(){

        return maxCap;
    }

    public String toString(){
        StringBuilder conToString = new StringBuilder();
        conToString.append("Queue: ");
        for (Object element: data) {
            conToString.append("(");
            conToString.append(element);
            conToString.append(") ");
        }
        return conToString.toString();
    }

    public boolean equals(Object f){
        if(f.getClass() != getClass()){
            throw new ClassCastException("not samme type");
        }
        FIFO other = (FIFO) f;

        if(size() != other.size()){
            return false;
        }
        for (int i = 0; i < size(); i++) {
             Object element1 = data.get(i);
             Object element2 = other.data.get(i);

             if(element1 == null && element2 != null || element1 != null && element2 == null ){
                return false;
             }
             if(element1 == null && element2 == null){
                 continue;
             }

             if(!element1.equals(element2)){
                 return false;
             }

        }
        return true;

    }




















}
