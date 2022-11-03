package Desenhoquadrado;

public class Quadrado {

	private float area;
	private final int litros = 18;
	private int tipoTinta;
	private float rendimento;
	
	
	
	public Quadrado(float area, float rendimento, int tipoTinta) {
		this.area = area;
		this.tipoTinta = tipoTinta;
		this.rendimento = rendimento;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		if(area >0)
		this.area = area;
	}
	public float getRendimento() {
		return rendimento;
	}
	public void setRendimento(float rendimento) {
		if (rendimento>0)
		this.rendimento = rendimento;
	}
	public int getTipoTinta() {
		return tipoTinta;
	}
	public void setTipoTinta(int tipoTinta) {
		if(tipoTinta>0 && tipoTinta<4)
		this.tipoTinta = tipoTinta;
	}
	
	public float areacubo() {
		return (area*area);	
	}
	public float areatotal() {
		float areatotal = (float) (6 * Math.pow(area, 2));
		return areatotal;
	}
	
	public float volumequadrado() {
		float volume = (float) Math.pow(area, 3);
		return  volume;
	}
	
	public float diagonalquadrado() {
		float diagonal = (float) (area *Math.sqrt(3));
		return diagonal;
	}
	
	public double precodalata() {
		if (tipoTinta==1) {
			return (101.90);
		}else if (tipoTinta==2) {
				return (212.45);
		}else {
			return (345.56);
	}
	}
		
	public float litrostinta() {
		return  (areatotal()/ rendimento);
		
		
	}
	public int latastotal() {
		return (int) Math. ceil((litrostinta()/litros));
	
}
		
	public float valortotal() {
		return (float)(latastotal()*precodalata());
}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quadrado: Tamanho do Lado do Cubo:");
		builder.append(area);
		builder.append("\nRendimento: ");
		builder.append(rendimento);
		builder.append("\nTipo de Tinta: ");
		builder.append(tipoTinta);
		builder.append("\nÁrea da Base:");
		builder.append(areacubo());
		builder.append("\nÁrea total:");
		builder.append(areatotal());
		builder.append("\nVolume do Cubo: ");
		builder.append(volumequadrado());
		builder.append("\nDiagonal do Cubo: ");
		builder.append(diagonalquadrado());
		builder.append("\nLitros de Tinta utilizada: ");
		builder.append(litrostinta());
		builder.append("\nTotal de Latas:");
		builder.append(latastotal());
		builder.append("\nValor total:");
		builder.append(valortotal());
		builder.append(".");
		return builder.toString();
	}


		
	} 
	
	


	

	
	