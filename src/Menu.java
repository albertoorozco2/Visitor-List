
public class Menu {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList listCandidates = new LinkedList();
		listCandidates.insertCandidate(145,"1juan", "perez", "today", "100", false, false);
		listCandidates.insertCandidate(145,"2juan", "perez", "today", "100", false, false);
		listCandidates.insertCandidate(145,"3juan", "perez", "today", "100", false, false);
		listCandidates.insertCandidate(145,"4juan", "perez", "today", "100", false, false);
		listCandidates.insertCandidate(145,"5juan", "perez", "today", "100", false, false);
		listCandidates.insertCandidate(145,"6juan", "perez", "today", "100", false, false);
		listCandidates.insertCandidate(145,"7juan", "perez", "today", "100", false, false);
		listCandidates.insertCandidate(145,"8juan", "perez", "today", "100", false, false);
		listCandidates.insertCandidate(145,"9juan", "perez", "today", "100", false, false);
		listCandidates.insertCandidate(145,"10juan", "perez", "today", "100", true, false);
		listCandidates.insertCandidate(145,"11juan", "perez", "today", "100", false, true, 3);
		listCandidates.display();
//		listCandidates.removeFirstCandidate();
//		listCandidates.display();
		listCandidates.removeCandidate(477);
//		listCandidates.removeCandidate(3);
		listCandidates.cutoffCandidates(3);
		listCandidates.display();

	}

}



//public class Menu {
//
//	public static void main(String[] args) {
//		
//
//		System.out.println("Value of first in LinkedList " + theLinkedList.firstLink + "\n");
//		
//		// Removes the last Link entered
//		
//		theLinkedList.removeFirst();
//		
//		theLinkedList.display();
//		
//		System.out.println(theLinkedList.find("The Lord of the Rings").bookName + " Was Found");
//		
//		theLinkedList.removeLink("A Tale of Two Cities");
//		
//		System.out.println("\nA Tale of Two Cities Removed\n");
//		
//		theLinkedList.display();
//		
//	}
//
//}
