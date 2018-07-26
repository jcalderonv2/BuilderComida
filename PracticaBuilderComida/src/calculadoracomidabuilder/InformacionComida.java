package calculadoracomidabuilder;

import calculadoracomida.Medida;

public class InformacionComida {

	private final String nombre;
	private final int cantidadPorcion;
	private final Medida unidadDeMedida;
	private final int porciones;
	private final int calorias;
	private final int grasa;
	private final int sodio;
	private final int carbohidratos;

	public InformacionComida(final String NewpNombre, final int NewpCantidadPorcion, final Medida NewpMedida,
			final int NewpPorciones, final int NewpCalorias, final int NewpGrasa, final int NewpSodio,
			final int NewpCarbohidratos) {
		this.nombre = NewpNombre;
		this.cantidadPorcion = NewpCantidadPorcion;
		this.unidadDeMedida = NewpMedida;
		this.porciones = NewpPorciones;
		this.calorias = NewpCalorias;
		this.grasa = NewpGrasa;
		this.sodio = NewpSodio;
		this.carbohidratos = NewpCarbohidratos;
	}

	@Override
	public String toString() {
		return "InformacionComida [nombre=" + nombre + ", cantidadPorcion=" + cantidadPorcion + ", unidadDeMedida="
				+ unidadDeMedida + ", porciones=" + porciones + ", calorias=" + calorias + ", grasa=" + grasa
				+ ", sodio=" + sodio + ", carbohidratos=" + carbohidratos + "]";
	}

	public static class ComidaBuilder {
		private String nestednombre;
		private int nestedantidadPorcion;
		private Medida nestednidadDeMedida;
		private int nestedporciones;
		private int nestedcalorias;
		private int nestedgrasa;
		private int nestedsodio;
		private int nestedcarbohidratos;

		public ComidaBuilder(String nestednombre, Medida nestednidadDeMedida, int nestedcalorias) {
			this.nestednombre = nestednombre;
			this.nestednidadDeMedida = nestednidadDeMedida;
			this.nestedcalorias = nestedcalorias;
		}

		public ComidaBuilder nombre(String NewpNombre) {
			this.nestednombre = NewpNombre;
			return this;

		}

		public ComidaBuilder cantidadPorcion(int NewpCantidadPorcion) {
			this.nestedantidadPorcion = NewpCantidadPorcion;
			return this;
		}

		public ComidaBuilder unidadDeMedida(Medida NewpMedida) {
			this.nestednidadDeMedida = NewpMedida;
			return this;
		}

		public ComidaBuilder porciones(int NewpPorciones) {
			this.nestedporciones = NewpPorciones;
			return this;
		}

		public ComidaBuilder calorias(int NewpCalorias) {
			this.nestedcalorias = NewpCalorias;
			return this;
		}

		public ComidaBuilder grasa(int NewpGrasa) {
			this.nestedgrasa = NewpGrasa;
			return this;
		}

		public ComidaBuilder sodio(int NewpSodio) {

			this.nestedsodio = NewpSodio;
			return this;

		}

		public ComidaBuilder carbohidratos(int NewpCarbohidratos) {

			this.nestedcarbohidratos = NewpCarbohidratos;
			return this;

		}
		
		public CalculadoraComida createPerson() {
			return new CalculadoraComida();
		}
		
		public InformacionComida crearComida() {
			
			return new InformacionComida(nestednombre, nestedantidadPorcion, nestednidadDeMedida, nestedporciones, 
					nestedcalorias, nestedgrasa, nestedsodio, nestedcarbohidratos);
			
		}

	}
}
