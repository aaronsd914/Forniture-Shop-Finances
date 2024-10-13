package Repositories;

import Entities.Bill;
import org.springframework.data.repository.CrudRepository;

public interface BillRespository extends CrudRepository<Bill, Integer> {
}
