import java.io.*;
import java.util.*;
 class filedemo3 
 {
   
   public static void main(String[] args) 
   {  
      String exitchar;
      File f = null;
      Scanner sc = new Scanner(System.in);
      try 
      {
        f = new File("C:\\Users\\arnobero\\Documents\\GitHub\\JavaProgramming\\Filehandling\\files\\file1.txt");
        FileWriter fout = new FileWriter(f);
        BufferedWriter bout= new BufferedWriter(fout);
 	      System.out.print("\nEnter the content");
        System.out.print("\nEnter M to finish writing content");
        while(sc.hasNext())
        {
          bout.write(sc.nextLine());
          bout.newLine();
          char ch = sc.next().charAt(0);
          if (ch == 'M')
            break;
        }
        bout.close();

        
		  }
		  catch (Exception e) 
      {
        // if any I/O error occurs
        e.printStackTrace();
      }
        
  } 

}



