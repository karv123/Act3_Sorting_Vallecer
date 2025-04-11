import java.util.Scanner;

class Student {
    private String name;
    private double grade;

    
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return name + " - " + grade;
    }

    public double getGrade() {
        return grade;
    }
}

public class StudentSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("How many students? ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 

        Student[] students = new Student[numStudents];

       
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student #" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Grade: ");
            double grade = scanner.nextDouble();
            scanner.nextLine(); 
            students[i] = new Student(name, grade);
        }

      
        bubbleSort(students);

       
        System.out.println("Sorted Students by Grade (Ascending):");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }

  
    public static void bubbleSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getGrade() > students[j + 1].getGrade()) {
             
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}