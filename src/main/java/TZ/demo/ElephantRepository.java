package TZ.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



import java.util.List;
@Repository
public interface ElephantRepository extends JpaRepository<Elephant,Long>{
    List<Elephant> getElephantsByHabitat(String habitat);

@Query(value = "select * from elephants s where s.name like %?1% ", nativeQuery = true)
    List<Elephant> getElephantsByName(String name);




}
