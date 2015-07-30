public class MyVector implements MyCollections {
	private Object[] internalArray;
	private int nextIndex = 0;
	
	public MyVector(int initialCapacity) {
		internalArray = new Object[initialCapacity];
	}

	@Override
	public void append(Object value) {
		if (nextIndex >= internalArray.length) {
			// increase the array size (double it)
			// copy all elements from the old array to the new one
			Object[] newInternalArray = new Object[internalArray.length * 2];
			for (int i = 0; i < internalArray.length; ++i) {
				newInternalArray[i] = internalArray[i];
			}
			
			internalArray = newInternalArray;
		}
		
		internalArray[nextIndex] = value;
		nextIndex++;
	}

	@Override
	public Object get(int index) {
		if (index >= nextIndex) {
			throw new IndexOutOfBoundsException();
		}
		
		return internalArray[index];
	}

	@Override
	public int size() {
		return nextIndex;
	}
}
