
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
	
	
	public Candidate insertCandidate( int candidateNumber, String candidateFirstName, String candidateLastName,  String candidateArrivalDate, String candidatePassportNo,  boolean kidLess3, boolean kidLess1 ) {
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

		} else {
			lastCandidate.nextCandidate = newCandidate;
			newCandidate.pastCandidate = lastCandidate;
			lastCandidate = newCandidate;
		}		  
		size++;
		return newCandidate;
	}
	
	public Candidate insertCandidate( int candidateNumber, String candidateFirstName, String candidateLastName,  String candidateArrivalDate, String candidatePassportNo,  boolean kidLess3, boolean kidLess1, int position ) {
		Candidate newCandidate = new Candidate(candidateNumber,  candidateFirstName,  candidateLastName, candidateArrivalDate, candidatePassportNo, kidLess3, kidLess1 );
		if(firstCandidate==null&&lastCandidate==null) {
			lastCandidate = newCandidate;
			firstCandidate = newCandidate;
			newCandidate.nextCandidate = null;
			newCandidate.pastCandidate = null;
			}else if(size>=position) {
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
		return newCandidate;
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
	if(size==0) {	System.out.print("No candidates in the list." );}
	System.out.println(vl);

}

public Candidate findByID(int candidateNumber) {

	Candidate tempCandidate = firstCandidate;
	boolean found = false;
	int position = 1;
	
	if(isEmpty() ==false) {
		
		while(tempCandidate!=null&&found==false) {
			if(tempCandidate.candidateNumber == candidateNumber) {
				found = true;
				tempCandidate.showDetails();

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

public Candidate findByName(String candidateName) {

	Candidate tempCandidate = firstCandidate;
	boolean found = false;
	int position = 1;
	
	if(isEmpty() ==false) {
		
		while(tempCandidate!=null&&found==false) {
			if(tempCandidate.candidateFirstName.contains(candidateName)) {
				found = true;
				tempCandidate.showDetails();

			}else {
			
				tempCandidate = tempCandidate.nextCandidate;
				position++;
			}
	
		}

	} else {
		System.out.println("\n No Candidate in the list with name :" + candidateName );
	}
	
	
	return tempCandidate;
}

public Candidate removeCandidateByID(int candidateNumber) {
	
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
	System.out.println("Candidate removed. ");
	return currentCandidate;
	}

public void removeCandidateByPosition(int position) {
	if(position>size||position<=0) {
		System.out.println("No candidate at position "+position);
	} else {
	Candidate currentCandidate = firstCandidate;
	
	for(int i = 0; i<(position-1); i++) {
		currentCandidate = currentCandidate.nextCandidate;
	}
	removeCandidateByID(currentCandidate.candidateNumber);

	}
	}



public void cutoffCandidates(int cutoff) {
	if(size>cutoff) {
		Candidate templastCandidate = lastCandidate;

		for(int i = 0; i<=(cutoff-1); i++) {
			templastCandidate = templastCandidate.pastCandidate;
		}

		templastCandidate.nextCandidate = null;
		size = size- cutoff;
		System.out.println("Cut off of list completed");
	}else if(size==cutoff) {
		firstCandidate = null;
		lastCandidate = null;
		size = 0;
		System.out.println("Cut off of list completed");
	}else if(cutoff<0||size<cutoff) {
		System.out.println("Cut off needs number greater than 0 or smaller or equal to "+size);
		return;
	}		  
}
}
