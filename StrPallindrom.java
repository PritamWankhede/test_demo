
class StrPallindrom{
 public static void main(String[] args){
   String str = "Pritam";
   int start=0;
   int end = str.length()-1;
   boolean isPalindrome = true;
   
   while(start < end){
    if(str.charAt(start)! = str.charAt(end)){
      isPalindrome = false;
        break;
     }
   start++;
    end--; 
   }
 if(isPalindrome){
  System.out.Println("Pallindrome");
    } else{
            System.out.print("Not a Pllindrome");
  }
}