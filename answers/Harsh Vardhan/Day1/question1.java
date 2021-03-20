public class ques1
{
public static void main (String args[])
{
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  int n = Integer.parseInt(br.readLine());
  int x,y=2,z;


for (x = 1; x<=n;x++)
   {
     z= x * x * x + y;
y=y+2;
System.out.print(z + ",");

}
}
}
