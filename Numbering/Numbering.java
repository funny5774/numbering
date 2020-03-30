import java.io.*;


public class Numbering{

	public static void main(String[] args)throws Exception{

		String input = args[0];
		String input2 = args[1];

		File file = new File(input);
		String fileName = file.getName();
		String copy = fileName;
		

		FileWriter fileWriter;
		//System.out.println(fileName.substring(1,fileName.indexOf(','))+fileName.substring(fileName.indexOf('.')));

		for(int i = 0;i<new Integer(input2);i++)
				fileWriter = new FileWriter(fileName.substring(0,fileName.indexOf('.'))+(i+1)+fileName.substring(fileName.indexOf('.')+1));




	}
}
