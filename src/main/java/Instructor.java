import io.zipcoder.interfaces.Person;

public class Instructor extends Person implements Teacher {

    public Instructor(Long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numOfHoursPerLearner = numberOfHours/learners.length;
        for (Learner l : learners) {
            l.learn(numOfHoursPerLearner);
        }
    }
}
