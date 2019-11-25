package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	private T[] arr;
	public ArrayList() {
		arr = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return arr[loc];
	}
	
	public void add(T val) {
		T[] doo = (T[]) new Object[arr.length + 1];
		doo[doo.length - 1] = val;
		for(int i = 0; i < arr.length; i++) {
			doo[i] = arr[i];
		}
		arr = doo;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] ree = (T[]) new Object[arr.length + 1];
		for(int i = 0; i < ree.length; i++) { 
			if(i < loc) {
				ree[i] = arr[i];
			}
			else if(i > loc) {
				ree[i] = arr[i-1];
			}
			else {
				ree[i] = val;
			}

		}
		arr = ree;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		arr[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] moo = (T[]) new Object[arr.length - 1];
		for(int i = 0; i < arr.length; i++) {
			if(i < loc) {
				moo[i] = arr[i];
			}
			else if(i > loc) {
				moo[i-1] = arr[i];
			}
			else {}
		}
		arr = moo;
	}
	
	public boolean contains(T val) {
		for(int i =0; i < arr.length; i++) {
			if(arr[i] == val) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub

		return arr.length;
	}

}