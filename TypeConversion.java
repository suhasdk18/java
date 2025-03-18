package chandana;

public class TypeConversion {

	public static void main(String[] args) {
		int intValue=257;
		byte narrowedByteValue=(byte) intValue;
		//byte widenedByteValue=(byte) intValue;
		double widenedByteValue=intValue;
		System.out.println("Original int value :"+intValue);
		System.out.println("Narrow Byte Value :"+narrowedByteValue);
		System.out.println("Widened Byte Value :"+widenedByteValue);

}
}
