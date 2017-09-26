package vikingos;

public class Normal extends EstadoVikingo{
	
	public Normal() {
		super( 10, 5);
	}

	
	@Override
	void Atacar(Vikingo v) {
		v.setSalud( this.getAtaque() - v.getEst().getDefensa() );
	}
	
	@Override
	EstadoVikingo tomar() {
		return new Borracho();
	}
	@Override
	EstadoVikingo serSacudido() {
		return new Enojado();
	}

	
}