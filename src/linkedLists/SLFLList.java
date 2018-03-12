package linkedLists;
/**
 * Singly linked list with references to its first and its
 * last node. 
 * 
 * @author pirvos
 *
 */

import java.util.NoSuchElementException;

import linkedLists.LinkedList;

public class SLFLList<E> extends SLList<E>
{
	private SNode<E> first, last;   // reference to the first node and to the last node
	int length; 

	public SLFLList() {       // to create an empty list instance
		first = last = null; 
		length = 0; 
	}


	public void addFirstNode(Node<E> nuevo) {
		SNode<E> ns =  (SNode<E>) nuevo;

		if(first != null){
			ns.setNext(first);
		}

		first = ns;
		length++;

	}

	public void addNodeAfter(Node<E> target, Node<E> nuevo) {

		SNode<E> ts = (SNode<E>) target;
		SNode<E> ns = (SNode<E>) nuevo;
		SNode<E> ats = (SNode<E>) ts.getNext();

		if(length == 0){
			first = last = ns;
		}
		
		else{

			if(ts == first){
				ts.setNext(ns);
				ns.setNext(ats);
			}

			else if(ts == last){
				ts.setNext(ns);
				last = ns;
			}
		}
		length++;

	}

	public void addNodeBefore(Node<E> target, Node<E> nuevo) {
		SNode<E> ts = (SNode<E>) target;
		SNode<E> ns = (SNode<E>) nuevo;
		SNode<E> ats = (SNode<E>) ts.getNext();
		
		if(length == 0){
			first = last = ns;
		}
		
		

	}

	public Node<E> getFirstNode() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	public Node<E> getLastNode() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	public Node<E> getNodeAfter(Node<E> target) throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	public Node<E> getNodeBefore(Node<E> target)
			throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void removeNode(Node<E> target) {
		// TODO Auto-generated method stub

	}

	public Node<E> createNewNode() {
		return new SNode<E>();
	}

}
