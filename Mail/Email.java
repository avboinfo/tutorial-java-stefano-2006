package Mail;

public class Email {
    private String sender;
    private String subject;
    private String dateTime; 
    private String text;

    public Email(String sender, String subject, String dateTime, String text) {
        this.sender = sender;
        this.subject = subject;
        this.dateTime = dateTime;
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public String getSubject() {
        return subject;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getText() {
        return text;
    }
}