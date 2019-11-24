package com.example.demo;

import javax.swing.JOptionPane;

public class TicketsExpender {

	private static final String MENU_MESSAGE = "Ingrese el tipo de Ticket:\n1)Regalo\n2)Queja\n3)Abono a tarjeta\n4)Credito para compra\n0)Salir";
	private static final String OPERACIONES_MENU = "1)Crear\n2)Mostrar Siguiente\n3)Atender";

	enum TipoSolicitud {

		REGALO("R-", 1), QUEJA("Q-", 2), ABONO_TDD("A-", 3), CREDITO_COMPRA("C-", 4);

		private final String label;
		private final int valor;

		private TipoSolicitud(String label, int valor) {
			this.label = label;
			this.valor = valor;
		}

		public String getLabel() {
			return label;
		}

		public int getValor() {
			return valor;
		}

		public static TipoSolicitud valueFromInt(int value) {
			TipoSolicitud tipo = null;

			TipoSolicitud[] tipos = TipoSolicitud.values();

			for (int x = 0; x < tipos.length; x++) {
				if (tipos[x].valor == value) {
					tipo = tipos[x];
					break;
				}
			}

			if (tipo == null) {
				throw new RuntimeException("Tu opción es como Clarita. Es inválida.");
			}

			return tipo;
		}

	}

	static class Ticket {

		private final long folio;
		private final TipoSolicitud tipo;
		private Ticket ticketSiguiente;
		private Ticket ticketPrevio;

		public Ticket(long folio, TipoSolicitud tipo) {
			this(folio, tipo, null, null);
		}

		public Ticket(long folio, TipoSolicitud tipo, Ticket ticketSiguiente, Ticket ticketPrevio) {
			this.folio = folio;
			this.tipo = tipo;
			this.ticketSiguiente = ticketSiguiente;
			this.ticketPrevio = ticketPrevio;
		}

		public long getFolio() {
			return folio;
		}

		public TipoSolicitud getTipo() {
			return tipo;
		}

		public Ticket getTicketSiguiente() {
			return ticketSiguiente;
		}

		public void setTicketSiguiente(Ticket ticketSiguiente) {
			this.ticketSiguiente = ticketSiguiente;
		}

		public Ticket getTicketPrevio() {
			return ticketPrevio;
		}

		public void setTicketPrevio(Ticket ticketPrevio) {
			this.ticketPrevio = ticketPrevio;
		}

		@Override
		public boolean equals(Object obj) {
			boolean flag = false;
			if (obj != null) {
				if (obj == this) {
					flag = true;
				} else if (obj.getClass() == this.getClass()) {
					flag = folio == ((Ticket) obj).folio && tipo.equals(((Ticket) obj).tipo);
				}
			}
			return flag;
		}

		@Override
		public String toString() {
			return new StringBuilder().append(tipo.getLabel()).append(folio).toString();
		}

	}

	interface GeneralDataStore {
		void add(Ticket ticket);

		void dispatch();

		long getSize();

		long lastNumber();

		Ticket next();

		Ticket first();
	}

	static class Queue implements GeneralDataStore {

		private long size;
		private long index;
		private Ticket first;
		private Ticket last;

		public Queue() {
			size = 0l;
			index = 0l;
		}

		public void add(Ticket ticket) {
			if (size == 0) {
				first = last = ticket;
			} else {
				last.setTicketSiguiente(ticket);
				last = ticket;
			}
			size++;
			index++;
		}

		public void dispatch() {
			if (size > 0l) {
				Ticket next = first.getTicketSiguiente();
				first = next;
				size--;
			}
		}

		public long getSize() {
			return size;
		}

		@Override
		public Ticket next() {
			return last;
		}

		@Override
		public long lastNumber() {
			return index;
		}

		@Override
		public Ticket first() {
			return first;
		}

	}

	static class Stack implements GeneralDataStore {
		private long size;
		private Ticket first;
		private Ticket next;
		private long index;

		public Stack() {
			size = 0l;
			index = 0l;
		}

		public void add(Ticket ticket) {
			if (size == 0l) {
				first = ticket;
				next = ticket;
			} else {
				next.setTicketSiguiente(ticket);
				ticket.setTicketPrevio(next);
				next = ticket;
			}
			size++;
			index++;
		}

		public void dispatch() {
			if (size > 0l) {
				Ticket last = next.getTicketPrevio();
				last.setTicketSiguiente(null);
				next = last;
				size--;
			}
		}

		public long getSize() {
			return size;
		}

		@Override
		public Ticket next() {
			return next;
		}

