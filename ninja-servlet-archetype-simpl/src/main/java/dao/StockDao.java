package dao;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import ninja.jpa.UnitOfWork;

import models.stock;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;
@Transactional
public class StockDao {
	 @Inject
	    Provider<EntityManager> entitiyManagerProvider;
	    
	    @Inject
	    Provider<EntityManager> entityManagerProvider;
	   @Transactional
   public  void additem(Integer itemid, String itemname,Integer Quantity,Integer price) {
   
	   EntityManager entityManager = entityManagerProvider.get();
      
     stock u= new stock(itemid,itemname,Quantity,price);
     entityManager.persist(u);

      
      }
	   @Transactional
	   public void deleteitem(Integer itemid) {
		   
		   EntityManager entityManager = entitiyManagerProvider.get();
		   entityManager.createQuery("DELETE FROM stock x WHERE x.itemid = :idParam").setParameter("idParam", itemid).executeUpdate();
		   		         
	   }
	   
	   @UnitOfWork
	   public void showstock() {
		   EntityManager entityManager = entitiyManagerProvider.get();
		   entityManager.createQuery("select * from stock");
	   }
	   
	   
	   @Transactional
	   public void updateitem(Integer itemid, String itemname,Integer Quantity,Integer price) {
		   EntityManager entityManager = entitiyManagerProvider.get();
	        
//	        TypedQuery<stock> q = entityManager.createQuery("SELECT x FROM stock x WHERE itemid = :itemid", stock.class);
//	        stock updatestock = q.setParameter("itemid", itemid).getSingleResult();
//	        
//	        if (updatestock == null) {
//	            flash.alert = "User not found.";
//	        }
	        Query query = entityManager.createQuery("UPDATE stock x SET x.itemname=:itemname WHERE x.id =:itemid");
	      query.executeUpdate();
	   }
}