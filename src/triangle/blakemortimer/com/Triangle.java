package triangle.blakemortimer.com;

// commentaire de stephan pour git

public class Triangle {

	private double a, b, c;

	// Constructeur
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
				
	}

	public boolean isEquilateral() {
		if ((a==b) && (b==c)) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	public boolean isIsocele() {
		if ((a==b) || (a==c) || (b==c)) {
			return true;
		}
		else {
			return false;
		}
	}	

	public boolean isRectangle() {
			if ((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) || (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) || (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2))) {
				return true;
			}
			else {
				return false;
			}
	}
	
	public double perimetre() {
		return a+b+c;
	}
	
	public String toString() {
		if (this.isEquilateral()) {
			return "Le triangle est équilatéral. \nSon périmètre est : ";
		}
		else if (this.isIsocele()) {
			return "Le triangle est isocèle. \nSon périmètre est :";
		}
		else if (this.isRectangle()) {
			return "Le triangle est rectangle. \nSon périmètre est :";
		}
		else {
			return "Le triangle est quelconque. \nSon périmètre est :";
		}
	}
}
