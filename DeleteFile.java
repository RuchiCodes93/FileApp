import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class DeleteFile {

	private String path;

	public DeleteFile(String path) {
		
		this.path = path;
	}
	
	
	public boolean deleteFile(String fileName) {
		
		ArrayList<File> nameDelete = null ;
		File  fileDir = new File(path);
		if(fileDir.isDirectory()) {
			
			
			nameDelete = new ArrayList<File>(Arrays.asList(fileDir.listFiles()));
			
			for(File fileDelete: nameDelete) {
				
				if(fileDelete.getName().equals(fileName)) {
					fileDelete.delete();
					System.out.println("File "+fileName+" is Deleted.");
					return true;
				}
			}
			
		}
		return false;
		
		
	}
	
}
