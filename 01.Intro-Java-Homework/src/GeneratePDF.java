import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class GeneratePDF {

	public static void main(String[] args) throws IOException, DocumentException {
		Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("Deck-of-Cards.pdf"));                      
        document.open();
        
        String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        String[] symbols = { "\u2665", "\u2666", "\u2660", "\u2663" };

        BaseFont baseFont = BaseFont.createFont("times.ttf", BaseFont.IDENTITY_H, true);
        Font blackSuit = new Font(baseFont,75f,0, BaseColor.BLACK);
        Font redSuit = new Font(baseFont, 75f,0, BaseColor.RED);
        
        PdfPTable table = new PdfPTable(4);
        table.setWidthPercentage(100);
        table.getDefaultCell().setFixedHeight(180);
        
        
        for(int i = 0; i < cards.length;i++) {
        	for(int j = 0;j < symbols.length;j++) {
        		if(j < 2) {
        			table.addCell(new Paragraph( cards[i]+" "+ symbols[j], redSuit));
        		}
        		else {
        			table.addCell(new Paragraph( cards[i]+" "+ symbols[j], blackSuit));
				}
        		
        	}
        }
        
        document.add(table);
		document.close();

	}

}
