
class RevString{
   public static void main(String[] args){
     int l;
     String a = "Hey Coders";
     String b = " ";
     l=a.length();
    for(int i=l-1; i>=0 ;i--){
          b=b+a.charAt(i);
        }
     System.out.print(b);
     
   }
 }
     