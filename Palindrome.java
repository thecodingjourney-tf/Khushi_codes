class Palindrome{
     void check() {
      int n = 121;
      int temp = n;
      int rev = 0;
     while (n>0){
      int r = n%10;
      rev = rev*10+r;
      n = n/10;
}
    if(temp == rev)
      System.out.println("Palindrome");
    else
      System.out.println("Not Palindrome");
}
   public static void main(String[]args){
   Palindrome obj = new Palindrome();
   obj.check();
}
}