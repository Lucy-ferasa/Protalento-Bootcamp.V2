package practicaSemana11;

public enum IdiomasEnum {

	ES(new Espanol()), ING(new Ingles()), CHI(new Chino()), ITA(new Italiano());

	private IIdioma idioma;

	private IdiomasEnum(IIdioma idioma) {
		this.idioma = idioma;
	}

	public IIdioma getIdioma() {
		return this.idioma;
	}
}
