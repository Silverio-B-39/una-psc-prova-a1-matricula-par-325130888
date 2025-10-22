package ProvaPar;

//Silvério Benfica da Silva - matricula: 325130888

public class ArattaiGrowthTracker {

	public static void main(String[] args) {

		String[] diasDaSemana = { "Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sab" };

		int[] downloadsDiarios = { 850000, 1050000, 1100000, 950000, 1200000, 1000000, 850000 };

		int totalDownloads = 0;

		for (int downloads : downloadsDiarios) {
			totalDownloads += downloads;
		}

		System.out.printf("Total de Downloads da Semana: %,d%n", totalDownloads);

		int picoDownloads = downloadsDiarios[0];
		String diaPico = diasDaSemana[0];

		int minimoDownloads = downloadsDiarios[0];
		String diaMinimo = diasDaSemana[0];

		for (int i = 0; i < downloadsDiarios.length; i++) {
			int downloadsDoDia = downloadsDiarios[i];
			String dia = diasDaSemana[i];

			if (downloadsDoDia > picoDownloads) {
				picoDownloads = downloadsDoDia;
				diaPico = dia;
			}

			if (downloadsDoDia < minimoDownloads) {
				minimoDownloads = downloadsDoDia;
				diaMinimo = dia;
			}
		}

		System.out.printf("Dia de Pico de Downloads: %s com %,d downloads.%n", diaPico, picoDownloads);

		System.out.printf("Dia de Mínimo de Downloads: %s com %,d downloads.%n", diaMinimo, minimoDownloads);

		final int META_DIARIA = 1000000;

		int diasAcimaDaMeta = 0;

		for (int i = 0; i < downloadsDiarios.length; i++) {
			int downloadsDoDia = downloadsDiarios[i];
			String dia = diasDaSemana[i];

			if (downloadsDoDia > META_DIARIA) {
				diasAcimaDaMeta++;
				System.out.printf(" %s: SUCESSO! (%,d downloads)%n", dia, downloadsDoDia);
			} else {

				System.out.printf(" %s: Não atingiu. (%,d downloads)%n", dia, downloadsDoDia);
			}
		}

		System.out.println(" O Arattai superou a meta diária em " + diasAcimaDaMeta + " dias esta semana.");

	}
}