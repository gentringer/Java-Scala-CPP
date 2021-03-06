package informatique;

import graphe.Arete;
import graphe.Graphe;
import graphe.Sommet;

public class Reseau extends Graphe{

	
	public Reseau(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addSommet(Sommet sommet){
		if(sommet instanceof Noed){
		this.ensembleSommets.add(sommet);
		
		System.out.println("Ajout du sommet ok");
		}
		else
		{
			System.err.println("Sommet n'est pas un instance d'Atome");
		}
	}
	
	@Override
	public void addArete(Arete arete)
	{
		System.out.println("add arrete dans molecule");
		if(arete instanceof Lien){
			System.out.println("arete ok");
		if(ensembleSommets.isEmpty())
		{
			System.err.println("Le graphe ne comporte pas de sommets");
		}
		//if((arete.getSommet1().getGraphe() == this) && (arete.getSommet2().getGraphe() == this))
		if((this.ensembleSommets.contains(arete.getSommet1()) && this.ensembleSommets.contains(arete.getSommet2())))
		{
			System.out.println("L'arrete a les memes sommets que le graphe dans molecule");
			ensembleAretes.add(arete);
			arete.setGraphe(this);
		}
		else
		{
			System.err.println("Le graphe n'a pas les meme sommets que l'arrete dans molecule");
		}
		}
		else{
			System.err.println("Pas insnace de liaison");
			
		}
	}
	
	@Override
	public void createArete(Sommet sommet1, Sommet sommet2)
	{
		if(sommet1 instanceof Noed && sommet1 instanceof Noed){
		if((sommet1 != null) && (sommet2 != null))
		{
			Arete arete = new Arete(sommet1,sommet2);
			this.addArete(arete);
			System.out.println("Arete a été créé avec succès");
		}
		else
		{
			System.err.println("ARete n'a pas pu être créé car un des sommets est null");
		}
		}
		else{
			System.out.println("Erreur de type");
		}
	
	}

}
