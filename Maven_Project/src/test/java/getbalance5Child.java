
public class getbalance5Child extends getbalance5Parent{
	public static void main(String[] args) {
		getbalance5Parent obj = new getbalance5Parent();
		obj.getC();
		obj.setC("king");
		System.out.println(obj.getC());
		obj.getN();
		obj.setN(1000);
		System.out.println(obj.getN());
		obj.getC();
		obj.setC("jhon");
		System.out.println(obj.getC());
		obj.getN();
		obj.setN(2000);
		System.out.println(obj.getN());
		
		
	}
	



	

}
