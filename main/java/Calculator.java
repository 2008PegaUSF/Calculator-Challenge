
public class Calculator {
	

public int getAdd(String s) {
	String[] calcS=s.split(" ");
	if(calcS[1].equals("+")) {
		return Integer.parseInt(calcS[0]) + Integer.parseInt(calcS[2]);
	} return -1;
	
}
public int getSub(String s) {
	String[] calcS=s.split(" ");
	if(calcS[1].equals("-")) {
		return Integer.parseInt(calcS[0]) - Integer.parseInt(calcS[2]);
	} return -1;
	
	
}
public int getMult(String s) {
	String[] calcS=s.split(" ");
	if(calcS[1].equals("*")) {
		return Integer.parseInt(calcS[0]) * Integer.parseInt(calcS[2]);
	} return -1;
	
	
}
public int getDiv(String s) {
	String[] calcS=s.split(" ");
	if(calcS[1].equals("/")) {
		return Integer.parseInt(calcS[0]) / Integer.parseInt(calcS[2]);
	} return -1;
	
	
}
public int getMod(String s) {
	String[] calcS=s.split(" ");
	if(calcS[1].equals("%")) {
		return Integer.parseInt(calcS[0]) % Integer.parseInt(calcS[2]);
	} return -1;
	
	
}
	
		
	
}
