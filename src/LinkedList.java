
public class LinkedList {
	public Candidate firstCandidate;
	public Candidate lastCandidate;
	public int size;
	public LinkedList() {
		this.firstCandidate = null;
		this.lastCandidate = null;
		size = 0;
	}
	
	public boolean isEmpty() {
			return firstCandidate==null&&lastCandidate==null;
	}
	
	
	public void insertCandidate( int candidateNumber, String candidateFirstName, String candidateLastName,  String candidateArrivalDate, String candidatePassportNo,  boolean kidLess3, boolean kidLess1 ) {
		Candidate newCandidate = new Candidate(candidateNumber,  candidateFirstName,  candidateLastName, candidateArrivalDate, candidatePassportNo, kidLess3, kidLess1 );
		if(firstCandidate==null&&lastCandidate==null) {
			lastCandidate = newCandidate;
			firstCandidate = newCandidate;
			newCandidate.nextCandidate = null;
			newCandidate.pastCandidate = null;
		}else if(kidLess1==true) {
			firstCandidate.pastCandidate =  newCandidate;
			newCandidate.nextCandidate = firstCandidate;
			firstCandidate = newCandidate;
		}else if(kidLess3==true&&size>2) {
			Candidate tempNextCandidate = firstCandidate;
			Candidate tempPastCandidate = firstCandidate;

			for(int i = 0; i<=(size/2)-1; i++) {
				tempPastCandidate = tempNextCandidate;
				tempNextCandidate = tempNextCandidate.nextCandidate;
			}

			newCandidate.nextCandidate = tempNextCandidate;
			newCandidate.pastCandidate = tempNextCandidate.pastCandidate;
			tempNextCandidate.pastCandidate = newCandidate;
			tempPastCandidate.nextCandidate = newCandidate;
			
			System.out.println("dsddfsdf");
			System.out.println(size/2);
		} else {
			lastCandidate.nextCandidate = newCandidate;
			newCandidate.pastCandidate = lastCandidate;
			lastCandidate = newCandidate;
		}		  
		size++;
	}
	
	public void insertCandidate( int candidateNumber, String candidateFirstName, String candidateLastName,  String candidateArrivalDate, String candidatePassportNo,  boolean kidLess3, boolean kidLess1, int position ) {
		Candidate newCandidate = new Candidate(candidateNumber,  candidateFirstName,  candidateLastName, candidateArrivalDate, candidatePassportNo, kidLess3, kidLess1 );
			if(size>=position) {
			Candidate tempNextCandidate = firstCandidate;
			Candidate tempPastCandidate = firstCandidate;

			for(int i = 0; i<(position-1); i++) {
				tempPastCandidate = tempNextCandidate;
				tempNextCandidate = tempNextCandidate.nextCandidate;
			}

			newCandidate.nextCandidate = tempNextCandidate;
			newCandidate.pastCandidate = tempNextCandidate.pastCandidate;
			tempNextCandidate.pastCandidate = newCandidate;
			tempPastCandidate.nextCandidate = newCandidate;
			} else {
			lastCandidate.nextCandidate = newCandidate;
			newCandidate.pastCandidate = lastCandidate;
			lastCandidate = newCandidate;
			}		  
		size++;
	}
	
	public void removeFirstCandidate() {
		
		Candidate tempCandidate = firstCandidate;
		
		if(isEmpty() ==false) {
			firstCandidate = firstCandidate.nextCandidate;
			firstCandidate.pastCandidate =null;
			size--;
		}else {
			System.out.println("No Candidates in the List");
		}
		
	}


public void display() {
	String vl = 	"\n_______________________________________________________________________________________________________________\n";

	int position = 1;
	System.out.print(vl+"Candidate Details and Total of Candidates in the list " + size +vl );
	System.out.printf("%9s | %-5s| %-15s| %-15s| %-15s| %-15s| %-10s| %-10s|", "Position","ID", "FirstName","LastName","Arrival Date","Passport Number", "Kid <3yo", "Kid <1yo");
	System.out.print(vl);
	Candidate tempCandidate = firstCandidate;
	while(tempCandidate!=null) {
		System.out.println();
		tempCandidate.showDetails(position); 
		tempCandidate = tempCandidate.nextCandidate;
		position++;
	}
	System.out.println(vl);

}

public Candidate find(int candidateNumber) {

	Candidate tempCandidate = firstCandidate;
	boolean found = false;
	int position = 1;
	
	if(isEmpty() ==false) {
		
		while(tempCandidate!=null&&found==false) {
			if(tempCandidate.candidateNumber == candidateNumber) {
				found = true;
				tempCandidate.showDetails(position);

			}else {
			
				tempCandidate = tempCandidate.nextCandidate;
				position++;
			}
	
		}

	} else {
		System.out.println("No Candidate in the List");
	}
	
	
	return tempCandidate;
}

public Candidate removeCandidate(int candidateNumber) {
	
	Candidate currentCandidate = firstCandidate;
	Candidate previousCandidate = firstCandidate;
	while(currentCandidate.candidateNumber!= candidateNumber) {
		if(currentCandidate.nextCandidate==null) {
			return null;
		}else {
			previousCandidate = currentCandidate;
			currentCandidate = currentCandidate.nextCandidate;
		}
	}
	
	if(currentCandidate == firstCandidate) {
		firstCandidate = firstCandidate.nextCandidate; 
	}else {
		System.out.println("Found");
		previousCandidate.nextCandidate=currentCandidate.nextCandidate;
		currentCandidate.pastCandidate=previousCandidate;
	}
	size--;
	return currentCandidate;
	}


public void cutoffCandidates(int cutoff) {
	if(size>cutoff) {
		Candidate templastCandidate = lastCandidate;

		for(int i = 0; i<=(cutoff-1); i++) {
			templastCandidate = templastCandidate.pastCandidate;
		}

		templastCandidate.nextCandidate = null;
		size = size- cutoff;
	}		  
	
}


}
