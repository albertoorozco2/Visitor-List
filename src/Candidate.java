
/**
 * The class represents a Candidate for Link List for Immigration department.
 * The class includes constructor that requires the data to create the object
 * and methods to show details of the Candidate
 * 
 *
 * @author Pedro Alberto Duenas Orozco
 * @author Roberto Alejandro Rivera Mejia
 */

public class Candidate {

	public int candidateNumber; // Candidate number
	public String candidateFirstName; // Candidate firstName
	public String candidateLastName; // Candidate last Name
	public String candidateArrivalDate; // Candidate date
	public String candidatePassportNo; // Candidate passport name
	public boolean kidLess3; // if candidate has a kid less than 3 years
	public boolean kidLess1; // if candidate has a kid less than 1 year
	public Candidate nextCandidate; // next Candidate on the list
	public Candidate pastCandidate; // next Candidate on the list

	/**
	 * Candidate constructor create and insert a new candidate to the LinkedList
	 * 
	 * @param candidateNumber
	 *            integer ID of user
	 * @param candidateFirstName
	 *            String candidate first name
	 * @param candidateLastName
	 *            String candidate last name
	 * @param candidateArrivalDate
	 *            String arrival date of the candidate to the country
	 * @param candidatePassportNo
	 *            String passport number or code of the candidate
	 * @param kidLess3
	 *            boolean true if candidate has a kid less than 3 years old
	 * @param KidLess1
	 *            boolean true if candidate has a kid less than 1 years old
	 * 
	 */
	// constructor to initialize the candidate class
	public Candidate(int candidateNumber, String candidateFirstName, String candidateLastName,
			String candidateArrivalDate, String candidatePassportNo, boolean kidLess3, boolean kidLess1) {
		this.candidateNumber = candidateNumber;
		this.candidateFirstName = candidateFirstName;
		this.candidateLastName = candidateLastName;
		this.candidateArrivalDate = candidateArrivalDate;
		this.candidatePassportNo = candidatePassportNo;
		this.kidLess3 = kidLess3;
		this.kidLess1 = kidLess1;
	}

	/**
	 * showDetails method Print on screen a all the candidate details for a list
	 * view
	 * 
	 * @param position
	 *            position of the candidate in the list to be print as list
	 */
	public void showDetails(int position) {

		System.out.printf("%9s | %-5s| %-15s| %-15s| %-15s| %-15s| %-10s| %-10s|", position, candidateNumber,
				candidateFirstName, candidateLastName, candidateArrivalDate, candidatePassportNo, kidLess3, kidLess1);
	}

	/**
	 * showDetails method Print on screen a all the candidate details for a simple
	 * view
	 */
	public void showDetails() {

		System.out.printf("\nID number : " + candidateNumber + "\nfirst name : " + candidateFirstName + "\nlast name : "
				+ candidateLastName + "\n arrival date : " + candidateArrivalDate + "\npassport number : "
				+ candidatePassportNo + "\n Kid less than 3 yo : " + kidLess3 + "\n Kid less than 1 yo : " + kidLess1);
	}
}
