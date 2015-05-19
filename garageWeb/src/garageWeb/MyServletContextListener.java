package garageWeb;

import garageWeb.domein.Artikel;
import garageWeb.domein.Auto;
import garageWeb.domein.Bedrijfsleider;
import garageWeb.domein.Garage;
import garageWeb.domein.Klant;
import garageWeb.domein.Klus;
import garageWeb.domein.Monteur;
import garageWeb.domein.Parkeerplaats;
import garageWeb.domein.ReserveerKlus;
import garageWeb.domein.Reservering;

import java.io.*;
import java.time.LocalDate;

import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener {
	private boolean saved = false;
	
	public void contextInitialized(ServletContextEvent sce) {
		if(saved == false){
			resave();
		}
		//resave();
		
		Garage garage;
		try {
			FileInputStream fis = new FileInputStream("garage.obj");
			ObjectInputStream ois = new ObjectInputStream(fis);
			garage = (Garage) ois.readObject();
			sce.getServletContext().setAttribute("Garage_Object", garage);
			ois.close();
		} catch (IOException | ClassNotFoundException ioe) {
			ioe.printStackTrace();
		}

	}

	public void contextDestroyed(ServletContextEvent sce) {
		Object o = sce.getServletContext().getAttribute("Garage_Object");
		Garage garage  = (Garage) o;
		try {
			FileOutputStream fos = new FileOutputStream("garage.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(garage);
			oos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public void resave() {
		
		 Garage garage = new Garage("ATD", "Nijenoord 1");
		 
		 Parkeerplaats p = new Parkeerplaats(56);
		 garage.setDeParkeerplaats(p);
         
         // Artikelen
         garage.setArtikel(new Artikel("Euro 95", "Lorem ipsum dolor sit amet.", 'B', 120, 0.65));
         garage.setArtikel(new Artikel("Benzine", "Lorem ipsum dolor sit amet.", 'B', 231, 0.72));
         garage.setArtikel(new Artikel("LPG",     "Lorem ipsum dolor sit amet.", 'B', 583, 0.82));
         garage.setArtikel(new Artikel("Diesel",  "Lorem ipsum dolor sit amet.", 'B', 109, 0.35));
         
         garage.setArtikel(new Artikel("Banden",  "Lorem ipsum dolor sit amet.", 'O', 125, 55.99));
         garage.setArtikel(new Artikel("Ramen",  "Lorem ipsum dolor sit amet.", 'O', 222, 100));
         garage.setArtikel(new Artikel("Uitlaat",  "Lorem ipsum dolor sit amet.", 'O', 43, 35));
         garage.setArtikel(new Artikel("Stoelen",  "Lorem ipsum dolor sit amet.", 'O', 29, 29.99));
         
         garage.setDeBedrijfsleider(new Bedrijfsleider("Tristan Versteeg", "tristan", "kaas"));
         
        
         
         // Klanten & Auto's
         Klant klant1 = new Klant("Yanick van Barneveld", "Nijenoord 5", "yanick.vanbarneveld@student.hu.nl", "yanick", "yanick");
         Klant klant2 = new Klant("Tim van der Grift",    "Nijenoord 6", "tim.vandergrift@student.hu.nl", "tim", "tim");
         Klant klant3 = new Klant("Tristan Versteeg",     "Nijenoord 7", "tristan.versteeg@student.hu.nl", "tris", "kaas");
         Klant klant4 = new Klant("Severin Simic",        "Nijenoord 8", "severing.simic@student.hu.nl", "sev", "sev");
        
         Auto a1 = new Auto("Audi A4", "72-HRG-11");
        
         Auto a2 = new Auto("Volvo V70", "53-SJW-02");
         Auto a3 = new Auto("Volkswagen Polo", "22-SJE-13");

         Auto a4 = new Auto("Lamborghini Galardo", "34-OIW-01");
         Auto a5 = new Auto("Volkswagen Transporter", "54-ASD-41");
         Auto a6 = new Auto("Volvo S60", "12-KSA-51");

         Auto a7 = new Auto("Mercedes SLS", "26-AJS-31");
         Auto a8 = new Auto("Volkswagen Golf GTI", "19-TAS-21");
         Auto a9 = new Auto("Audi R8", "23-JAS-31");
         Auto a0 = new Auto("Ford GT40", "77-FD-21");
        
         klant1.setAuto(a1);
        
         klant2.setAuto(a2);
         klant2.setAuto(a3);
        
         klant3.setAuto(a4);
         klant3.setAuto(a5);
         klant3.setAuto(a6);
        
         klant4.setAuto(a7);
         klant4.setAuto(a8);
         klant4.setAuto(a9);
         klant4.setAuto(a0);
        
         garage.setKlant(klant1);
         garage.setKlant(klant2);
         garage.setKlant(klant3);
         garage.setKlant(klant4);
        
         // Monteuren
         Monteur m1 = new Monteur("Jopie", "Nijenoord 23", "jopie", "jopie");
         Monteur m2 = new Monteur("Berend", "Nijenoord 24", "berend", "berend");
                        
         garage.setMonteur(m1);
         garage.setMonteur(m2);
        
         // Klussen
         ReserveerKlus k1 = new ReserveerKlus(LocalDate.now(),"Banden vervangen");
         ReserveerKlus k2 = new ReserveerKlus(LocalDate.now(),"APK");
         ReserveerKlus k3 = new ReserveerKlus(LocalDate.now(),"Uitlaat vervangen");
         ReserveerKlus k4 = new ReserveerKlus(LocalDate.now(),"Nieuwe Versnellingsbak");
         ReserveerKlus k5 = new ReserveerKlus(LocalDate.now(),"Voorruit vervangen");
         ReserveerKlus k6 = new ReserveerKlus(LocalDate.now(), "Zuigers controleren");
                    
         a1.setReserveerKlus(k1);
         a2.setReserveerKlus(k2);
         a4.setReserveerKlus(k3);
         a5.setReserveerKlus(k4);
         a7.setReserveerKlus(k5);
         a0.setReserveerKlus(k6);
         
         Reservering r1 = new Reservering(LocalDate.now(), klant1);
         Reservering r2 = new Reservering(LocalDate.now(), klant2);
         Reservering r3 = new Reservering(LocalDate.now(), klant3);
         Reservering r4 = new Reservering(LocalDate.now(), klant4);
         Reservering r5 = new Reservering(LocalDate.now(), klant1);
         
         p.setReservering(r1);
         p.setReservering(r2);
         p.setReservering(r3);
         p.setReservering(r4);
         p.setReservering(r5);
         
         try {
 			FileOutputStream fos = new FileOutputStream("garage.obj");
 			ObjectOutputStream oos = new ObjectOutputStream(fos);
 			oos.writeObject(garage);
 			System.out.println("save successful");
 			saved = true;
 			oos.close();
 		} catch (IOException ioe) {
 			ioe.printStackTrace();
 		}
	}
	
	
}