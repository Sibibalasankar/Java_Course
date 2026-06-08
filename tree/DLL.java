
package tree;

public class DLL {
	int count = 0;
	private Node last;
	private Node first;
	
	DLL(){
		first=last=null;
	}
	public void print() {
		Node temp = first;
		if(first==null) {
			System.out.println("Empty");
		}else {
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	public void insert(int val) {
		Node newnode = new Node(val);
		count++;
		if(first==null) {
			first=last=newnode;
			return;
		}
		last.next=newnode;
		newnode.prev=last;
		last=newnode;
	}
	
	public void insertPosition(int val,int pos) {
		Node newnode = new Node(val);
		Node temp = first;
		for(int i=1;i<pos-1;i++) {
			temp = temp.next;
		}
		newnode.next = temp.next;
		temp.next = newnode;
	}
	
}