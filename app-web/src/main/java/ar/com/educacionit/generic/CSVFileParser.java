package ar.com.educacionit.generic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import ar.com.educacionit.domain.Articulos;

public class CSVFileParser extends BaseFile implements IParser<Collection<Articulos>> {

	public CSVFileParser(String path) {
		super(path);
	}

	//implementar el metodo generico de IFileParser, dandode un tipo concreto
	public Collection<Articulos> parse() throws ParseException {

		//armamos la coleccion donde vamos a guardar los datos
		Collection<Articulos> articulos = new ArrayList<>();

		//aca va la logica de lectura del file
		File file = new File(super.getFilePath());

		//verifico si existe el file
		if(!file.exists()) {
			//el negocio dice que pasa si no existe el archivo
			throw new ParseException("No existe el archivo: " + super.getFilePath());
		}

		//leemos archivos
		try (FileReader fileReader = new FileReader(file);){

			try(BufferedReader br = new BufferedReader(fileReader);) {

				//leer la primer linea para descartar los titulos
				String lineaLeida = br.readLine();

				//seguimos a la siguiente linea
				//si la siguiente linea no tiene nada, lineaLeida sería null
				lineaLeida = br.readLine();

				//leemos el resto de lineas
				while(lineaLeida != null) {
					//ahora que tengo la linea (linea 43), tengo que partirlo
					//por el ; , y guardar en un array de String

					//logica de parseo
					String[] datos = lineaLeida.split(";");

					String id = datos[0];
					String titulo = datos[1];
					String precio = datos[2];

					//creo el articulo con los datos que lei del file
					Articulos unArticulo = new Articulos(Long.parseLong(id),titulo,Double.parseDouble(precio));

					//agregamos el articulo a la coleccion del metodo
					articulos.add(unArticulo);

					//paso a la siguiente linea
					lineaLeida = br.readLine();
				}
			}
		} catch (IOException e) {
			throw new ParseException(e.getMessage(),e);
		} 

		return articulos;
	}
}