import java.util.HashMap;
import java.util.Map;

public class GradeBook {
    // Використовуємо HashMap для зберігання студентів за їх ID
    private Map<String, Student> students;

    public GradeBook() {
        students = new HashMap<>();
    }

    // Метод для додавання студента
    public void addStudent(Student student) {
        students.put(student.getID(), student);
        System.out.println("Студента " + student.getName() + " додано.");
    }

    // Метод для видалення студента за ID
    public void removeStudent(String ID) {
        Student removed = students.remove(ID);
        if (removed != null) {
            System.out.println("Студента " + removed.getName() + " видалено.");
        } else {
            System.out.println("Студента за ID " + ID + " не знайдено.");
        }
    }

    // Метод для пошуку студента за ID
    public Student findStudent(String ID) {
        return students.get(ID);
    }

    // Метод для виведення всіх студентів та їх оцінок
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Немає студентів в журналі.");
        } else {
            for (Student student : students.values()) {
                System.out.println(student);
            }
        }
    }
}
