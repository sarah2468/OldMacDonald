
class Chick implements Animal 
{     
     private String myType;
     private String mySound;
     private String mySecondSound;
     private Double prob = Math.random();
     public Chick(String type, String sound, String secondSound)
     {
       myType = type;
       mySound = sound;
       mySecondSound = secondSound;
     }
     public Chick()
     {
       myType = "unkown";
       mySound = "unknown";
       mySecondSound = "unknown";
     }
     public String getSound()
     {
       if(prob < 0.5){
       return mySound;
       }else{
         return mySecondSound;
       }
     }
     public String getType()
     {
       return myType;
     }
     
}