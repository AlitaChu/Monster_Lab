package application;

import Models.Monsters.Aberations.Aboleth;
import Models.Monsters.Aberations.Chuul;
import Models.Monsters.Aberations.Strangler;
import Models.Monsters.Humanoids.Lizardman;
import Models.Monsters.Humanoids.Mermaid;
import Models.Monsters.Humanoids.Moth;
import Models.Monsters.Humanoids.Sahuagin;
import Models.Monsters.Magicals.Electriclizard;
import Models.Monsters.Magicals.Kraken;
import Models.Monsters.Muds.Blackpudding;
import Models.Monsters.Muds.Ocherjelly;
import Models.Monsters.Muds.Shoggoth;
import Models.Monsters.Outsides.Hiddentracker;
import Models.Monsters.Outsides.Shadowdaemon;
import Models.Monsters.Plants.Flytrap;
import Models.Monsters.Plants.Knoll;
import Models.Monsters.Plants.Liana;
import Models.Monsters.Plants.Yellowmold;
import Models.Monsters.Vermins.Leech;
import Models.Monsters.Vermins.Strige;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		/*
		 * try { BorderPane root = new BorderPane(); Scene scene = new
		 * Scene(root,400,400);
		 * scene.getStylesheets().add(getClass().getResource("application.css").
		 * toExternalForm()); primaryStage.setScene(scene); primaryStage.show(); }
		 * catch(Exception e) { e.printStackTrace(); }
		 */
	}

	public static void main(String[] args) {
		load();
		// launch(args);
	}

	public static void load() {
		// ------- Abérations ---------
		Aboleth aboleth = new Aboleth("Nom");
		System.out.println(aboleth);
		Chuul chuul = new Chuul("Nom");
		System.out.println(chuul);
		Strangler etrangleur = new Strangler("Nom");
		System.out.println(etrangleur);
		// ------- Humanoides ---------
		Lizardman hommelezard = new Lizardman("Nom");
		System.out.println(hommelezard);
		Mermaid poisson = new Mermaid("Nom");
		System.out.println(poisson);
		Moth mite = new Moth("Nom");
		System.out.println(mite);
		Sahuagin sahuagin = new Sahuagin("Nom");
		System.out.println(sahuagin);
		// ------- Créatures magiques ---------
		Electriclizard lizard = new Electriclizard("Nom");
		System.out.println(lizard);
		Kraken kraken = new Kraken("Nom");
		System.out.println(kraken);
		// ------- Vases ---------
		Blackpudding pouding = new Blackpudding("Pouding Noir");
		System.out.println(pouding);
		Ocherjelly gelee = new Ocherjelly("Marmelade d'électrons");
		System.out.println(gelee);
		Shoggoth shoggy = new Shoggoth("Shoggy");
		System.out.println(shoggy);
		// ------- Extérieurs ---------
		Hiddentracker traqueur = new Hiddentracker("Nom");
		System.out.println(traqueur);
		Shadowdaemon demon = new Shadowdaemon("Nom");
		System.out.println(demon);
		// ------- Plantes ---------
		Flytrap attmouche = new Flytrap("Mange-Mouche");
		System.out.println(attmouche);
		Knoll tertre = new Knoll("Kompost");
		System.out.println(tertre);
		Liana liane = new Liana("Jian");
		System.out.println(liane);
		Yellowmold moisi = new Yellowmold("Lili");
		System.out.println(moisi);
		// ------- Vermines ---------
		Leech sangsue = new Leech("Nom");
		System.out.println(sangsue);
		Strige strige = new Strige("Nom");
		System.out.println(strige);

	}
}
