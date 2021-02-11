class Rotation{
    
    /*  Function to check if two strings are rotated
    *   s1, s2: input strings
    */ 
    public static boolean isRotated(String s1, String s2){
        boolean flag = false;
        String clock = "";
        String antiClock = "";
       
        int l = s2.length();
        
        if(s2.length()!=s1.length())
        {
            return false;
        }
        
        if(s1.length()==1)
        {
            if(s1.equals(s2)){ return true;}
            else{
            return false; }
           
        }
        
         antiClock = antiClock + s2.substring(l-2,l) + s2.substring(0,l-2);
         clock = clock + s2.substring(2,l) + s2.substring(0,2);
        
       if(s1.equals(antiClock)||s1.equals(clock))
       {
           flag = true;
       }
      
        
        return flag;
    }
    
}
