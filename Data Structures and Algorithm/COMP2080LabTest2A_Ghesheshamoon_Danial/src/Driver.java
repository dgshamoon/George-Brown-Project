import linkedList.LInkedListClass;
import linkedList.LinkedListNode;

/*
 * course code: comp2080
 * student id:101041512
 * last name:gheshe shamoon
 * first name: danial
 */

public class Driver {

	public static void main(String[] args) {
		LinkedListNode<Integer> listNode=new LinkedListNode<Integer>(3, new LinkedListNode<>(4, new LinkedListNode<>(5, new LinkedListNode<>(2, null))));
		LInkedListClass class1=new LInkedListClass(listNode);
		class1.removeInvalidPares();
		LinkedListNode<Integer> temp=listNode;
		while(temp!=null){
			System.out.println(temp.getData());
			temp=(LinkedListNode<Integer>) temp.getNext();
		}
	}

}
