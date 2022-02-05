package unsw.log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import unsw.enrolment.Grade;
import unsw.enrolment.Grades;

public class Log implements Subscriber {

    private FileWriter outputFile;
    private PrintWriter print;

    public Log(String fileName) {
        try {
            this.outputFile = new FileWriter(fileName);
            this.print = new PrintWriter(outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void subscribe(Publisher publisher) {
        if (publisher instanceof Grade)
            subscribe((Grade) publisher);
        else if (publisher instanceof Grades)
            subscribe((Grades) publisher);
    }

    public void subscribe(Grade grade) {

        print.println(LocalDateTime.now() + "\t" + grade.getAssessment() + "\t" + grade.getMark());
        print.flush();
    }

    public void subscribe(Grades grades) {
        print.println(
                LocalDateTime.now() + "\t" + grades.getAssessment() + "\t" + grades.getMark());
        print.flush();
    }
}
