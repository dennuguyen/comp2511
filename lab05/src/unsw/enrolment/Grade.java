package unsw.enrolment;

import java.util.ArrayList;
import unsw.log.Log;
import unsw.log.Publisher;
import unsw.log.Subscriber;

public class Grade implements GradeComponent, Publisher {

    private int mark;
    private String assessment;
    private ArrayList<Subscriber> subscribers;

    public Grade(String assessment) {
        this(assessment, null);
    }

    public Grade(String assessment, Log log) {
        this.mark = 0;
        this.assessment = assessment;
        this.subscribers = new ArrayList<Subscriber>();
        if (log != null)
            this.addSubscriber(log);
    }

    @Override
    public boolean isPassing() {
        return this.mark >= 50;
    }

    @Override
    public String getAssessment() {
        return this.assessment;
    }


    @Override
    public int getMark() {
        return this.mark;
    }

    @Override
    public void setMark(int mark) {
        this.mark = mark;
        this.publish();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void publish() {
        for (Subscriber subscriber : this.subscribers)
            subscriber.subscribe(this);
    }
}
