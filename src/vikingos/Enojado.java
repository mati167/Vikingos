package vikingos;

public class Enojado extends EstadoVikingo {

	
	public Enojado() {
		super( 30, 0);
	}
	
	@Override
	void Atacar(Vikingo v) {
		v.setSalud( this.getAtaque() - v.getEst().getDefensa() );
		
	}

	@Override
	EstadoVikingo tomar() {
		return new Normal();
	}

	@Override
	EstadoVikingo serSacudido() {
		return this;
	}

	
	
}
