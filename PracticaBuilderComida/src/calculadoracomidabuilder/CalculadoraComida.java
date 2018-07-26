package calculadoracomidabuilder;


import calculadoracomida.Medida;
import calculadoracomidabuilder.InformacionComida.ComidaBuilder;

public class CalculadoraComida {
	
	public static void main(String[] args) {
        InformacionComida comida;
        ComidaBuilder builder = new ComidaBuilder("Yuca", Medida.G, 159);
        builder = builder.cantidadPorcion(2).carbohidratos(38).sodio(14);
        comida = builder.crearComida();
        System.out.println(comida.toString());
        
    }

}
