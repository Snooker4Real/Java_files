package fr.jonathan.programme;
public class main1 {

	public static void main(String[] args) {
		
/*
// Affichage du nom & prenom avec son age (concaténation)
		String prenom = "Taha";
		String nom = "JAMAL EDDINE";
		int age = 20;
		System.out.println(nom + ' ' + prenom + " a " + age + " ans" );
		
		
// Calcul d'une moyenne
		
		double note1 = 10.0;
		double note2 = 18.5;
		double note3 = 15.25;
		
		double calcul = (note1+note2+note3)/3;
		
		System.out.println("La moyenne de "+ nom + ' ' + prenom + " est de " + calcul);
		
// Condition if
		
		if (age < 18) {
			System.out.println(nom + ' ' +prenom + " est mineure");
		} else if (age > 18) {
			System.out.println(nom + ' ' + prenom + " est majeure");
		} else {
			System.out.println(nom + ' ' + prenom + " vient d'avoir la majorité");
		}
		
		
// Switch-case-break : if pour le cas par cas
		switch(age) {
		
		case 18:
			System.out.println("La personne à 18 ans");
		break;
		
		case 17:
			System.out.println("La personne à 17 ans");
		break;
		
		case 21:
			System.out.println("La personne à 21 ans");
		break;
		
		case 20:
			System.out.println("La personne a 20 ans");
		
		default: System.out.println("Cet age n'a pas de message");
		
		}
		
// Variables boolean
		
		double wallet = 1000.0;
		double phonePrice = 750.0;
		boolean hasPhone = false;
		
		if (wallet > phonePrice && hasPhone) {
			System.out.println("Tu peux acheter ce téléphone");
		} else {
			System.out.println("Tu ne peux pas acheter ce tel");
		}
		
		
// Les tableaux
		
		String [] names = new String[] {"Jonathan", "jonathan", "Fabio"};
		System.out.println(names[0]);
	
		if (names[0].equalsIgnoreCase(names[1])) {
			System.out.println("Ce sont les mêmes");
		} else {
			System.out.println("Ce ne sont pas les mêmes");
		}

		
		System.out.println("Bonjour!");
		*/
		Account myAccount = new Account("Jonathan", 100, '€');
		myAccount.showBalance();
		
		Account otherAccount = new Account("Bob", 10, '€');
		otherAccount.showBalance();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
