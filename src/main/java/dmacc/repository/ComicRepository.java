package dmacc.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Comic;



/**
 * @author jword - jord
 * CIS175 - Spring - 2022
 * Mar 7, 2022
 */
@Repository
public interface ComicRepository extends JpaRepository<Comic, Long> {

}
