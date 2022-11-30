import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Friendships {
    Map<String, List<String>> friendships = new HashMap<>();

    //Dodanie przyjaciół - wykorzystuje funkcje addFriend!
    public void makeFriends(String person1, String person2) {
        addFriend(person1, person2);
        addFriend(person2, person1);
    }

    //Pobranie listy przyjaciol
    public List<String> getFriendsList(String person) {
        return friendships.get(person);
    }

    //Sprawdzenie czy przyjaciele
    public boolean areFriends(String person1, String person2) {
        return getFriendsList(person1).contains(person2);
    }

    //Dodanie do listy przyjaciol do danej osoby
    private void addFriend(String person, String friend) {
            List<String> newList = getFriendsList(person);

        System.out.println(newList);
        if(newList == null) {
            newList = new ArrayList<String>();

            newList.add(friend);
            friendships.put(person, newList);

        } else {
            if (!areFriends(person, friend)) {
                newList.add(friend);
                friendships.put(person, newList);
            }
        }
    }

    public static void main(String[] args) {
            System.out.println("Hello world!");

            Friendships fr = new Friendships();

            //fr.addFriend("Wanda", "Emyn");

            fr.makeFriends("Wanda", "Emyn");

            fr.makeFriends("Wanda", "Emyn");

        //System.out.println(fr.getFriendsList("Wanda"));
        for(String friend : fr.getFriendsList("Wanda")){
            System.out.println(friend);
        }

        //System.out.println(fr.getFriendsList("Emyn").toString());
        for(String friend : fr.getFriendsList("Emyn")){
            System.out.println(friend);
        }


        System.out.println(fr.friendships);

        System.out.println("Hello world!");

        System.out.println("Hello world!");




    }

}