import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> totalBuddy;

    public AddressBook() {
        totalBuddy = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        totalBuddy.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        totalBuddy.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}


