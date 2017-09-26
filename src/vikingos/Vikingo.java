package vikingos;


public class Vikingo{
	
	private EstadoVikingo est;
	private int salud;
	
	public EstadoVikingo getEst() {
		return est;
	}


	public void setEst(EstadoVikingo est) {
		this.est = est;
	}

	public int getSalud() {
		return salud;
	}


	public void setSalud(int salud) {
		this.salud = salud;
	}


	
	
	public Vikingo() {
		this.est = new Normal();
		this.salud = 100;
	}
	
	
	public void Atacar( Vikingo v ){
		int daño;
		daño = (this.est.getAtaque() - v.est.getDefensa());
		if(daño  > 0)
			v.setSalud( daño);	
	}


	void tomar(){
		est = est.tomar();

	}
	
	
	void serSacudido(){
		est = est.serSacudido();
	}
	
	
	
}