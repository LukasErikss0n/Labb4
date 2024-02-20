import java.io.*;
import java.util.Scanner;

public class GraphIO {
    /*public static void main(String[] args) {
        BFTmain.main(args);
    }*/

    static public void readFile(Graph g, String fileName) throws IOException {
       try {
           File file = new File(fileName); //skapar en file instans från file classen
           Scanner scanner = new Scanner(file);
           int numberOfNodes = Integer.parseInt(scanner.nextLine()); //plockar antalet noder
           for (int i = 1; i <= numberOfNodes ; i++) {
               String line = scanner.nextLine();
               String[] numbersStr = line.split(" ");

               int identity = Integer.parseInt(numbersStr[0]);
               int x = Integer.parseInt(numbersStr[1]);
               int y = Integer.parseInt(numbersStr[2]);

               g.addNode(identity, x, y);

           }
           while (scanner.hasNextLine()){
               String line = scanner.nextLine();
               String[] numbersStr = line.split(" ");

               int identity1 = Integer.parseInt(numbersStr[0]);
               int identity2 = Integer.parseInt(numbersStr[1]);
               int weight = Integer.parseInt(numbersStr[2]);

               g.addEdge(identity1, identity2, weight);


           }

       }catch (IOException e){
           System.out.println("Error new s sss ");
       }



    }





}
