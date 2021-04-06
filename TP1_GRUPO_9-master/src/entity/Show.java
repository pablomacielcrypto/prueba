package entity;

public class Show {

	private int idShow;
	private Evento evento;

	// CONSTRUCTOR

	public Show() {
	}


	public Show(Evento evento) {
		this.evento.setDuracion(evento.getDuracion());
		this.evento.setFecha(evento.getFecha());
		this.evento.setTipoEntrada(evento.getTipoEntrada());
		this.evento.setTipoEvento(evento.getTipoEvento());
		this.evento.setTitulo(evento.getTitulo());
		this.evento.setValor(evento.getValor());
		this.evento.setIdentrada(evento.getIdentrada());
		this.evento.setIdEvento(evento.getIdEvento());
	}

	// METODOS


