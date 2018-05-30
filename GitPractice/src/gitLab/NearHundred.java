package gitLab;

public class NearHundred {
	public boolean nearHundred(int n) {
		  int ten = Math.abs(100-n);
		  int secondTen = Math.abs(200-n);
		  
		  if(ten <= 10 || secondTen <=10){
		    return true;
		  }
		  
		  else{
		    return false;
		  }
		  
		}
}
