package tn.esprit.services;

public class ResponseJoin {
	private String Kindergarden_name ; 
	private String Activity_Name;
	public String getKindergarden_name() {
		return Kindergarden_name;
	}
	public void setKindergarden_name(String kindergarden_name) {
		Kindergarden_name = kindergarden_name;
	}
	public String getActivity_Name() {
		return Activity_Name;
	}
	public void setActivity_Name(String activity_Name) {
		Activity_Name = activity_Name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Activity_Name == null) ? 0 : Activity_Name.hashCode());
		result = prime * result + ((Kindergarden_name == null) ? 0 : Kindergarden_name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseJoin other = (ResponseJoin) obj;
		if (Activity_Name == null) {
			if (other.Activity_Name != null)
				return false;
		} else if (!Activity_Name.equals(other.Activity_Name))
			return false;
		if (Kindergarden_name == null) {
			if (other.Kindergarden_name != null)
				return false;
		} else if (!Kindergarden_name.equals(other.Kindergarden_name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ResponseJoin [Kindergarden_name=" + Kindergarden_name + ", Activity_Name=" + Activity_Name + "]";
	}
	public ResponseJoin(String kindergarden_name, String activity_Name) {
		super();
		Kindergarden_name = kindergarden_name;
		Activity_Name = activity_Name;
	}
	public ResponseJoin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
