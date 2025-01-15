public class ShowStudent {
    public static void main(String[] args) {
        // Instantiate a new Student object
        Student student = new Student();

        // Set values using set methods
        student.setIdNumber(234);
        student.setCreditHours(15);
        student.setPoints(47);

        // Display the values using the displayStudentInfo method
        student.displayStudentInfo();
    }
}
