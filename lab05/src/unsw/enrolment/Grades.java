package unsw.enrolment;

import java.util.ArrayList;
import unsw.log.Log;
import unsw.log.Publisher;
import unsw.log.Subscriber;

public class Grades implements GradeComponent, Publisher {

    private boolean isAverage; // true for average mark, false for sum mark
    private int mark;
    private ArrayList<GradeComponent> submarks;
    private String assessment;
    private ArrayList<Subscriber> subscribers;

    public Grades(String assessment, boolean isAverage) {
        this(assessment, isAverage, null);
    }

    public Grades(String assessment, boolean isAverage, Log log) {
        this.isAverage = isAverage;
        this.mark = 0;
        this.submarks = new ArrayList<GradeComponent>();
        this.assessment = assessment;
        this.subscribers = new ArrayList<Subscriber>();
        if (log != null)
            this.addSubscriber(log);
    }

    public void add(GradeComponent submark) {
        this.submarks.add(submark);
    }

    public void remove(GradeComponent submark) {
        this.submarks.remove(submark);
    }

    public void updateMark() {
        this.mark = 0;
        for (GradeComponent submark : submarks)
            this.mark += submark.getMark();
        if (isAverage)
            this.mark /= submarks.size();
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
        if (!this.subscribers.contains(subscriber))
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
