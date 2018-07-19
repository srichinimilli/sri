import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class mail1
{
 public static void main(String args[])
 {
  Pattern compile=Pattern.compile("yaah[.][a-z]{3}[.][a-z]{2}");
  Matcher matcher=compile.matcher("yaah.com.co");
  while(matcher.find())
  {
   System.out.println(matcher.group());
  }
 }
}
