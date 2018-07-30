package a_Zadania.a_Dzien_1.b_Atrybuty;


public class Main2 {
		public static void main (String [] arrgs) {
			Attribute attr = new Attribute();
			attr.publicAttribute ="public";
			attr.protectedAttribute="protected";
//			attr.privateAttribute="private";
			System.out.println(attr.publicAttribute);
			System.out.println(attr.protectedAttribute);
//			System.out.println(attr.privateAttribute);
		}
}
