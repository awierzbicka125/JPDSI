package com.jsfcourse.calc;

import javax.inject.Inject;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named
@RequestScoped
//@SessionScoped
public class kredytBB {
	private String Kwota;
	private String Miesiace;
	private String Oprocentowanie;
	private Double result;


	
	@Inject
	FacesContext ctx;
	

	

	public String getKwota() {
		return Kwota;
	}

	public void setKwota(String kwota) {
		Kwota = kwota;
	}

	public String getMiesiace() {
		return Miesiace;
	}

	public void setMiesiace(String miesiace) {
		Miesiace = miesiace;
	}

	public String getOprocentowanie() {
		return Oprocentowanie;
	}

	public void setOprocentowanie(String oprocentowanie) {
		Oprocentowanie = oprocentowanie;
	}

	public boolean doTheMath() {
		
			double Kwota = Double.parseDouble(this.Kwota);
			double Miesiace = Double.parseDouble(this.Miesiace);
			double Oprocentowanie = Double.parseDouble(this.Oprocentowanie);
			double Rata= Kwota/Miesiace;
			double Splata = 0;
			double Odsetki = 0;
			double Kapital = 0;
			double y=0;
			double Procent = Oprocentowanie/100;
			for(int x=0; x>=0;  x++) {
				
				if(Kwota-y<=0){ 
		            break;
				}
				
				Kapital= Kwota-y;
				Odsetki = Kapital* Procent;
				Splata = Odsetki/12 + Rata;
				y=Rata*x;
				x++;
				}
		
			double result = Splata;
				
			
		}
			
		
			
			

	public String calc() {
		if (doTheMath()) {
			return "showresult";
		}
		return null;
	}

	
	}