package langaugeBasics;

public class ConcatDemo
{
	public static void main( String[] args )
	{
		String first_sentence = "This is ";
		String second_sentence = "a concatenated String.";
		String third_sentence = first_sentence + second_sentence;

		System.out.println( third_sentence );
	}
}
