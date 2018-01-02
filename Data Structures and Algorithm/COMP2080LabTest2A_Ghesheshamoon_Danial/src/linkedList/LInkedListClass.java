/*
 * course code: comp2080
 * student id:101041512
 * last name:gheshe shamoon
 * first name: danial
 */

package linkedList;



public class LInkedListClass {
	private LinkedListNode<Integer> myListNode;
	public LInkedListClass(LinkedListNode<Integer> list){
		this.myListNode=list;
	}
	public void removeInvalidPares() {
		LinkedListNode<Integer> head=myListNode;
		LinkedListNode<Integer> firstNode=myListNode;
		LinkedListNode<Integer> secondNode=(LinkedListNode<Integer>) myListNode.getNext();
		while((int)head.getData()>(int)head.getNext().getData()){
			
		
		head=(LinkedListNode<Integer>) head.getNext().getNext();
		}
		LinkedListNode<Integer> check=(LinkedListNode<Integer>) head.getNext();
		
		while (check.getNext()!=null) {
			if((int)check.getNext().getData()>(int)check.getNext().getNext().getData()){
				
			
			check.setNext((LinkedListNode<Integer>) check.getNext().getNext().getNext());
			}
			else{
				check=(LinkedListNode<Integer>) check.getNext().getNext();
			}
		}
		
	}

}
