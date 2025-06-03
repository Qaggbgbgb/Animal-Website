package TZ.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import java.util.List;
@Repository
public interface ElephantRepositry extends JpaRepository<Elephant,Long>{
    List<Elephant> getElephantsByHabitat(String habitat);
@query




}
