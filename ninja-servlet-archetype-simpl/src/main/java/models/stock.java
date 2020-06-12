package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

  

@Entity

public class stock {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;
	public Integer itemid;
	public String itemname;
	public Integer Quantity;
	public Integer price;
	    
	 public stock() {}
	    
	    public stock(Integer itemid, String itemname,Integer Quantity,Integer price) {
	        this.itemid = itemid;
	        this.itemname = itemname;
	        this.Quantity = Quantity;
	        this.price=price;
	    }
}
