import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SearchFile {
	
	//private ArrayList<AddFile> searchFile;
	private String path;

	public SearchFile(String path) {
		
		this.path = path;
	}
	
	
	
	
	public ArrayList<String> listFiles(String path) {
		
		ArrayList<String> names = null ;
		
		File  fileDir = new File(path);
		if(fileDir.isDirectory()) {
			
			//System.out.println("I am in listFiles");
			names = new ArrayList<String>(Arrays.asList(fileDir.list()));
			Collections.sort(names);
			//System.out.println(names);
			
		}
		return names;
	}




	public boolean ifExists(String fileName) {
		
		ArrayList<String> names = null ;
		File  fileDir = new File(path);
		if(fileDir.isDirectory()) {
			
			
			names = new ArrayList<String>(Arrays.asList(fileDir.list()));
			
			for(String fileSearch: names) {
				
				if(fileSearch.equals(fileName)) {
					return true;
				}
			}
			
		}
		return false;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
