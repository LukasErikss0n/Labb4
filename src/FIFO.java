import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class FIFO implements Queue {
    private ArrayList<Object> data;
    private int maxCap;

    /*public static void main(String[] args) {
        FIFOmain.main(args);
    }*/

    public FIFO(){
        this.data = new ArrayList<>();
    }

    public void add(Object item){ //lägger till nästa element i listan, tittar om listans storlek > maxsize
        if(size() > maxSize()){
            maxCap = size();
        }
        data.add(item);
    }
    @Override
    public  void removeFirst() throws NoSuchElementException {
        if(isEmpty()){
            throw new NoSuchElementException("No such object");
        }
        data.remove(first()); // tar bort det första elementet, first returnerar första elementet
    }
    @Override
    public boolean isEmpty(){
        return data.isEmpty();
    }
    @Override
    public Object first() throws NoSuchElementException {
        if(isEmpty()){
            throw new NoSuchElementException("No such object");
        }
        return data.get(0); //returnerar första elementet
    }
    @Override
    //returnerar storlekn på listan, är den störe
    public int size(){
        return data.size();
    }

    public int maxSize(){
        return maxCap;
    }

    public String toString(){ //konverterar arraylistan till en string
        StringBuilder conToString = new StringBuilder();
        conToString.append("Queue: ");
        for (Object element: data) {
            conToString.append("(");
            conToString.append(element);
            conToString.append(") ");
        }
        return conToString.toString();
    }

    public boolean equals(Object f){ //tittar om listor är lika
        if(f.getClass() != getClass()){
            throw new ClassCastException("not samme type");
        }
        FIFO other = (FIFO) f; //casting, sätter f till samma typ som FIFO classen

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
