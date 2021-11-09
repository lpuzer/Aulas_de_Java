
public class Ponto {
	
	private int coordenadaX;
	private int coordenadaY;
	

	
	public Ponto(int coordenadaX, int coordenadaY) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}


	public int getCoordenadaX() {
		return coordenadaX;
	}


	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}


	public int getCoordenadaY() {
		return coordenadaY;
	}


	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}


	public double distancia(Ponto p) {
		float px = this.coordenadaX - p.coordenadaX;
		float py = this.coordenadaY - p.coordenadaY;
		double d = Math.sqrt((px*px) + (py*py));
		return d;
	}
	
	public boolean igual(Ponto p) {
		if (this.coordenadaX == p.coordenadaX && this.coordenadaY == p.coordenadaY ) {
			return true;
		}
		else {
			return false;
		}

	}
	
	

}

