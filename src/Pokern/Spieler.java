package Pokern;
import java.util.ArrayList;

public class Spieler {
	String name;
	long geld;
	boolean isAllIn = false;
	ArrayList<Karte> handKarten = new ArrayList<>();

	public Spieler(String Name/*, long geld*/){
		this.name = Name;
		//this.geld = geld;
	}
	public Spieler(){}

	//KARTEN############################################################################################################
	public void bekommeKarte(Karte karte){
		handKarten.add(karte);
	}
	//ENDE_KARTEN#######################################################################################################

	//SPIELER###########################################################################################################
	public String getSpielerName(){
		return name;
	}
	//ENDE_SPIELER######################################################################################################

	//GELD##############################################################################################################
	public void setGeld(long geld){
		this.geld = geld;
	}
	//geld--------------------------------------------------------------------------------------------------------------
	public void bekommeGeld(long Gewinn){
		geld = geld + Gewinn;
	}
	//geld--------------------------------------------------------------------------------------------------------------
	public void verliereGeld(long Verlust){
		geld = geld - Verlust;
	}
	//geld--------------------------------------------------------------------------------------------------------------
	public long wieVielGeld(){
		return geld;
	}
	//ENDE_GELD#########################################################################################################

	//ALLIN#############################################################################################################
	public void setAllInZuIstAllIn(){
		isAllIn = true;
	}
	//allin-------------------------------------------------------------------------------------------------------------
	public  void setAllInZuIstNichtAllIn(){
		isAllIn = false;
	}
	//allin-------------------------------------------------------------------------------------------------------------
	public boolean getIsAllIn(){
		return isAllIn;
	}
	//ENDE_ALLIN########################################################################################################
}
