import java.io.*;
import java.lang.*;
class Anton_and_Danik
{
int n=0;
String s=" ";

public void main() throws IOException
{
BufferedReader obj = new BufferedReader(InputStreamReader(System.in));

System.out.println("Enter the integer, then the string");

n=Integer.parseInt(obj.readLine());
s=obj.readLine();

int AntCount=0;
int DanCount=0;

for(int i=0; i<n;i++)
{

if(s.charAt(i)== 'D')
{
DanCount++;
}

else
{
AntCount++;
}
}

if(AntCount>DanCount)
{
System.out.println("Anton");
}

else if(DanCount>AntCount)
{
	System.out.println("Danik");

}

else
{
	System.out.println("Friendship");
}
}
}