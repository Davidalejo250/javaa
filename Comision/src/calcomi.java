import java.util.*;
public class calcomi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  in = new Scanner(System.in);
		System.out.println("¿Cuanto Vendiste?:");
		long tuventa = in.nextLong();
		double comision = 0.0;
		if(tuventa < 1000) {
	    	  System.out.println("No hay comision");
	      }else if(tuventa>=1000 && tuventa<5000) {
	    	comision = tuventa * .10; 
	    	System.out.print("Su comisión es: ");
	    	System.out.print(comision);
	    	  
	      }else if(tuventa>=5000 && tuventa<10000) {
	    	  comision = tuventa * .20; 
	    	  System.out.print("Su comisión es: ");
	    	  System.out.print(comision);
	      }else if(tuventa >= 10000) {
	    	  comision = tuventa * .30; 
	    	  System.out.print("Su es: ");
	    	  System.out.print(comision);
	      }else {
	    	  System.out.print(" ingresa Una cantidad valida :");
	      }//if else
	     

	}
	}

