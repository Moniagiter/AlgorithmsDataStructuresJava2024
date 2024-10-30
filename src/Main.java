public class Main {
    public static void main(String[] args) {
        // Створюємо GradeBook для керування студентами
        GradeBook gradeBook = new GradeBook();

        // Створюємо кілька студентів
        Student student1 = new Student("S001", "Dean Winchester");
        student1.addGrade(90);
        student1.addGrade(85);

        Student student2 = new Student("S002", "Sam Winchester");
        student2.addGrade(88);
        student2.addGrade(92);

        Student student3 = new Student("S003", "Jensen Ackles");
        student3.addGrade(75);
        student3.addGrade(80);

        // Додаємо студентів у GradeBook
        gradeBook.addStudent(student1);
        gradeBook.addStudent(student2);
        gradeBook.addStudent(student3);

        // Виводимо всіх студентів та їх оцінки
        System.out.println("\nВсі студенти з журналу:");
        gradeBook.displayAllStudents();

        // Пошук студента за ID
        System.out.println("\nПошук студента з ID S002:");
        Student foundStudent = gradeBook.findStudent("S002");
        if (foundStudent != null) {
            System.out.println("Знайдено: " + foundStudent);
        } else {
            System.out.println("Студента не знайдено.");
        }

        // Видалення студента за ID
        System.out.println("\nВидалено студента за ID S003:");
        gradeBook.removeStudent("S003");

        // Виводимо оновлений список студентів
        System.out.println("\nВсі студенти після видалення:");
        gradeBook.displayAllStudents();
    }
}

