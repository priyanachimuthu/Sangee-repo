package Test1;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		
		FileOutputStream fileoutputstream;
		
		try
		{
			fileoutputstream  = new FileOutputStream("qrttxt");
			String msg = "This is a Notepad";
			
			byte byteArray[]=msg.getBytes();
			
			fileoutputstream.write(byteArray);
			
			System.out.println("Message written successfully");
		}catch(FileNotFoundException e)
		{

			e.printStackTrace();
			
		}catch(IOException e)
		{
			
			e.printStackTrace();
		}

}
}
