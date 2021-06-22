package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int n=a.length;
    int t=a[n-1];
    int i;
    for(i=n-1;i>0;i--)
    {
      a[i]=a[i-1];
      
    }
    a[i]=t;
    for(i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }

  }

}
