package dependencyInjection.objectReference;

public class Teacher {

	SubjectMaterials materials;

	public void setMaterials(SubjectMaterials materials) {
		this.materials = materials;
	}
	
	public void sendMaterials() {
		materials.Materials();
		System.out.println("Send materials for students");
	}
}
