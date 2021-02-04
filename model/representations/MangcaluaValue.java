package model.representations;

public class MangcaluaValue {
	private Object value;
	private PrimitiveType primitiveType = PrimitiveType.NOT_YET_IDENTIFIED;
	private boolean constFlag = false;

	public MangcaluaValue(Object value, PrimitiveType primitiveType) {
		this.primitiveType = primitiveType;
		this.value = null;
	}
	
	public MangcaluaValue(Object value, String primitiveType) {
		PrimitiveType type = resolve_type(primitiveType);

		if (value == null || checkValueType(value, type)) {
			this.value = value;
			this.primitiveType = type;
		}
	}

	private MangcaluaValue(Object value, PrimitiveType primitiveType, boolean constFlag) {
		this.value = value;
		this.primitiveType = primitiveType;
		constFlag = constFlag;
	}

	public MangcaluaValue(MangcaluaValue mangcaluaValue) {
		this(mangcaluaValue.value, mangcaluaValue.primitiveType, mangcaluaValue.constFlag);
	}
	
	public void setPrimitiveType(String primitiveType) {
		PrimitiveType type = resolve_type(primitiveType);
		this.primitiveType = type;
	}

	public static boolean checkValueType(Object value, PrimitiveType primitiveType) {
		switch(primitiveType) {
			case INT:
				return value instanceof Integer;
			case FLOAT:
				return value instanceof Float;
			case BOOLEAN:
				return value instanceof Boolean;
			case STRING:
				return value instanceof String;
			case ARRAY:
				return value instanceof MangcaluaArray;
			default:
				return false;
		}
	}

	public static PrimitiveType resolve_type(String typeString) {
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
		else if(typeString.contains("array")) {
			primitiveType = PrimitiveType.ARRAY;
		}
		return primitiveType;
	}

	public void reset() {
		this.value = null;
	}

	public void markConst() {
		this.constFlag = true;
	}

	public boolean isConst() {
		return this.constFlag;
	}

	public PrimitiveType getPrimitiveType() {
		return this.primitiveType;
	}

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}