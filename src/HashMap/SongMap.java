package HashMap;

import java.util.HashMap;

public class SongMap {
    public static void main(String[] args){
        HashMap map = new HashMap();
        map.put("satisfaction", "the rolling keys");
        map.put("Money", "Pink Floyd");
        map.put("The End", "The Doors");
        map.put("Deuce", "Kiss");
        map.put("Jump", "Van Halen");
        map.put("yesterday", "Ray Charles");

            // replace ahashmap value with existing mapping
        map.put("L-O-V-e","Alvin and the Chipmunks");
        map.put("L-O-V-e","Nat King Cole");
        String artist = (String)map.get("L-O-V-E");
        System.out.println(artist);

    String replaceArtist = (String)map.replace("yesterday","Beatles");
        System.out.println(replaceArtist);

        int size = map.size();
        System.out.println(size);

        boolean isKey = map.containsKey("Jump");
        System.out.println(isKey);
        isKey = map.containsKey("L-O-V-E");
        System.out.println(isKey);

//        map.clear();

        boolean isEmpty = map.isEmpty();
        System.out.println(isEmpty);



    }
}
