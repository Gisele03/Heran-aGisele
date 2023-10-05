package AtvHerança;

public class Principal1 {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo("BMW", "X1", 2020,"Branco");
		System.out.println("Veiculo:");
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Ano: " + veiculo.getAno());
		System.out.println("Cor: " + veiculo.getCor());
		
		Automovel automovel = new Automovel("BMW", "X1", 2020,"Branco",4, "Motor");
		System.out.println("\nAutomovel:");
		System.out.println("Marca: " + automovel.getMarca());
		System.out.println("Modelo: " + automovel.getModelo());
		System.out.println("Ano: " + automovel.getAno());
		System.out.println("Cor: " + automovel.getCor());
		System.out.println("NumeroPortas: " + automovel.getNumeroPortas());
		System.out.println("Motor: " + automovel.getMotor());
		
		
		Moto moto = new Moto("BMW", "X1", 2020,"Branco", 1000);
		System.out.println("nMoto:");
		System.out.println("Marca: " + moto.getMarca());
		System.out.println("Modelo: " + moto.getModelo());
		System.out.println("Ano: " + moto.getAno());
		System.out.println("Cor: " + moto.getCor());
		System.out.println("Cilindrada: " + moto.getCilindrada());

	}

}
