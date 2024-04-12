package Mail;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mailbox mailbox = new Mailbox();

        Email email1 = new Email("mittente1@example.com", "Oggetto 1", "2024-04-12 10:00:00", "Testo dell'email 1");
        Email email2 = new Email("mittente2@example.com", "Oggetto 2", "2024-04-12 11:00:00", "Testo dell'email 2");
        Email email3 = new Email("mittente3@example.com", "Oggetto 3", "2024-04-12 12:00:00", "Testo dell'email 3");

        mailbox.addEmail(email1);
        mailbox.addEmail(email2);
        mailbox.addEmail(email3);

        System.out.println("Email presenti nella casella di posta:");
        printEmails(mailbox);

        String searchText = "Oggetto";
        List<Email> matchingEmails = mailbox.searchEmailsBySubject(searchText);
        System.out.println("\nEmail con oggetto che contiene \"" + searchText + "\":");
        printEmails(matchingEmails);

        int emailToRemove = 1; 
        mailbox.removeEmail(emailToRemove);

        System.out.println("\nEmail presenti dopo la rimozione:");
        printEmails(mailbox);
    }

    private static void printEmails(Mailbox mailbox) {
        List<Email> emails = mailbox.getEmails();
        for (int i = 0; i < emails.size(); i++) {
            Email email = emails.get(i);
            System.out.println("Email " + (i + 1) + ":");
            System.out.println("Mittente: " + email.getSender());
            System.out.println("Oggetto: " + email.getSubject());
            System.out.println("Data e ora: " + email.getDateTime());
            System.out.println("Testo: " + email.getText());
            System.out.println();
        }
    }

    private static void printEmails(List<Email> emails) {
        for (int i = 0; i < emails.size(); i++) {
            Email email = emails.get(i);
            System.out.println("Email " + (i + 1) + ":");
            System.out.println("Mittente: " + email.getSender());
            System.out.println("Oggetto: " + email.getSubject());
            System.out.println("Data e ora: " + email.getDateTime());
            System.out.println("Testo: " + email.getText());
            System.out.println();
        }
    }
}
