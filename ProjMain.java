import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.*;  

public class ProjMain {

	public static void main(String[] args) {
		
		boolean close = true;
		final String path  = "E:\\Proj";
		while(close) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("=============== WELCOME ============");
		System.out.println("====FILE APP DEVBY:RUCHITA PATIL====");
		System.out.println("1.Add File");
		System.out.println("2.Search File");
		System.out.println("3.Delete File");
		System.out.println("4.Exit");
		System.out.println("************************************");    
		System.out.println("Enter an option:");
		try {
			int a = 0;
			try {
			
				 a = Integer.parseInt(br.readLine());
			}catch(NumberFormatException e){
				System.out.println("Please Enter a Number");
				
				
			}
			switch(a) {
			
			case 1:
				
				System.out.println("Enter the name of File:");
				
				
				String fileName = br.readLine();
				if(Pattern.matches("[a-zA-Z0-9]{6}(.txt)", fileName)) {
				AddFile file = new AddFile(fileName,path);
				file.createWrite();
				}else {
					
					System.out.println("Alphanumeric File names allowed upto 6 characters with extension .txt e.g (jack12.txt)");
				}
				
					break;
			case 2:
				
				System.out.println("Enter the name of File to be searched:");
				String fileSearch = br.readLine();
				SearchFile srch = new SearchFile(path);
				boolean ret = srch.ifExists(fileSearch);
				if(ret == true) {
					System.out.println("File is present");
				}else {
					System.out.println("No File...");
				}
				System.out.println("Do you want to see all the files?(Y/N)");
				String inp = br.readLine();
				if(inp.equals("Y")|| inp.equals("y")) {
				List<String> searchFiles = new ArrayList<>();
				searchFiles = srch.listFiles(path);
				Iterator<String> iter = searchFiles.iterator();
				while(iter.hasNext()) {
					System.out.print (iter.next()+" ");
				}
				}
				
				break;
			case 3 :
				
				System.out.println("Enter the name of File to be Deleted:");
				String fileDelete = br.readLine();
				DeleteFile del = new DeleteFile(path);
				boolean delete = del.deleteFile(fileDelete);
				
				if(delete)
					System.out.println("File Deleted...");
				else
					System.out.println("FNF");
				break;
			case 4:
				
				System.out.println("Do you want to close: Y/N");
				String ex = br.readLine();
				if(ex =="Y" || ex=="y")
					
					System.exit(0);
				close = false;
				break;
			
			
			
			}
				
				
			
			
		} catch (NumberFormatException | NullPointerException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	    
		
		
		
		
		
		}
		System.out.println("Exited Successfully Visit us Again");
		

	}

}
