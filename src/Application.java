
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		//class met hoofdletter, variabelen metkleine letter, object ook met hoofdletter, filenaam ook met hoofdletter
		//class is blauwdruk, object is de inhoud
		//met new kan je een nieuw product object aanmaken
			Product product1 = new Product();
			Product product2 = new Product();
			
			//aanpassen van de gegevens van product 1
			//product1.name = "TV";
			//product1.price = 123.50;
			product1.printPrice();
			product1.setPrice(250);
			
			//aanpassen van de gegevens van product 2
			//product2.name = "Laptop";
			//product2.price = 850;
			product2.printPrice();
			product2.setPrice(920.50);
			
			//System.out.println("Product 2 prijs is " + product2.price);
			
			boolean outcome = product2.isExpensive();
			System.out.println("product 2  duur: " + outcome);
			
			Product product3 = new Product(34.75);
			System.out.println("Product 3prijs is " + product3.getPrice);
			
			
			
			
			
			Dier kat = new Dier();
			Dier hond = new Dier();
			
			kat.naam = "Milo";
			kat.leeftijd = 3;
			kat.kleur = "zwart";
			kat.levend = true;
			kat.man = false;
			kat.printDetails();
			kat.setNaam("Milo2");
			
			hond.naam = "Riki";
			hond.leeftijd = 1;
			hond.kleur = "rood";
			hond.levend = true;
			hond.man = true;
			hond.printDetails();
			
			System.out.println("De nieuwe naam van Milo is " + kat.naam);
			
			
			System.out.println("Dier naam " + hond.getNaam());
			
			String outcome2 = hond.getNaam();
			System.out.println("Dier naam " + outcome2);
			
			Dier egel = new Dier("Dirk", 15, "bruin", false, false);
			System.out.println("Nieuw dier constructor is " + egel.getNaam() + ", " + egel.getLeeftijd());
			egel.printDetails();
			
	}

}
