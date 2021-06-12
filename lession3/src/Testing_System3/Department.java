package Testing_System3;

public class Department implements Comparable<Department> {
	int id;
	String nameDepartment;
	
@Override
	public String toString() {
		return "ID: " + id + "     nameDepartment: " + nameDepartment ;
	}
	
	
@Override
public boolean equals(Object obj) {
	if (obj==null) return false;
	Department objDepartment = (Department)obj;
	if(nameDepartment==objDepartment.nameDepartment && id == objDepartment.id) return true;
	return false;
}


@Override
public int compareTo(Department o) {
	if (nameDepartment.equalsIgnoreCase(o.nameDepartment))return  1;
	if (nameDepartment.equalsIgnoreCase(o.nameDepartment))return  -1;
	return 0;
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

