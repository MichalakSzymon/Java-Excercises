package a_Zadania.a_Dzien_1.a_Wyrazenia_regularne;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {

	private static final Pattern PATTERN =
			Pattern.compile("^[0-9]{1,}([\\s[*+-/]\\s[0-9]{1,}]{0,})[\\s[+-/]\\s[0-9]]{1,}$");
					
	public static void main(String[] args) {
	try {	
		FileWriter out = new FileWriter("a_Zadania/a_Dzien_1/a_Wyrazenia_regularne/Operations.txt");
		StringBuilder write = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		List <String> list = new ArrayList <>();
		String line = scan.nextLine();
		while(!line.equals("quit")) {
			Matcher	matcher	= PATTERN.matcher(line);
			if(matcher.matches()) {
				StringTokenizer str = new StringTokenizer(line);
				Integer result = 0;
				Integer a=0;
				String znak = "";
				result = Integer.parseInt(str.nextToken());
				while(str.hasMoreTokens()) {
					znak = str.nextToken();
					a = Integer.parseInt(str.nextToken());
					switch(znak) {
						case("+"):
							result = result+a;
							break;
						case("-"):
							result = result-a;
							break;
						case("*"):
							result = result*a;
							break;
						case("/"):
							result = result/a;
							break;
						default:
							throw new UnsupportedOperationException();
					}
				}
				out.append(line);
				out.append(" = ");
				out.append(result.toString());
				out.append("\n");
			} else 
				System.out.println("Niepoprawne działanie");
			line=scan.nextLine();
			}
		
		out.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
		
}

//package a_Zadania.a_Dzien_1.a_Wyrazenia_regularne;
//
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//class Expression {
//
//    private static final Pattern PATTERN =
//            Pattern.compile("(?<n1>[1-9][0-9]*)\\s(?<op>[+\\-:*])\\s(?<n2>[1-9][0-9]*)");
//
//    private final String exp;
//
//    private Matcher matcher;
//
//    private Expression(String string) {
//        exp = string;
//    }
//
//    static Expression fromString(String string) {
//        return new Expression(string);
//    }
//
//    boolean isCorrect() {
//        matcher = PATTERN.matcher(exp);
//        return matcher.matches();
//    }
//
//    String evaluate() {
//        final int n1 =
//                Integer.parseInt(matcher.group("n1"));
//        final int n2 =
//                Integer.parseInt(matcher.group("n2"));
//        final String op = matcher.group("op");
//
//        switch (op) {
//            case "+":
//                return (n1 + n2) + "";
//            case "-":
//                return (n1 - n2) + "";
//            case "*":
//                return (n1 * n2) + "";
//            case ":":
//                return (n1 / (double) n2) + "";
//            default:
//                throw new UnsupportedOperationException(op);
//        }
//    }
//}
//
//public class Main3 {
//
//    public static void main(String[] args) throws FileNotFoundException {
//        final Scanner scanner = new Scanner(System.in);
//
//        final PrintWriter writer =
//                new PrintWriter("operations.txt");
//
//        String line;
//        do {
//            line = scanner.nextLine();
//
//            final Expression expression = Expression.fromString(line);
//
//            if (expression.isCorrect()) {
//                writer.println(line + " = " + expression.evaluate());
//            }
//
//        } while (!line.equals("quit"));
//
//        writer.flush();
//        writer.close();
//    }
//}