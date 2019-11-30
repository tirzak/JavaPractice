import java.util.LinkedList;

//Task is to find the smallest level number X such that sum of all the nodes at level X is maximal in a binary tree
public class CodingChallenge2 {
    public static void main(String[] args) {
       Soln a =new Soln();
       int[] k={-1,7,-8,7,0,21,0,8,0,8,8};
        System.out.println(a.soln(k));
     }
}
class Soln{
    public int soln(int A[]){
        int  maxLevel=1,maxChild=2,counter=1;
        //LinkedList to store the sum of each level
        LinkedList<Integer> object = new LinkedList<Integer>();

        object.add(A[0]);
        int asum=0;
        int node=1;

if(A.length>1) {
    for (int i = 1; i < A.length; i++) {
        asum=0;
        try {

            //Adds the nodes in each level. maxChild is the max number of child in the level in a binary tree
            for (int j = 1; j <= maxChild; j++) {//j must start from 1 to get all the child
                asum += A[node];//To start from the point that represents next level in a binary tree in the array, node variable is used
                node++;

            }
        }
        catch (ArrayIndexOutOfBoundsException e) {//Since the binary tree may not have all the child at a specific level we have to catch the error

            object.add(asum);
            break;
        }
        maxChild *= maxChild;
        object.add(asum);
        counter++;
    }

    int maxSum=object.get(0);

//To find the maximal sum and minimal level
    for(int i=1;i<object.size();i++){
        if(object.get(i)>maxSum){
            maxSum=object.get(i);
            maxLevel=i+1;
        }

    }
}
        return maxLevel;
    }
}