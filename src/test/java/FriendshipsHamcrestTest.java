
import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FriendshipsHamcrestTest {

    @Test
    public void friendshipListSizeTest() {

        Friendships friendships = new Friendships();
        friendships.makeFriends("Wanda", "Kasia");
        friendships.makeFriends("Wanda", "Gosia");
        friendships.makeFriends("Wanda", "Ela");
        friendships.makeFriends("Wanda", "Ula");
        friendships.makeFriends("Wanda", "Magda");

        assertThat(friendships.getFriendsList("Wanda"), hasSize(5));
    }

    @Test
    public void friendsListContainsTest() {
        Friendships friendships = new Friendships();

        friendships.makeFriends("Wanda", "Kasia");
        friendships.makeFriends("Wanda", "Gosia");

        assertThat(friendships.getFriendsList("Wanda"), contains("Kasia", "Gosia"));
    }

    @Test
    public void ifNoFriendsTest() {
        Friendships friendships = new Friendships();
        assertThat(friendships.getFriendsList("Wanda"), equalToObject(null));
    }

    @Test
    public void friendsListAnyOrderTest() {
        Friendships friendships = new Friendships();
        friendships.makeFriends("Wanda", "Kasia");
        friendships.makeFriends("Wanda", "Gosia");
        friendships.makeFriends("Wanda", "Ela");
        friendships.makeFriends("Wanda", "Ula");
        friendships.makeFriends("Wanda", "Magda");
        assertThat(friendships.getFriendsList("Wanda"),
                containsInAnyOrder("Kasia", "Gosia", "Ela", "Ula", "Magda"));
    }

    @Test
    public void friendshipListSizeMatcherTest() {
        Friendships friendships = new Friendships();

        friendships.makeFriends("Wanda", "Kasia");
        assertThat(friendships.getFriendsList("Wanda").size() == 1, equalTo(true));
    }

}