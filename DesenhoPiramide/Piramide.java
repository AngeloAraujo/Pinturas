package DesenhoPiramide;

public class Piramide {

	private float altura;
	private float areadabase;
	public final int tamlatas=18;
	private int tipo;
	
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		if(altura>0)
		this.altura = altura;
	}
	public float getAredabase() {
		return areadabase;
	}
	public void setAredabase(float aredabase) {
		if (aredabase>0)
		this.areadabase = aredabase;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		if(tipo>0 && tipo <4)
		this.tipo = tipo;
	}
	
	public float arealateral() {
		float arealateral= (float) (Math.pow(altura, 2)+(Math.pow(areadabase, 2)));
		float arealateral1= (float) Math.pow(arealateral, 2);
		return arealateral1;
	}
	
	public float areatriangulo() {
		float areatriangulo= arealateral() * areadabase;
		return areatriangulo;
	}
	
	public float areabase() {
		float areabase = (float) (Math.pow( areadabase,2)*4);
		return areabase;
	}
	
	public float areatotal() {
		return (areabase()+areatriangulo());
	}
	
	public float litros() {
		return (float) (areatotal()/4.76);
	}
	
	public int latas() {
		return (int) (litros()/18);
	}
	
	public double precodalata() {
		if (tipo==1) {
			return (127.90);
		}else if (tipo==2) {
				return (258.98);
		}else {
			return (344.34);
	}
	}
	
	public float valortotal() {
		return (float)(latas()*precodalata());
}
	
	
}
