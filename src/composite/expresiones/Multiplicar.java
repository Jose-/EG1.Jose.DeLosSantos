package composite.expresiones;

public class Multiplicar extends Expresion {

	
	public Multiplicar(Expresion val1, Expresion val2) {
		super(val1, val2);
		this.valor = operar();
	}

	@Override
	public int operar() {
		return (this.val1.valor * this.val2.valor);
	}

}
