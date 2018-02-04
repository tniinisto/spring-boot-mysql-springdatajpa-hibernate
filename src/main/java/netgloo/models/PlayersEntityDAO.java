package netgloo.models;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * A DAO for the entity Player is simply created by extending the CrudRepository
 * interface provided by spring. The following methods are some of the ones
 * available from such interface: save, delete, deleteAll, findOne and findAll.
 * The magic is that such methods must not be implemented, and moreover it is
 * possible create new query methods working only by defining their signature!
 *
 * @author netgloo
 */
@Transactional
public interface PlayersEntityDAO extends CrudRepository<PlayersEntity, Long>{

    /**
     * Return the user having the passed email or null if no user is found.
     *
     * @param mail the user email.
     */
    public PlayersEntity findByMail(String mail);

    public List<PlayersEntity> findAll();

}
