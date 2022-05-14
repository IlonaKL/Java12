import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class CanFly{
    public static void main(String[] args){
        ArrayList<String> words=new ArrayList<>(Arrays.asList("hi", "yo", "sup", "yolo", "boop"));
        Iterator<String> iterator=words.iterator();
        do{
            iterator.next();
            iterator.remove();
            System.out.println(iterator.next());
        } while(iterator.hasNext());
    }
}