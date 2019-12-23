package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @Project spring5webapp
 * Created by Parinit on 12/23/2019
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
