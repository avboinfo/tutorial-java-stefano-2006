package Mail;

import java.util.ArrayList;
import java.util.List;

public class Mailbox {
    private List<Email> emails;

    public Mailbox() {
        this.emails = new ArrayList<>();
    }

    public void addEmail(Email email) {
        emails.add(0, email); 
    }

    public void removeEmail(int position) {
        if (position >= 0 && position < emails.size()) {
            emails.remove(position);
        } else {
            throw new IllegalArgumentException("Posizione non valida");
        }
    }

    public List<Email> searchEmailsBySubject(String subject) {
        List<Email> matchingEmails = new ArrayList<>();
        for (Email email : emails) {
            if (email.getSubject().contains(subject)) {
                matchingEmails.add(email);
            }
        }
        return matchingEmails;
    }
}
