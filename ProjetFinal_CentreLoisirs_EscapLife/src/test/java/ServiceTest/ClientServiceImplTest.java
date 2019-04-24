package ServiceTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.SpringBootRunner;
import com.model.Client;
import com.model.Dao.IClientDao;
import com.model.Service.ClientServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootRunner.class)
public class ClientServiceImplTest {

	private ClientServiceImpl clientService;
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientServiceImplTest.class);
	
    @Mock
    private IClientDao clientDao;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        clientService = new ClientServiceImpl(clientDao);
    }
    
    @Test
    public void should_store_when_save_is_called() {
        LOGGER.info("--------------- Executing should_store_when_save_is_called test Of UserServiceImplTest ---------------");
        Client myClient = new Client();
        clientService.save(myClient);
        Mockito.verify(clientDao).save(myClient);
    }
}
