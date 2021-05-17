package tn.esprit.services;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;


@Component
@Endpoint(id = "piDEV1", enableByDefault = true)
public class EndPointApi {

	@ReadOperation
	public EndPointResponse features() {
		return new EndPointResponse(263872, "Rawdhty-Social-Network", "Active ");
	}

}


class EndPointResponse {
	
	private int id;
	private String name;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public EndPointResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EndPointResponse(int id, String name, String status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}
	
}
