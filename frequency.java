import java.util.*;
public class frequency{
  private static int ch;
  public static int getC()
  {
    return ch;
  }
  public static char[] highestFreq(String str)
  {
    char c[]=str.toCharArray();
    int max=-1,k=0,m = 0;
    int c1[]= new int[c.length];
    char a[] = new char[c.length];
         for(int i=0;i<c.length;i++){
          for(int j=i+1;j<c.length;j++){
            if(c[i]==c[j] && c[i] != '/')
            {
              c[j] = '/';
              c1[i]+=1;
              }
          }
             if(max<c1[i])  max=c1[i];
              }
        for(int i = 0; i < c.length; i++)
        {
          for(int j = i + 1; j < c.length; j++)
          {
            if(c[i] == c[j]) c1[i] = -1;
          }
        }
        for(int i = 0; i < c.length; i++)
        {
          // System.out.print(max+" ");
          if(c1[i] == max)
          {
            // System.out.print(c[i]+" ");
           a[m++] = c[i];
          }
        }
    return a;
  }
  public static void main(String[] ar){
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    char []high = highestFreq(str);
    //int k = getC();
   // System.out.print(k+" ");
    for(int i = 0; i < high.length; i++)
    System.out.print(high[i]+" ");
  }
}
