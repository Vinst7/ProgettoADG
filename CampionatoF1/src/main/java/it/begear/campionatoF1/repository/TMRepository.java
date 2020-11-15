package it.begear.campionatoF1.repository;

import java.util.ArrayList;
import java.util.List;

import it.begear.campionatoF1.model.Ingegneri;
import it.begear.campionatoF1.model.Meccanici;
import it.begear.campionatoF1.model.Piloti;
import it.begear.campionatoF1.model.Scuderia;
import it.begear.campionatoF1.model.Teammanager;
import it.begear.campionatoF1.utils.ScannerClass;

public class TMRepository {
	private static List<Ingegneri> listaIngegneri = new ArrayList<Ingegneri>();
	private static List<Piloti> listaPiloti = new ArrayList<Piloti>();
	private static List<Meccanici> listaMecc = new ArrayList<Meccanici>();
	private static List<Scuderia> listScud = new ArrayList<Scuderia>();
	private static List<Teammanager> listTm = new ArrayList<Teammanager>();
	private static List<Piloti> lineup = new ArrayList<Piloti>();

	public TMRepository() {
		// TODO Auto-generated constructor stub
	}

	public static List<Ingegneri> getListaIngegneri() {
		return listaIngegneri;
	}

	public static void setListaIngegneri(List<Ingegneri> listaIngegneri) {
		TMRepository.listaIngegneri = listaIngegneri;
	}

	public static List<Piloti> getListaPiloti() {
		return listaPiloti;
	}

	public static void setListaPiloti(List<Piloti> listaPiloti) {
		TMRepository.listaPiloti = listaPiloti;
	}

	public static List<Meccanici> getListaMecc() {
		return listaMecc;
	}

	public static void setListaMecc(List<Meccanici> listaMecc) {
		TMRepository.listaMecc = listaMecc;
	}

	public static List<Piloti> getLineup() {
		return lineup;
	}

	public static void setLineup(List<Piloti> lineup) {
		TMRepository.lineup = lineup;
	}

	public static List<Scuderia> getListScud() {
		return listScud;
	}

	public static void setListScud(List<Scuderia> listScud) {
		TMRepository.listScud = listScud;
	}

	public static List<Teammanager> getListTm() {
		return listTm;
	}

	public static void setListTm(List<Teammanager> listTm) {
		TMRepository.listTm = listTm;
	}

	public static void ComposizioneTeam() {
		System.out.println("Inserisci id Pilota ");
		int idp = ScannerClass.inserisciIntero();
		System.out.println("Inserisci nome Scuderia");
		String nomeScuderia = ScannerClass.inserisciStringa();
		for (Piloti piloti : listaPiloti) {
			if (piloti.getId() == idp) {
				for (Scuderia scu : listScud) {
					if (scu.getNome().compareToIgnoreCase(nomeScuderia) == 0) {
						System.out.println(
								"TEAM DELLA SCUDERIA: " + scu.getNome() + "DEL PILOTA : " + piloti.getCognome() + "\n");
						List<Ingegneri> listIngCorsa = new ArrayList<Ingegneri>();
						List<Meccanici> listMeccCorsa = new ArrayList<Meccanici>();
						int j = 0;
						int z = 0;

						System.out.println("INGEGNERI:");
						while (j < 3) {
							int random = (int) (Math.random() * 12);
							if (scu.getIdScuderia() == listaIngegneri.get(random).getIdScuderia()) {
								if (listIngCorsa.contains(listaIngegneri.get(random))) {
									// non aggiung;
								} else {
									listIngCorsa.add(listaIngegneri.get(random));
									j++;
								}
							}
						}
						for (Ingegneri ing : listIngCorsa) {
							System.out.println(ing);
						}

						System.out.println("MECCANICI:");
						while (z < 5) {
							int random = (int) (Math.random() * 20);
							if (scu.getIdScuderia() == listaMecc.get(random).getIdScuderia()) {
								if (listMeccCorsa.contains(listaMecc.get(random))) {
									// non aggiung;
								} else {
									listMeccCorsa.add(listaMecc.get(random));
									z++;
								}
							}
						}
						for (Meccanici mecc : listMeccCorsa) {
							System.out.println(mecc);
						}

					}
				}
			}
		}
	}

	public static void lineUpPiloti() {
		System.out.println("Inserisci nome scuderia ");
		String nomeScuderia = ScannerClass.inserisciStringa();
				System.out.println("LINE UP SCUDERIA " + nomeScuderia + "\n");
				for (int i = 0; i < 2; i++) {
					System.out.println("Inserisci id del pilota");
					try {
						int j = ScannerClass.inserisciIntero();
						for (Piloti piloti : listaPiloti) {
							for (Scuderia scu : listScud) {
								if (scu.getNome().compareToIgnoreCase(nomeScuderia) == 0) {
							if (piloti.getId() == j && piloti.getIdScuderia() == scu.getIdScuderia()) {
								lineup.add(listaPiloti.get(piloti.getId()));
							}
						}
						}
						}
					}catch (IndexOutOfBoundsException e) {
						System.out.println("ERRORE INDICE INESISTENTE!");
						lineUpPiloti();

					} catch (Exception exc) {
						exc.printStackTrace();
					}

					
		}
				for (Piloti piloti : lineup) {
					System.out.println(piloti);
				}
	}

	public static void ScadenzaCont() {
		List<Piloti> pilotiMondiale = new ArrayList<Piloti>();
		for (int i = 0; i < listaPiloti.size(); i++) {
			for (int k = 0; k < lineup.size(); k++) {
				if (listaPiloti.get(i).getCognome().compareToIgnoreCase(lineup.get(k).getCognome()) == 0) {
					Piloti p = listaPiloti.get(i);
					pilotiMondiale.add(p);

				}

			}

		}
		System.out.println("i Piloti e la loro scadenza");
		for (Piloti piloti : pilotiMondiale) {
			System.out.println(piloti.getNome() + " " + piloti.getCognome() + " " + piloti.getDurataContratto());
		}

	}

	public static void MondTecn() {

		for (Meccanici mecc : listaMecc) {
			System.out.println(mecc);
		}

		for (Ingegneri ing : listaIngegneri) {
			System.out.println(ing);
		}
	}

}
