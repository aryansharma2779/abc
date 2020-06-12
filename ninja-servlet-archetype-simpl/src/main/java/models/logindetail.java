package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class logindetail {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;
	public String idnumber;
	public String name;
	public String email;
	    
	 public logindetail() {}
	    
	    public logindetail(String idnumber, String name,String email) {
	        this.idnumber = idnumber;
	        this.name = name;
	        this.email = email;
	    }
}
