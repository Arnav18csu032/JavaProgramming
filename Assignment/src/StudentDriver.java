import java.util.*;

class StudentDriver
{
	public static void main(String[] args) 
	{
		String firstname;
		String lastname;
		Address addr;
		Date dob;
		String [] skills;
		Qualification [] qual;
		Project [] projects;
		String email;
		String contactNo;
		String line1;
		String line2;
		String city;
		String state;
		int pinCode;
		String qualName;
		String university;
		String institute;
		float cgpa;
		String name;
		Date startDate;
		Date endDate;
		String role;
		String [] responsibilities;

		Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the details of student");
		
		System.out.println("First Name : ");
 		String firstName = in.nextLine();
            
        System.out.println("Last Name :");
        String lastName = in.nextLine();

		System.out.println("Adress line1 :");
        String line1 = in.nextLine();
           
		System.out.println("Adress line2 :");
        String line2 = in.nextLine();

		System.out.println("Adress city :");
        String city = in.nextLine();

		System.out.println("Adress state :");
        String state = in.nextLine();

		System.out.println("pinCode : ");
        int pinCode = in.nextInt();

		System.out.println("Qualification - Qualification name :");
        String qualName = in.nextLine();

        System.out.println("Qualification - university :");
        String university = in.nextLine();

        System.out.println("Qualification - institute :");
        String institute = in.nextLine();

        System.out.println("Qualification - cgpa :");
        float cgpa = in.nextFloat();

        
        
	}
}