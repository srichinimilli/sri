import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class mail
{
 public static void main(String args[])
 {
  Pattern compile=Pattern.compile("gmail[.][a-z]{3}[.][a-z]{2}[.][a-z]{2}");
  Matcher matcher=compile.matcher("gmail.com.co.in");
  while(matcher.find())
  {
   System.out.println(matcher.group());
  }
 }
}
