abstract class Sammenlignbar <E> {
	abstract int compareTo(E e);
	
	public class Node <E extends Comparable<E>> {
		E data;
		Node<E> venstre, h�yre;
	
		Node(E e) { data = e; }
	
		SettInnNyNode(Node nn) {
			int cmpt = data.compareTo(nn.data);
			if (cmpt < 0) { // data < nn, nn skal v�re mot h�yere
				if (h�yere = null) h�yere = nn;
				else h�yere.settInnNyNode(nn);
			}
		}
		class Person implements Comparable <Person> {
			int fdato;
			Person (int fd) fdato = fd;
			public int compareTo(Person p){
				return fdato - p.fdato;
			}
		}
	}
}