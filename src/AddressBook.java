import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> totalBuddy;

    public AddressBook() {
        this.totalBuddy = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        totalBuddy.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        totalBuddy.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        System.out.println("Hello");
    }
}


