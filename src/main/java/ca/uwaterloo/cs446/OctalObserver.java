package ca.uwaterloo.cs446;

public class OctalObserver extends Observer {
    private String octValue = "";
    private Subject subject;

    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        octValue = Integer.toOctalString(subject.getState());
    }

    @Override
    public String getValue() {
        return octValue;
    }

}
