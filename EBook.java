
/*
 * Name: Renyza Kaye Montes
 * Section: [Your Section]
 * Date: November 3, 2026
 */

public class EBook extends Book {

    private String fileFormat;

   
    public EBook(String title, String author, String isbn,
                 double price, String fileFormat) {

        super(title, author, isbn, price);

        setFileFormat(fileFormat);
    }

    
    public String getFileFormat() {
        return fileFormat;
    }

    
    public void setFileFormat(String fileFormat) {
        if (fileFormat != null && !fileFormat.trim().isEmpty()) {
            this.fileFormat = fileFormat;
        } else {
            System.out.println("Invalid file format!");
        }
    }

   
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Format: " + fileFormat);
    }
}
