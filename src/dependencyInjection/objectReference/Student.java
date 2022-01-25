package dependencyInjection.objectReference;

public class Student {

	SubjectMaterials materials;

	public void setMaterials(SubjectMaterials materials) {
		this.materials = materials;
	}
	
	public void distributeMaterials() {
		materials.Materials();
	}
	
}
