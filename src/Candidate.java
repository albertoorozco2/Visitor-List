public class Candidate {
	
	public int candidateNumber;   //Candidate number
	public String candidateFirstName;  //Candidate firstName
	public String candidateLastName;  //Candidate last Name
	public String candidateArrivalDate;  //Candidate date
	public String candidatePassportNo; //Candidate passport name	
	public boolean kidLess3;      //if candidate has a kid less than 3 years
	public boolean kidLess1;      //if candidate has a kid less than 1 year
	public Candidate nextCandidate;         //next Candidate on the list
	public Candidate pastCandidate;         //next Candidate on the list
	
	//constructor to initialize the candidate class
	public Candidate( int candidateNumber, String candidateFirstName, String candidateLastName,  String candidateArrivalDate, String candidatePassportNo,  boolean kidLess3, boolean kidLess1 ) {
		this.candidateNumber = candidateNumber;
		this.candidateFirstName = candidateFirstName;
		this.candidateLastName =  candidateLastName;
		this.candidateArrivalDate = candidateArrivalDate;
		this.candidatePassportNo = candidatePassportNo;
		this.kidLess3 = kidLess3;
		this.kidLess1 = kidLess1;
	}
	// method to show on screen the details of the candidate
	public void showDetails(int position){
	
		System.out.printf("%9s | %-5s| %-15s| %-15s| %-15s| %-15s| %-10s| %-10s|", position, candidateNumber, candidateFirstName, candidateLastName, candidateArrivalDate, candidatePassportNo, kidLess3, kidLess1 );
	}
	
}
