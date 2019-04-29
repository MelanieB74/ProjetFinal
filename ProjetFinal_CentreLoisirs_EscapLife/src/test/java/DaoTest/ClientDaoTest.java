package DaoTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.SpringBootRunner;
import com.model.Client;
import com.model.Utilisateur;
import com.model.Dao.IClientDao;

@RunWith(SpringRunner.class)

@SpringBootTest(classes = SpringBootRunner.class)
public class ClientDaoTest {

	@Autowired
    private IClientDao clientDao;
	private static final Logger LOGGER = LoggerFactory.getLogger(ClientDaoTest.class);
	
	
	@Test
	public void givenEntityRepository_whenSaving (){
		
		LOGGER.info("----------- Testing givenEntityrepository_WhenSaving Method ---------------");
		Utilisateur util = new Utilisateur("mdp","login");
		Client addedClient = clientDao.save(new Client("Eric",336070810,"eric@gmail.com","etudiant",util));
		LOGGER.info(" Utilisateur saved-----------");
		LOGGER.info("-------------Searching for Utilisateur ----------------");
		Client foundClient = clientDao.findById(addedClient.getId());
		LOGGER.info("--------------Utilisateur found -------------");
		LOGGER.info("--------------Verifying Utilisateur--------------");
		assertNotNull(foundClient);
		assertEquals(addedClient.getNom(), foundClient.getNom());
		LOGGER.info("---------------- Utilisateur verified--------------");
		
	}
	
	@Test
	public void givenEntityRepository_whenUpdating() {
		LOGGER.info("------------- Testing givenEntityRepository_whenUpdating Method---------");
		
		Utilisateur util = new Utilisateur("mdp","login");
		Client updatedClient = clientDao.save(new Client("Eric",336070810,"eric@gmail.com","etudiant",util));
		LOGGER.info("------------Client saved-----------");
		
		LOGGER.info("------------Update Client------------------");
		updatedClient.setNom("Dali");
		clientDao.save(updatedClient);
		LOGGER.info("-------------Client updated-----------");
		
		LOGGER.info("------------Searching for Client------------------");
		Client foundClient = clientDao.findByNom(updatedClient.getNom());
		LOGGER.info("-------------Client found-----------");
			
		LOGGER.info("-----------------Verifying Client----------");
		assertEquals(updatedClient.getNom(), foundClient.getNom());
		LOGGER.info("-------------- Client verified----------------------");
	}
	
	@Test
	public void givenEntityRepository_whenDeleting() {
		LOGGER.info("------------- Testing givenEntityRepository_whenDeleting Method---------");
		Utilisateur util = new Utilisateur("mdp","login");
		Client deletedClient = clientDao.save(new Client("Eric",336070810,"eric@gmail.com","etudiant",util));
	
		LOGGER.info("------------Client saved-----------");
		
		LOGGER.info("------------Delete Client------------------");
		clientDao.delete(deletedClient);
		LOGGER.info("-------------Client deleted-----------");
		
		LOGGER.info("------------Searching for Client------------------");
		Client foundClient = clientDao.findByNom(deletedClient.getNom());
		LOGGER.info("-------------Client found-----------");
			
		LOGGER.info("-----------------Verifying Client----------");
		assertNull(foundClient);
		LOGGER.info("-------------- Client verified----------------------");
		
	}
	 @Test
	public void givenEntityRepository_whenRetrievingAll() {	
		
		LOGGER.info("------------- Testing givenEntityRepository_whenRetrievingOneByNom Method---------");
		Utilisateur util = new Utilisateur("mdp","login");
		 clientDao.save(new Client("Eric",336070810,"eric@gmail.com","etudiant",util));
		LOGGER.info("------------Client saved-----------");
		
		LOGGER.info("------------Searching for Client------------------");
		List<Client> foundClient = clientDao.findAll();
		LOGGER.info("-------------Client found-----------");
		
		LOGGER.info("-----------------Verifying Client----------");
		assertNotNull(foundClient);
		assertEquals(foundClient.size() >0, true);
		LOGGER.info("-------------- Client verified----------------------");


	}
	
	 @Test
		public void givenEntityRepository_whenRetrievingId() {	
		 LOGGER.info("------------- Testing givenEntityRepository_whenRetrievingOneByNom Method---------");

	 Utilisateur util = new Utilisateur("mdp","login");
		Client findById =  clientDao.save(new Client("Eric",336070810,"eric@gmail.com","etudiant",util));

		LOGGER.info("------------Client saved-----------");
		
		LOGGER.info("------------Searching for Client------------------");
		Client foundClient= clientDao.findById(findById.getId());
		LOGGER.info("-------------Client found-----------");
		
		LOGGER.info("-----------------Verifying Client----------");
		assertEquals(findById.getId(), foundClient.getId());
		LOGGER.info("-------------- Client verified----------------------");
	 
	 }
	
	 @Test
	public void givenEntityRepository_whenRetrievingOneByNom() {
		LOGGER.info("------------- Testing givenEntityRepository_whenRetrievingOneByNom Method---------");
		Utilisateur util = new Utilisateur("mdp","login");
		Client findByNom = clientDao.save(new Client("Jean",336070810,"eric@gmail.com","etudiant",util));
		LOGGER.info("------------Client saved-----------");
	
		LOGGER.info("------------Searching for Client------------------");
		Client foundClient = clientDao.findByNom(findByNom.getNom());
		LOGGER.info("-------------Client found-----------");
	
		LOGGER.info("-----------------Verifying Client----------");
		assertEquals(findByNom.getNom(), foundClient.getNom());
		LOGGER.info("-------------- Client verified----------------------");
	}
	
}
