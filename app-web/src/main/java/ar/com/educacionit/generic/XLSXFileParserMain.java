package ar.com.educacionit.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import ar.com.educacionit.domain.Articulos;
import ar.com.educacionit.generic.ParseException;

public class XLSXFileParserMain {

	public static void main(String[] args) {

		String pathxlsx ="./src/main/java/ar/com/educacionit/generic/articulos.xlsx";

		IParser<Collection<Articulos>> parserMult= new XLSXFileParser(pathxlsx);

		Collection<Articulos> articulos =new ArrayList<Articulos>();
		
		
		try {
			articulos = parserMult.parse();

			for (Articulos arti: articulos) {
				System.out.println(arti);
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}

		String pathDestinoPDF="./src/main/java/ar/com/educacionit/generic";

		}

	private String path;
	
	public void ConstruirPDF (Collection<Articulos> articulos) {

		Document pdf = new Document();
	
		try {
			PdfWriter.getInstance(pdf, new FileOutputStream(path+"/archivoSemana13.pdf"));

			pdf.open();

			PdfPTable table = new PdfPTable(6);
			table.addCell("titulo");
			table.addCell("codigo");
			table.addCell("precio");
			table.addCell("stock");
			table.addCell("marcasId");
			table.addCell("categoriasId");

			// cargar lista articulos
			for (Articulos articulo : articulos) {
				table.addCell(articulo.getTitulo());
				table.addCell(articulo.getCodigo());
				table.addCell(articulo.getPrecio().toString());
				table.addCell(articulo.getStock().toString());
				table.addCell(articulo.getMarcasId().toString());
				table.addCell(articulo.getCategoriasId().toString());
			}

			pdf.add(table);

			pdf.close();



		} catch (FileNotFoundException | DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



}