package dao;
import javax.persistence.EntityManager;

import models.logindetail;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;
@Transactional
public class CreateEmployee {
	 @Inject
	    Provider<EntityManager> entitiyManagerProvider;
	    
	    @Inject
	    Provider<EntityManager> entityManagerProvider;
	   @Transactional
   public  void create() {
   
	   EntityManager entityManager = entityManagerProvider.get();
      
      logindetail u= new logindetail("14","aryan","aryan@gmail.com");
      entityManager.persist(u);

      
      }
}