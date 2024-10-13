package Repositories;

import Entities.Budget;
import org.springframework.data.repository.CrudRepository;

public interface BudgetRespository extends CrudRepository<Budget, Integer> {
}
