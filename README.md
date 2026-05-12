# Gestionnaire de Contacts en Java

## Description
Ce projet implémente un gestionnaire de contacts en Java. Il permet d'ajouter des contacts et de les rechercher par nom, en utilisant un tableau statique de 500 éléments.

---

## Structure du projet

src/
└── Main.java

Toutes les classes sont regroupées dans un seul fichier Main.java.

---

## Classes

### Contact
Représente un contact avec les attributs suivants :

| Attribut      | Type     | Description          |
|---------------|----------|----------------------|
| name          | String   | Nom du contact       |
| phoneNumber   | String   | Numéro de téléphone  |

Constructeur :
Contact(String name, String phoneNumber)

---

### ContactsManager
Gère l'ajout et la recherche de contacts.

| Attribut      | Type       | Description                  |
|---------------|------------|------------------------------|
| myFriends     | Contact[]  | Tableau de 500 contacts      |
| friendsCount  | int        | Nombre de contacts ajoutés   |

Constructeur :
ContactsManager()
Initialise friendsCount à 0 et crée un tableau de 500 éléments.

Méthodes :

| Méthode                            | Description                                          |
|------------------------------------|------------------------------------------------------|
| addContact(Contact contact)        | Ajoute un contact au tableau                         |
| searchContact(String searchName)   | Recherche un contact par nom, retourne null si non trouvé |

---

### Main
Classe principale contenant la méthode main.

---

## Exemple d'utilisation

ContactsManager myContactsManager = new ContactsManager();

myContactsManager.addContact(new Contact("Alice", "0701020304"));
myContactsManager.addContact(new Contact("Charlie", "0703040506"));

Contact found = myContactsManager.searchContact("Charlie");
if (found != null) {
System.out.println("Contact trouvé : " + found.name);
System.out.println("Numéro : " + found.phoneNumber);
}

Résultat :
Contact trouvé : Charlie
Numéro : 0703040506

---

## Limitations
- Le tableau myFriends est limité à 500 contacts maximum.
- La recherche est sensible à la casse (utilise .equals() et non .equalsIgnoreCase()).

---

## Prérequis
- Java 8 ou supérieur
- IntelliJ IDEA (recommandé)