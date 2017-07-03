# oo
import java.io.*;
import java.util.*;
public class Main{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int a;
    a=Integer.parseInt(br.readLine());
    if(a==0)
    System.out.println("Zero");
    else if(a>0)
    System.out.println("positive");
    else
    System.out.println("negative");
  }
}
