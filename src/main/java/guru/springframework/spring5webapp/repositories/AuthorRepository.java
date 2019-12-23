package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @Project spring5webapp
 * Created by Parinit on 12/23/2019
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
