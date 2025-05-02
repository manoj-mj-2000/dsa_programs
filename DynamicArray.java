import java.util.Arrays;
public class DynamicArray{
	int startCapacity = 2;
	int arr[];
	int size, capacity;

	public DynamicArray() {
		arr = new int[startCapacity];
		capacity=startCapacity; 
		size=0;
	}
	public int get(int index) {
		return arr[index];
	}
	public void write(int val) {
		if(size>=capacity) {
			doubleCapacity();
		}
		arr[size++] = val;
	}
	private void doubleCapacity() {
		capacity *= 2;
		arr = Arrays.copyOf(arr, capacity);
	}
	public void update(int index, int val) {
		arr[index] = val;
	}
	
	public void insert(int index, int val) {
		if(size>=capacity) {
			doubleCapacity();
		}
		for(int i=size-1;i>=index;i--) {
			arr[i+1] = arr[i];
		}
		size++;
		arr[index]=val;
		return;
	}
	
	public int delete(int index) {
		
		int val = arr[index];
		int n = arr.length;
		
		for(int i=index; i<size; i++) {
			arr[i] = arr[i+1];
		}
		size--;
		return val;
	}
	
	public void arrToString() {
		for(int i=0;i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
