package b_Zadania_Domowe.a_Dzien_3;

public class Main5 {

    public static void main(String[] args) {
    		int [] elements = {1, 2, 3, 4, 5, 2, 2};
    		int value = 6;
    		try {
    			System.out.println("Liczba elementów " + value + " w tablicy: " + elementExist(elements, value));
    		}
    		catch (Exception e){
    			System.out.println(	e.getMessage());
    		}
    			
    }
    
    static int elementExist(int[] elements, int value) throws Exception {
    	int result=0;
    	for(int el: elements) if(el==value) result++; 
    	if (result==0) throw new Exception("Nie ma takiego numeru!");
    	return result;
    }

}
