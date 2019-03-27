import java.io.BufferedReader;
import java.io.InputStreamReader;

/// A sample application showing how to use Voce's speech synthesis 
/// capabilities.

public class synthesisTest
{
	public synthesisTest()
	{
		voce.SpeechInterface.init("../../../lib", true, false, "", "");
		//voce.SpeechInterface.synthesize("This is a speech synthesis test.");
		System.out.println("Text to speech started successfully.");
  }

  public void read(String s) 
  {
		try
		{
				voce.SpeechInterface.synthesize(s);
    }
		catch (Exception e)
		{
			System.out.println( "Error:" + e);
		}
	}
}

