package vikingos;

public abstract class EstadoVikingo {


	private int ataque;
	private int defensa;
	
	
	
	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public EstadoVikingo( int ataque, int defensa) {
		this.ataque = ataque;
		this.defensa = defensa;
	}
	
	abstract void Atacar( Vikingo v );
	abstract EstadoVikingo tomar();
	abstract EstadoVikingo serSacudido();
	
}
