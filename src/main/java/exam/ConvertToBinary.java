package exam;
import java.io.*;
public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    String s="",k="";
    int m=n;
    try
    {
      if(m<0)
      {
        throw new IOException("No is not correct");
      }
     
    }
    catch(Exception e)
    {
       e.printStackTrace();
    }
     while(m>0)
      {
         s=Integer.toString(m%2)+s;
         m=m/2;
      }
    k=s.reverse();
    
    return k;
  }
}