		@Override
		public long lastNumber() {
			return index;
		}

		@Override
		public Ticket first() {
			return first;
		}

	}

	enum Operaciones {
		CREAR(1), MOSTRAR_SIGUIENTE(2), DESPACHAR(3);
		private final int op;

		private Operaciones(int op) {
			this.op = op;
		}

		public int getOp() {
			return op;
		}

		public static Operaciones fromIntValue(int op) {
			Operaciones operacion = null;
			Operaciones[] all = Operaciones.values();
			for (int x = 0; x < all.length; x++) {
				if (all[x].op == op) {
					operacion = all[x];
					break;
				}
			}
			if (operacion == null) {
				throw new RuntimeException("Tu opción es como Clarita. Es inválida.");
			}
			return operacion;
		}

	}

	public static void createTicket(GeneralDataStore store, TipoSolicitud tipo) {
		long number = 0l;
		if (tipo.equals(TipoSolicitud.REGALO)) {
			number = store.lastNumber() + 8;

		} else if (tipo.equals(TipoSolicitud.QUEJA)) {
			number = store.getSize() + 1;
		} else {
			number = store.lastNumber() + 1;
		}
		Ticket ticket = new Ticket(number, tipo);
		store.add(ticket);
		JOptionPane.showMessageDialog(null, "Ticket agregado: " + ticket.toString());
	}

	public static Ticket nextTicket(GeneralDataStore store) {
		return store.next();
	}

	public static void dispatchTicket(GeneralDataStore store) {
		Ticket ticket = store.next();
		int option = JOptionPane.showConfirmDialog(null, "Se atendera el Ticket " + ticket.toString(), "",
				JOptionPane.YES_NO_OPTION);
		if (option == JOptionPane.YES_OPTION) {
			store.dispatch();
		}
	}

	public static boolean exists(GeneralDataStore store, long folio) {
		boolean flag = false;
		Ticket ticket = store.first();
		flag = evaluate(ticket, folio);
		return flag;
	}

	public static boolean evaluate(Ticket ticket, long folio) {
		boolean flag = false;
		if (ticket != null) {
			if (ticket.getFolio() == folio) {
				flag = true;
			} else {
				flag = evaluate(ticket.getTicketSiguiente(), folio);
			}
		}
		return flag;
	}

	private static void operarColeccion(GeneralDataStore data, TipoSolicitud tipo) {
		String operacionInput = JOptionPane.showInputDialog(OPERACIONES_MENU);
		int operacion = Integer.parseInt(operacionInput);
		Operaciones operacionEnum = Operaciones.fromIntValue(operacion);
		switch (operacionEnum) {
		case CREAR:
			createTicket(data, tipo);
			printToConsole(data);
			break;
		case DESPACHAR:
			dispatchTicket(data);
			printToConsole(data);
			break;
		case MOSTRAR_SIGUIENTE:
			Ticket ticket = data.next();
			JOptionPane.showMessageDialog(null, "Ticket siguiente: " + ticket.toString());
			break;
		}
	}

	public static void main(String[] args) {
		GeneralDataStore quejas = new Stack();
		GeneralDataStore regalos = new Queue();
		GeneralDataStore abonos = new Queue();
		GeneralDataStore creditos = new Queue();

		int tipo = -1;

		while (tipo != 0) {
			String tipoInput = JOptionPane.showInputDialog(MENU_MESSAGE);
			TipoSolicitud tipoSolicitud = null;
			try {
				tipo = Integer.parseInt(tipoInput);
				if (tipo != 0) {
					tipoSolicitud = TipoSolicitud.valueFromInt(tipo);
					switch (tipoSolicitud) {
					case ABONO_TDD:
						operarColeccion(abonos, tipoSolicitud);
						break;
					case CREDITO_COMPRA:
						operarColeccion(creditos, tipoSolicitud);
						break;
					case QUEJA:
						operarColeccion(quejas, tipoSolicitud);
						break;
					case REGALO:
						operarColeccion(regalos, tipoSolicitud);
						break;

					}
				}

			} catch (NumberFormatException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Eran números, animal >:v", "Error", JOptionPane.ERROR_MESSAGE);
				tipo = -1;
			} catch (RuntimeException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				tipo = -1;
			}

		}
		System.exit(0);

	}

	public static void printToConsole(GeneralDataStore data) {
		System.out.println("===============================");
		printTicket(data.first());
		System.out.println("===============================");
	}

	public static void printTicket(Ticket ticket) {
		if (ticket != null) {
			System.out.println(ticket.toString());
			printTicket(ticket.getTicketSiguiente());
		}
	}

}
