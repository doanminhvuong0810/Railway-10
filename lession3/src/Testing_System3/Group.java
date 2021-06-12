package Testing_System3;

public class Group implements Comparable<Group> {
	int id;
	String groupNam;

	
	@Override
	public boolean equals(Object obj) {
		if (obj==null) return false;
		Group objGroup = (Group)obj;
		if(groupNam==objGroup.groupNam && id == objGroup.id) return true;
		return false;
	}
	
	
	@Override
	public String toString() {
		
		return "ID: " + id + "nam: " + groupNam ;
	}


	@Override
	public int compareTo(Group o) {
		if (id <o.id)return  1;
		if (id >o.id)return -1;
		return 0;
	}
}
