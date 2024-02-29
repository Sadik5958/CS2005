// GRPA-2
import java.util.*;

interface Iterator {
  public boolean has_next();

  public Object get_next();
}

class Sequence {
  private final int maxLimit = 80;
  private SeqIterator _iter = null;
  int[] iArr;
  int size;
  // implement the parameterized constructor to initialize size
	public Sequence(int capacity) {
		iArr = new int[capacity];
			size = 0;
	}

  // implement addTo(elem) to add an int elem to the sequence
	public void addTo(int elem) {
		if (size < iArr.length) {
			iArr[size++] = elem;
		} else {
			System.out.println("Sequence is full");
		}
	}

  // implement get_Iterator() to return Iterator object
	public Iterator get_Iterator() {
		if (_iter == null) {
			_iter = new SeqIterator();
		}
		return _iter;
	}

  private class SeqIterator implements Iterator {
    int indx;

    public SeqIterator() {
      indx = -1;
    }
    // implement has_next()
		public boolean has_next() {
			return indx < size - 1;
		}
    // implement get_next()
		public Object get_next() {
			if (has_next()) {
				return iArr[++indx];
			}  else {
				return null;
			}
		}
  }
}

class FClass {
  public static void main(String[] args) {
    Sequence sObj = new Sequence(5);
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      sObj.addTo(sc.nextInt());
    }
    Iterator i = sObj.get_Iterator();
    while (i.has_next())
      System.out.print(i.get_next() + ", ");
  }
}
