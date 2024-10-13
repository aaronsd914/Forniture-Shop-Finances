package Repositories;

import Entities.DeliveryNote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryNoteRespository extends CrudRepository<DeliveryNote, Integer> {

}
