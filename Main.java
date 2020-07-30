import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        System.out.println("How many profile you want to make:");
        Scanner input = new Scanner(System.in);
        int numberOfProfiles = input.nextInt();
        studentProfile[] students = new studentProfile[numberOfProfiles];
        for(int i=0; i<numberOfProfiles; i++){
            Scanner fNameInput, lNameInput, GPAInput, gradYearInput, majorInput;

            System.out.println("Please Enter the First Name of Student"+(i+1));
            fNameInput = new Scanner(System.in);
            String fName = fNameInput.nextLine();

            System.out.println("Please Enter the Last Name of "+fName);
            lNameInput = new Scanner(System.in);
            String lName = lNameInput.nextLine();

            System.out.println("Please Enter the GPA of "+fName);
            GPAInput = new Scanner(System.in);
            double GPA = GPAInput.nextDouble();

            System.out.println("Please Enter the Year of Graduation of "+fName);
            gradYearInput = new Scanner(System.in);
            int gradYear = gradYearInput.nextInt();

            System.out.println("Please Enter the Major of Graduation Name of "+fName);
            majorInput = new Scanner(System.in);
            String major = majorInput.nextLine();

            System.out.println("Thanks for Entering Details of student"+(i+1));

            students[i] = new studentProfile(fName, lName, gradYear, GPA, major);

        }


        while(true){
            System.out.println("Do you want to see details of all students?(Y/N)");
            Scanner optInput = new Scanner(System.in);
            String opt = optInput.next();
            if (opt.toLowerCase().equals("y")) {
                for (int i = 0; i < students.length; i++) {
                    System.out.println("Student"+(i+1)+"\nName : "+students[i].name() + "\n" +"Year Of Graduation : "+ students[i].gradYear + "\n" +"Total GPA : "+ students[i].GPA + "\n" +"Major in : "+ students[i].major+"\n\n\n");
                    break;
                }
            }
            else if (opt.toLowerCase().equals("n")) {
                System.out.println("Ok...\n");
                System.out.println("Do you want to see profile of a particular Student by First Name?(Y/N)");
                optInput = new Scanner(System.in);
                opt = optInput.next();
                if (opt.toLowerCase().equals("y")) {
                    System.out.println("Enter the firstname of the student:");
                    Scanner nameInput = new Scanner(System.in);
                    String name = nameInput.nextLine();
                    for(int i=0; i<students.length; i++){
                        if(students[i].firstName.equals(name)){
                            System.out.println("Full Name : "+students[i].name() + "\n" +"Year Of Graduation : "+ students[i].gradYear + "\n" +"Total GPA : "+ students[i].GPA + "\n" +"Major in : "+ students[i].major+"\n\n\n");
                            break;
                        }
                    }
                    break;
                }
                else if(opt.toLowerCase().equals("n")) {
                    System.out.println("Ok...\n");
                    break;
                }
                else {
                    System.out.println("You Entered Invalid Entry! Please Try Again:(");
                }
            }
            else {
                System.out.println("You Entered Invalid Entry! Please Try Again:(");
            }
        }


        System.out.println("Is any student Failed?(Y/N)");
        Scanner optInput = new Scanner(System.in);
        String opt = optInput.nextLine();
        if(opt.toLowerCase().equals("y")){
            System.out.println("Enter the firstname of the student:");
            Scanner nameInput = new Scanner(System.in);
            String name = nameInput.nextLine();
            for(int i=0; i<students.length; i++){
                if(students[i].firstName.equals(name)){
                    students[i].fail();
                    System.out.println("Full Name : "+students[i].name() + "\n" +"Year Of Graduation : "
                            + students[i].gradYear + "\n" +"Total GPA : "+ students[i].GPA + "\n"
                            +"Major in : "+ students[i].major+"\n\n\n");
                    break;
                }
            }
        }
    }
}