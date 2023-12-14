import document.Document;
import document.ExcelDocument;
import document.PdfDocument;

public class DocumentTest {

    public static void main(String[] args) {

        // zamiast tworzyc taka deklaracje
        ExcelDocument document = new ExcelDocument();

        //mozemy stworzyc obiekt nadrzedny Document
        //tylko możemy wskazac na klasy potomne okreslając tym typ dokumentu
        Document excelDocument = new ExcelDocument();
        Document pdfDocument = new PdfDocument();

        document.getDescription();
        excelDocument.getDescription();
        pdfDocument.getDescription();



    }

}
