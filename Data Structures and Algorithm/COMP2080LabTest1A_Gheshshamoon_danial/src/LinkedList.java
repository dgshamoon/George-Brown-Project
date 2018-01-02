/*
 * course code: comp2080
 * student id:101041512
 * last name:gheshe shamoon
 * first name: danial
 */
public class LinkedList {

	public static LinkedListNode<?> append(LinkedListNode<?> l,LinkedListNode<?> m) {
		LinkedListNode<?> tempNode=new LinkedListNode(l.getData(), l.getNext());
		LinkedListNode<?> head=new LinkedListNode(l.getData(), l.getNext());
		LinkedListNode<?> p=head;
		while(tempNode.getNext()!=null){
			tempNode=tempNode.getNext();
			p.setNext(new LinkedListNode(tempNode.getData(), tempNode.getNext()));
			p=p.getNext();
		}
		tempNode=new LinkedListNode(m.getData(), m.getNext());
		while(tempNode.getNext()!=null){
			tempNode=tempNode.getNext();
			p.setNext(new LinkedListNode(tempNode.getData(), tempNode.getNext()));
			p=p.getNext();
		}
		return head;
	}
	 
}
class LinkedListNode<T>{
	 private LinkedListNode<?> next;
	 private T data;
	public LinkedListNode(T data,LinkedListNode<T> next) {
		this.data=data;
		this.next=next;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public LinkedListNode<?> getNext() {
		return next;
	}
	public void setNext(LinkedListNode<T> next) {
		this.next = next;
	}
}

