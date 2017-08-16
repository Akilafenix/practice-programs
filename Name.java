import java.io.*;
class Name
{
public static void main(String args[])throws IOException
{
String name;
System.out.println("enter name:");
DataInputStream d=new DataInputStream(System.in);
name=d.readLine();
System.out.println("hello"+name);
}
}