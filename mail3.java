import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class mail3
{
 public static void main(String args[])
 {
  Pattern compile=Pattern.compile("[A-Z][a-z]{6}");
  Matcher matcher=compile.matcher("Bhavani");
  while(matcher.find())
  {
   System.out.println(matcher.group());
  }
 }
}
