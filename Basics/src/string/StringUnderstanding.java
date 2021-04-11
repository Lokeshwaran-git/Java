package string;

public class StringUnderstanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="java";
System.out.println("1)"+s.length());
System.out.println("2)"+s.toLowerCase());
System.out.println("3)"+s.toUpperCase());
System.out.println("4)"+s.charAt(2));
System.out.println("5)"+s.indexOf('a'));
System.out.println("6)"+s.lastIndexOf('a'));
System.out.println("7)"+s.equals("us"));
System.out.println("8)"+s.equalsIgnoreCase("us"));
System.out.println("9)"+s.concat("is created by James Gosling"));
System.out.println("10)"+s.startsWith("a"));
System.out.println("11)"+s.endsWith("a"));
System.out.println("12)"+s.contains(s));
System.out.println("13)"+s.substring(2));
System.out.println("14)"+s.substring(2,4));
System.out.println("15)"+s.replace("a","@"));
System.out.println("16)"+s.replaceFirst("a","@"));
System.out.println("17)"+s.replaceAll("java","python"));
System.out.println("18)"+s.trim());
	}
}
