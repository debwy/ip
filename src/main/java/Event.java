public class Event extends Task {

    private String at;

    public Event(String name, boolean isDone, String at) throws DukeException {
        super(name, isDone);
        if (at.equals("") || at.equals(" ")) {
            throw new DukeException("time can't be empty");
        }
        this.at = at;
    }

    @Override
    public String toString() {
        String temp;
        if (super.isDone) {
            temp = "[X] " + super.name;
        } else {
            temp = "[ ] " + name;
        }
        return "[E]" + temp + " (at: " + at + ")";
    }


}
