package exam;

public class CountCombinations {
  static int count=0;
    public static void partition(int n,int max, String p)
    {
      if(n==0)
      {
        System.out.println(p);
        count++;
        return;
      }
      for(int i=Math.in(max,n);i>=1;i--)
         partition(n-i,i,p+" "+i)
    }
  public int getNumberOfWays(final int total, final int k) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    partition(total,k,"");
    return 0;
  }

}
