//A program to determine the time taken to write a specific string on a single row keyboard
public class CodingChall {
    public static void main(String[] args) {
      String S1="abcdefghijklmnopqrstuvwxyz";
      String S2="cba";

      Solution s =new Solution();
      int z=s.solution(S1,S2);
        System.out.println(z);
    }

}
class Solution{
       public int solution(String s1, String s2){
           int currentIndex=0,initialIndex=0;
           int time=0,totalTime=0;
           char s;

           for(int i=0;i<s2.length();i++){

               s=s2.charAt(i);//Gets the char at the index i
               currentIndex=s1.indexOf(s);//Finds the index of s in the string s1
               time=Math.abs(currentIndex-initialIndex);//Calculates the time taken in absolute value
               initialIndex=currentIndex;//Sets the initialIndex to currentIndex because that's where the finger is at the moment
               totalTime+=time;
           }


return totalTime;
       }
}