import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FriendshipsAssertJTest {

    @Test
    public void makingALotFriendshipsTest() {
        Friendships friendships = new Friendships();
        friendships.makeFriends("Wanda", "Emyn");
        friendships.makeFriends("Wanda", "Michał");
        friendships.makeFriends("Wanda", "Adam");
        assertThat(friendships.getFriendsList("Wanda")).hasSize(3).containsExactlyInAnyOrder("Emyn", "Michał", "Adam");
    }

    @Test
    public void checkIfFriendshipsAreMissingTest() {
        Friendships friendships = new Friendships();
        friendships.makeFriends("Wanda", "Kasia");
        friendships.makeFriends("Wanda", "Gosia");
        friendships.makeFriends("Wanda", "Ela");
        friendships.makeFriends("Wanda", "Ula");
        friendships.makeFriends("Wanda", "Magda");
        assertThat(friendships.getFriendsList("Wanda")).hasSize(5)
                .containsExactlyInAnyOrder("Kasia", "Gosia", "Ela", "Ula","Magda");
    }

    @Test
    public void ifNoFriendsTest() {
        Friendships friendships = new Friendships();
        assertThat(friendships.getFriendsList("Wanda")).isNull();
    }

    @Test
    public void checkIfPeopleAreFriendsTest() {
        Friendships friendships = new Friendships();
        friendships.makeFriends("Wanda", "Ela");
        friendships.makeFriends("Wanda", "Ula");
        friendships.makeFriends("Wanda", "Ola");
        assertThat(friendships.areFriends("Wanda","Ula")).isTrue();
    }

    @Test
    public void checkIfPeopleAreNotFriendsTest() {
        Friendships friendships = new Friendships();
        assertThat(friendships.areFriends("Wanda","Ula")).isFalse();
    }

    @Test
    public void friendshipListContainsTest() {
        Friendships friendships = new Friendships();

        friendships.makeFriends("Wanda", "Ela");
        friendships.makeFriends("Wanda", "Ula");
        friendships.makeFriends("Wanda", "Ola");
        assertThat(friendships.getFriendsList("Wanda")).contains("Ula");
    }
}