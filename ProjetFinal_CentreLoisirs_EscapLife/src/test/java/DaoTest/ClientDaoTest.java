package DaoTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

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
		// TODO Auto-generated method stub
		Utilisateur util = new Utilisateur("mdp","login");
		Client addedClient = clientDao.save(new Client("Eric",336070810,"eric@gmail.com","etudiant",util));
		LOGGER.info(" -----------Client saved-----------");
		LOGGER.info("-------------Searching for Client ----------------");
	
		Client clientToUpdate = clientDao.findByNom("Eric");
		LOGGER.info("--------------Client found -------------");
		LOGGER.info("--------------Verifying Client--------------");
		clientToUpdate.setNom("Eric");
		clientDao.save(clientToUpdate);
		assertNotEquals(addedClient, clientToUpdate);
		
	}
	
	@Test
	public void givenEntityRepository_whenDeleting() {
		// TODO Auto-generated method stub
		Utilisateur util = new Utilisateur("mdp","login");

	Client addedClient = clientDao.save(new Client("Eric",336070810,"eric@gmail.com","etudiant",util));
	LOGGER.info(" ------------Client saved-----------");
	LOGGER.info("-------------Searching for Client ----------------");
	Client clientToDelete= clientDao.findByNom("Eric");
	clientDao.delete(clientToDelete);
	LOGGER.info("--------------Client à supprimer -------------");
	LOGGER.info("--------------Verifying Client--------------");
	clientToDelete= clientDao.findByNom("Eric");
	assertNull(clientToDelete);
	}
	
	
}
