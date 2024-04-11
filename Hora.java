public class Horario {

		private int hora;
		private int minuto;
		
		public Horario(int h, int m) {
			this.hora = h;
			this.minuto = m;
		}
		
		public void setHora(int novaHora) {
			this.hora = novaHora;
		}
		
		public void setMinuto(int novoMinuto) {
			this.minuto = novoMinuto;
		}
		
		public int getHora() {
			return hora;
		}
		
		public int getMinuto() {
			return minuto;
		}
		
		public String printlmHorario() {
			return hora + ":" + minuto;
		}
	}

