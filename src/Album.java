import java.io.FileNotFoundException;
import java.io.File;

public class Album /* extends Artist */{
	
	private String title;
	private String releaseDate;
	private String imgFilePath;
	
	public Album(String newTitle, String newReleaseDate, String newImgFilePath) throws FileNotFoundException {
		setTitle(newTitle);
		setReleaseDate(newReleaseDate);
		setImgFilePath(newImgFilePath);
	}
	
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	
	public void setReleaseDate(String newReleaseDate) {
		releaseDate = newReleaseDate;
	}
	
	public void setImgFilePath(String newFilePath) throws FileNotFoundException {
		File testFile = new File(newFilePath);
		boolean testExist = testFile.exists();
		if (!testExist) throw new FileNotFoundException("The supplied file name does not exist.");
		imgFilePath = newFilePath;
	}

	public String getTitle() {
		return title;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public String getImgFilePath() {
		return imgFilePath;
	}
	
	@Override
	public String toString() {
		String albumString = /* getArtist() + */ " - " + title;
		albumString += " | " /* + getGenre() + */ + " | ";
		albumString += releaseDate + " | " + imgFilePath;
		return albumString; 
	}
}