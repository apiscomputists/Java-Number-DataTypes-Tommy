public class DataTypes {

	public static void main(String[] args)
	{
		// int has a width of 32 
		int myMinValue = -2_147_483_648;
		int myMaxValue = 2_147_483_647;

		// byte has a width of 8 
		byte myByteValue = -128; 
		byte myBiggerByteValue = 127;
	
		// short has a width of 16 
		short myShortValue = -32768;
		short myLessShorterValue = 32767;

		// long has a width of 64 
		long myLongValue =  -9_223_372_036_854_775_808L;
		long myLongerValue = 9_223_372_036_854_775_807L; // must put dat L at the end	

		// Tim Buchalka's CHALLENGE 
		byte byteChallenge = (byte) (111);
		short shortChallenge = (short) (32767);
		int intChallenge = (int) (100000);
		long ChallengeTotal = 50000L + 10L * byteChallenge + intChallenge + shortChallenge; // no need to use (cast), as long automatically converts stuff to integer.

		System.out.println("The Total Value is: " + ChallengeTotal);
		
	
	}
}