/*
 * course code: comp2080
 * student id:101041512
 * last name:gheshe shamoon
 * first name: danial
 */
public class LabTestProblem1A {

	public static void main(String[] args) {
		LinkedListNode<Integer> nnn=new LinkedListNode(45, null);
		nnn.setNext(new LinkedListNode(15, null));
		nnn.getNext().setNext(new LinkedListNode(85, null));
		LinkedListNode temp=nnn;
		System.out.println("first list");
		while(temp!=null){
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
		
	
		LinkedListNode<Integer> sss=new LinkedListNode(108, null);
		sss.setNext(new LinkedListNode(105, null));
		sss.getNext().setNext(new LinkedListNode(805, null));
		 temp=sss;
		 System.out.println("second List");
		while(temp!=null){
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
		
		LinkedListNode result=LinkedList.append(nnn, sss);
		temp=result;
		 System.out.println("result");
		while(temp!=null){
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
	}

}
