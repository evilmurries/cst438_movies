package cst438;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long>
{
   // Inspiration for solution:
   // https://stackoverflow.com/questions/25486583/how-to-use-orderby-with-
   // findall-in-spring-data
   public List<Movie> findAllByOrderByTimeStampDesc();
}
