package skyler.tao.pdf2xml;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class JavaPDFTest {

	public static void main(String[] args) throws IOException {

		PDFManager pdfManager = new PDFManager();
		pdfManager.setFilePath("test.pdf");
		System.out.println(pdfManager.ToText());

	}
}
