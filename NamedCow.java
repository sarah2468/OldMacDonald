public class NamedCow extends Cow
{ //insert constructors
  private String myName;
  private String myType;
  private String mySound;
  public NamedCow(String name, String type, String sound){
    myName = name;
    myType = type;
    mySound = sound;
  }
  public NamedCow()
     {
       myName = "unkown";
       myType = "unknown";
       mySound = "unknown";
     }
     public String getName()
     {
       return myName;
     }
     public String getSound()
     {
       return mySound;
     }
     public String getType()
     {
       return myType;
     }
    
}