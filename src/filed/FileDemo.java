package filed;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		// File file2=new File("ccc");
		// file2.mkdir();
		// File file3=new File("ccc\\a.txt");
		// System.out.println(file3.createNewFile());
		// File file4=new File("bbb\\ddd\\aaa\\b.txt");
		// file4.mkdirs();
		// public String[] list()
		File file=new File("E:\\eclipse-jee-luna-SR2-win32-x86_64");
		String [] s=file.list();
		for(String a:s	){
			System.out.println(a);
		}

	}

}
