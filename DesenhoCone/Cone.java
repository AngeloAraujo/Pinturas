package DesenhoCone;

public class Cone {

		private float raio;
		private float altura;
		private int tinta;

		

		public Cone() {
		
		}

		public float getRaio() {
			return raio;
	}

		public void setRaio(float raio) {
			if (raio>0)
				this.raio = raio;
	}

		public float getAltura() {
			return altura;
	}

		public void setAltura(float altura) {
			if (altura>0)
				this.altura = altura;
	}

		public int getTinta() {
			return tinta;
	}

		public void setTinta(int tinta) {
			if (tinta>0 && tinta<3)
				this.tinta = tinta;
	}

		public float geratriz() {
			return ((raio*raio)+(altura*altura));
	}

		public float geratriz1() {
			return (float) Math.sqrt(geratriz());
	}

		public float areatotal() {
			return (float) (3.14*raio*(raio+geratriz1()));
	}

		public double fundocone() {
			return (double) 3.14*(raio*raio);
	}

		public double lateralcone() {
			return (double) (3.14*raio*geratriz1());
	}

		public float cobertura() {
			return (float) (1/3.45);
	}

		public float quantlitrostinta() {
			return(areatotal()/cobertura());
	}

		public int latastotal() {
			return (int) Math. ceil((quantlitrostinta()/18));
		
	}
		
		public double precodalata() {
			if (tinta==1) {
				return (238.90);
		}
			else if (tinta==2) {
				return (467.98);
		}
			else {
				return (758.34);
		}

	}
		
		
		public float valortotal() {
			return (float)(latastotal()*precodalata());
	}

	@Override
		public String toString() {
			return "O raio do cone informado foi: " + getRaio() + ", a altura: " + getAltura() + ", a classe da tinta():" + getTinta()
				+ "\ngeratriz: " + geratriz1() + " \nArea total: " + areatotal() + "\nFundo do cone:"
				+ fundocone() + "\nLateral cone: " + lateralcone() + "\nQuantidade de tinta em litros: "
				+ quantlitrostinta() +"\nQuantidade de latas: "+latastotal()+ "\nValor total: " + valortotal() + ".";
	}


	}
		
	
