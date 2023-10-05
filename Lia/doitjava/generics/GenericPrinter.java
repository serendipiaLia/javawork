package generics;

public class GenericPrinter<T extends Material> {
	private T material; 
	
	public void setMaterial(T material) {
		this.material = material;
	}
	public T getMaterial () {
		return material;
	}
	
	public String toString() { //재정의
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
}
