package docs;

public class DocumentTest {

    public static void main(String[] args) {

        Document doc = new ExcelDocument();
        doc.getDescription();
        Document doc2 = new PdfDocument();
        doc2.getDescription();
        doc2.getDescription(); // test

    }

}
