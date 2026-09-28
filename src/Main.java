import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("===============================================");
        System.out.println("   TuitionTrack-Tuition Management System");
        System.out.println("===============================================");
        System.out.println("1. Add Student");
        System.out.println("2. View all Students");
        System.out.println("Exit");
        System.out.println("=============================================");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Student Class/Grade:");
                String _class = sc.nextLine();
                System.out.print("Enter Student School:");
                String school = sc.nextLine();
                System.out.print("Enter Guardian Name:");
                String guardianName = sc.nextLine();
                System.out.print("Enter Phone Number:");
                String phoneNumber = sc.nextLine();
                System.out.print("Enter Email Address:");
                String emailAddress = sc.nextLine();
                System.out.print("Enter monthly tuition fee: ");
                double monthlyTuitionFee = sc.nextDouble();

                Student student= new Student(
                        name,_class,school,guardianName,phoneNumber,emailAddress,monthlyTuitionFee
                );

                students.add(student);
                break;
            case 2:
                if(students.isEmpty()){
                    System.out.println("There are no students in the system");
                }else{
                    System.out.println("\n------ STUDENT LIST ------");

                }
                for(Student s:students){
                    System.out.println("Student Name:"+s.name);
                    System.out.println("Student Class/Grade:"+s._class);
                    System.out.println("Student School:"+s.school);
                    System.out.println("Student Guardian Name:"+s.guardianName);
                    System.out.println("Contact Number"+s.phone);
                    System.out.println(("Email Address"+s.email));
                    System.out.println("Tuition Fees per month: "+s.payment);
                }
                case 3:
                System.out.println("Thank you for using the system.");
                break;
            default:
                System.out.println("Invalid choice.Please try again");
        }

        }

  
        }
}
