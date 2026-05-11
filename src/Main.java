class Contact {
    String name;
    String phoneNumber;

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

class ContactsManager {
    // Attributs
    Contact[] myFriends;
    int friendsCount;

    // Constructeur
    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    // Ajouter un contact
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    // Rechercher un contact
    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();

        myContactsManager.addContact(new Contact("Alice", "0701020304"));
        myContactsManager.addContact(new Contact("Bob",   "0702030405"));
        myContactsManager.addContact(new Contact("Charlie", "0703040506"));
        myContactsManager.addContact(new Contact("Diana", "0704050607"));
        myContactsManager.addContact(new Contact("Eve",   "0705060708"));

        Contact found = myContactsManager.searchContact("Charlie");
        if (found != null) {
            System.out.println("Contact trouvé : " + found.name);
            System.out.println("Numéro : " + found.phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}