public class DataHora {
	private Calendario d;
	private Horario h;
	
	public DataHora(Calendario d, Horario h) {
		this.d = d;
		this.h = h;
	}
	
	public void setCalendario(Calendario d) {
		this.d = d;
	}
	
	public void setHorrariio(Horario h) {
		this.h = h;
	}
	
	public String printlmDataHora() {
		return d.toString() + "\n" + h.printlmHorario();
	}
}
