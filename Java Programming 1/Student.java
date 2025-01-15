public class Student {
    private int idNumber;
    private int creditHours;
    private int points;
    
    
    public Student() {
    }

    // Constructor to initialize with default values
    public Student(int idNumber, int creditHours, int points) {
        this.idNumber = idNumber;
        this.creditHours = creditHours;
        this.points = points;
    }
    
    
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public void setPoints(int points) {
        this.points = points;
    }

   
    public int getIdNumber() {
        return idNumber;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public int getPoints() {
        return points;
    }

    // Method to calculate GPA
    public double getGPA() {
        if (creditHours == 0) {
            return 0.0;
        }
        return (double) points / creditHours;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("ID Number: " + idNumber);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Points: " + points);
        System.out.println("GPA: " + getGPA());
    }
}
