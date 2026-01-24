package org.nitisha.CreationalPatterns.PrototypePattern;

interface EmailTemplate {
    void setContent(String content);
    void send(String to);
}

class WelcomeEmail implements EmailTemplate {
    private String subject;
    private String content;

    public WelcomeEmail() {
        this.subject = "Welcome to TUF+!";
        this.content = "Hi there! Thanks for joining us";
    }

    @Override
    public void setContent(String content) {
        this.content = content;

    }

    @Override
    public void send(String to) {
        System.out.println("Sending to " + to + ": [" + subject + "]" + content );

    }
}

public class PrototypePatternTUF {
}
