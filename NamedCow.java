class NamedCow extends cow{
  private String myName;
  private String mySound;
  private String myType;
  public NamedCow(String type, String name, String sound ){
    
    myName=name;
    mySound=sound;
    myType=type;
  }
    
    public String getName(){return myName;}
    
}
