import java.util.*;

public class Dolphin{

   public static void main (String[] args){
   
   ArrayList<Member> memberShip = new ArrayList<Member>();
   
   
    Scanner scanner = new Scanner(System.in);
   
      System.out.println("Welcome to Dolphin swimclub\n");
   
      boolean loop1running = true;
      while (loop1running){
      try{
      System.out.println("\tMENU");
      System.out.println("0. Exit");
      System.out.println("1. Register member");
      System.out.println("2. Members");
      System.out.println("3. Member subscribtion");
      
      Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();
         
            switch(option){
               case 0 :
                  System.out.println("Exiting");
                  loop1running = false;
                  break;
               case 1 :
                  System.out.println("Full name: ");
                  Scanner scan1 = new Scanner(System.in);
                  String scanName = scan1.nextLine();
                  Member member1 = new Member();
                  member1.setName(scanName);
                  System.out.println("Age");
                  Scanner scan2 = new Scanner(System.in);
                  int scanAge = scan2.nextInt();
                  member1.setAge(scanAge);
                  if(scanAge <= 18){
                  member1.setAgeGroup("Junior");
                  }else{
                  member1.setAgeGroup("Senior");
                  }
                  System.out.println("Type 1 for passive or 2 for active");
                  boolean loop2running = true;
                  while (loop2running){
                  int scanActivity = scan2.nextInt();
                  if(scanActivity == 1){
                  member1.setActivity("Passive");
                  loop2running = false;
                  }else if(scanActivity ==2){
                  member1.setActivity("Active");
                  loop2running = false;
                  }else{
                  System.out.println("Invalid input. Type 1 for passive or 2 for active");
                  }
                  }
                  System.out.println("Type 1 for exerciser or 2 for competitive");
                  boolean loop3running = true;
                  while (loop3running){
                  int scanSwimType = scan2.nextInt();
                  if(scanSwimType == 1){
                  member1.setSwimType("Exerciser");
                  loop3running = false;
                  }else if(scanSwimType ==2){
                  member1.setSwimType("Competitive");
                  loop3running = false;
                  }else{
                  System.out.println("Invalid input. Type 1 for exerciser or 2 for competitive");
                  }
                  }
                  
                  memberShip.add(member1);
                  System.out.println("Member is now created with the name " + member1.getName() + ". Your subscribtion is " + member1.getSubscribtion());
                  break;
               case 2 :
                   System.out.println("List of members:\n");
                   for (Member ms : memberShip){
                     System.out.println("Name: " + ms.getName() + ", Age: " + ms.getAge() + ", Activity: " + ms.getActivity() + ", SwimType: " + ms.getSwimType());
                   
                   }

                  break;
               case 3 :
                  for (Member ns : memberShip){
                     System.out.println("Name: " + ns.getName() + ", Subscribtion: " + ns.getSubscribtion());
                  }
                  break;
                  
               

     
     
     
     
     
     
     
     
      }
      }
      catch (Exception e){
      System.out.println("You got an error");
      }
      
      
      }  
   
   }

}
