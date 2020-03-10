package cst438;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long>
{  
   @Query(value="select * from movie order by id desc, time_stamp desc", nativeQuery=true)
   public List<Movie> findAllByOrderByTimeStampDesc();
}
