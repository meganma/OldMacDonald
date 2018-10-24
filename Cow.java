class cow implements Animal {     
     private String myType;     
     private String mySound;      
  
     public cow(String type, String sound)     {         
         myType = type;         
         mySound = sound; 

     }     
     public cow()     {         
         myType = "unknown";         
         mySound = "unknown";   
    
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
  
}
