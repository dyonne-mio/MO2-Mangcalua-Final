package model.representations;

public class MangcaluaArray {
	
	private MangcaluaValue[] mangcaluaValueArray;
	private PrimitiveType arrayPrimitiveType;
	private String arrayIdentifier;
	private boolean constFlag = false;
	
	public MangcaluaArray(PrimitiveType primitiveType, String id) {
		this.arrayPrimitiveType = primitiveType;
		this.arrayIdentifier = id;
	}

	public void initSize(int size) {
		this.mangcaluaValueArray = new MangcaluaValue[size];

		for (int x = 0; x < size; x++) {
			MangcaluaValue mangcaluaValue = new MangcaluaValue(null, this.arrayPrimitiveType);
			this.mangcaluaValueArray[x] = mangcaluaValue;
		}
	}
	
	public boolean updateValueAt(MangcaluaValue mangcaluaValue, int index) {
		if(index >= this.mangcaluaValueArray.length) {
			return false;
		}
		this.mangcaluaValueArray[index] = mangcaluaValue;

		return true;
	}
	
	public MangcaluaValue getValueAt(int index) {
		if(index >= this.mangcaluaValueArray.length) {
			return null;
		}
		else {
			return this.mangcaluaValueArray[index];
		}
	}
	
	public static MangcaluaArray createArray(String typeString, String arrayId) {
        
		PrimitiveType primitiveType = PrimitiveType.NOT_YET_IDENTIFIED;

		if(typeString.contains("int")) {
			primitiveType = PrimitiveType.INT;
		}
		else if(typeString.contains("float")) {
			primitiveType = PrimitiveType.FLOAT;
		}
		else if(typeString.contains("bool")) {
			primitiveType = PrimitiveType.BOOLEAN;
		}
		else if(typeString.contains("String")) {
			primitiveType = PrimitiveType.STRING;
		}
		MangcaluaArray mangcaluaArray = new MangcaluaArray(primitiveType, arrayId);
		return mangcaluaArray;
	}

	public PrimitiveType getPrimitiveType() {
		return this.arrayPrimitiveType;
	}

	public void setPrimitiveType(PrimitiveType primitiveType) {
		this.arrayPrimitiveType = primitiveType;
	}

	public boolean isInitialized() {
		return mangcaluaValueArray != null;
	}

	public boolean isConst() {
		return this.constFlag;
	}

	public int getSize() {
		return this.mangcaluaValueArray.length;
	}
}