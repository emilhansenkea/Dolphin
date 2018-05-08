import java.util.*;

public class Member{

   private String name;
   private int age;
   private String activity;
   private String ageGroup;
   private String swimType;
   private String subscribtion;
   
   //Her konstruerer vi objektet - en contructor
   public Member(String name, int age, String activity, String ageGroup, String swipType, String subscribtion){
      this.name = name;
      this.age = age;
      this.activity = activity;
      this.ageGroup = ageGroup;
      this.swimType = swimType;
      this.subscribtion = subscribtion;
   }
   
   public Member(){}
   
   //Her laver vi getters and setters
   public void setName (String name){
      this.name = name;
      
   }
   public String getName(){
      return name;
   }

   public void setAge (int age){
      this.age = age;
      
   }
   public int getAge(){
      return age;
   }
   public void setActivity (String activity){
      this.activity = activity;
      
   }
   public String getActivity(){
      return activity;
   }
   public void setAgeGroup (String ageGroup){
      this.ageGroup = ageGroup;
      
   }
   public String getAgeGroup(){
      return ageGroup;
   }
    public void setSwimType (String swimType){
      this.swimType = swimType;
      
   }
   public String getSwimType(){
      return swimType;
   }
   public void setSubscribtione (String subscribtion){
      this.subscribtion = subscribtion;
      
   }
   public String getSubscribtion(){
      return subscribtion;
   }
   

}