
import java.util.LinkedList;
import java.util.ListIterator;


/**
 *
 * @author Ibrahim Ali Metin
 */
public class Main {
    
    public static void listeyiBastir(LinkedList<String> yerler){
        
        /*for(String s : yerler){
            System.out.println(s);
        }*/
        
        //iterator kullanarak LinkedList 'i bastıracağız. 
        
        ListIterator<String> iterator = yerler.listIterator();
        //ListIterator: ir interface 'dir. LinkedList üzerinde işlemler yapmak için kullanılır. 
        
        while(iterator.hasNext()){ //iteratorun gösterdiği obje var mı bakıyoruz? (true)
            
            System.out.println(iterator.next()); //iterator üzerinde sürekli bir ileri gidilerek listeyi bastırdık. 
            
        }
        
    }
    
    public static void siraliEkle (LinkedList<String> yerler , String yeni){
        
        ListIterator<String> iterator = yerler.listIterator();
        
        while(iterator.hasNext()){
            
            int karsilastir = iterator.next().compareTo(yeni); // iteratorun gösterdiği değer ile yeni değer kıyaslanır. Değerler eşitse (0), Yeni iteratordan buyukse (-1), Yeni iteratordan kucukse (1)
            // compareTo() --> Alfabetik olarak sıralar. 
            if (karsilastir == 0) {
                //iki değer eşitse
                System.out.println("Listenizde bu elaman vardır");
                return; // methodu sonlandırmak için kullanacağız
            }
            else if (karsilastir < 0){
                // Yeni değer iterator.next den daha buyuk
            }      
            else if (karsilastir > 0){
                iterator.previous(); // iterator bir geri gelecek
                iterator.add(yeni);
                return;
            }
        }
        iterator.add(yeni);
    }
    public static void main(String[] args) {
        
        LinkedList<String> yerler = new LinkedList<String>();
        
        siraliEkle(yerler, "Market");
        siraliEkle(yerler, "Ev");
        siraliEkle(yerler, "Postane");
        
        /*yerler.add("Cafe");
        yerler.add("Market");
        yerler.add("Okul");
        yerler.add("GYM");
        yerler.add("Ev");
        
        
        listeyiBastir(yerler);
        System.out.println("-------------------------------");
        
       // yerler.add(4, "Pazar"); //Ekleme (İndex 'e)
       // yerler.remove(3); // Silme
       */
        listeyiBastir(yerler);
    }
}
