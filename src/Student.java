import java.util.ArrayList;
import java.util.List;

public class Student {
    private String ID;
    private String name;
    private List<Integer> marks;

    public Student(String ID, String name) {
        this.ID = ID;
        this.name = name;
        this.marks = new ArrayList<>();
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getmarks() {
        return marks;
    }

    public void addGrade(int grade) {
        marks.add(grade);
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", Ім'я: " + name + ", оцінки: " + marks;
    }
}
