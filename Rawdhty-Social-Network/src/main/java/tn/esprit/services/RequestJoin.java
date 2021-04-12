package tn.esprit.services;

import tn.esprit.entities.Kindergarten;

public class RequestJoin {

	private Kindergarten kindergarten ;
	public Kindergarten getKindergarten() {
		return kindergarten;
	}

	public void setKindergarten(Kindergarten kindergarten) {
		this.kindergarten = kindergarten;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kindergarten == null) ? 0 : kindergarten.hashCode());
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
		RequestJoin other = (RequestJoin) obj;
		if (kindergarten == null) {
			if (other.kindergarten != null)
				return false;
		} else if (!kindergarten.equals(other.kindergarten))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RequestJoin [kindergarten=" + kindergarten + "]";
	}

	public RequestJoin(Kindergarten kindergarten) {
		super();
		this.kindergarten = kindergarten;
	}

	public RequestJoin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
