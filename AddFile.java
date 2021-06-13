import java.io.FileWriter;
import java.io.IOException;

public class AddFile {
	
	private String fileName;
	private String path;
	
	
	public AddFile(String fileName, String path) {
		
		this.fileName = fileName;
		this.path = path;
	}
	
	
	public String getFileName() {
		return fileName;
	}


	

	public void createWrite() {
		
		
		try(FileWriter fr = new FileWriter(path+"\\"+fileName)){
			
			fr.write("Default Content");
			System.out.println("File "+fileName+" Added Successfully ");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
