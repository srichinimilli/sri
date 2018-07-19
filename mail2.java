import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class mail2
{
 public static void main(String args[])
 {
  Pattern compile=Pattern.compile("krishna[._][a-z]{1}[^$&]gmail[.][a-z]{3}");
  Matcher matcher=compile.matcher("krishna.g*gmail.com");
  while(matcher.find())
  {
   System.out.println(matcher.group());
  }
 }
}
