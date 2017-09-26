package vikingos;

public class Borracho extends EstadoVikingo{

	
	public Borracho() {
		super( 7, 2);
	}

	
	@Override
	void Atacar(Vikingo v) {
		v.setSalud( this.getAtaque() - v.getEst().getDefensa() );
		
	}

	@Override
	EstadoVikingo tomar() {
		return this;
	}

	@Override
	EstadoVikingo serSacudido() {
		return new Normal();
	}
	

	
}
