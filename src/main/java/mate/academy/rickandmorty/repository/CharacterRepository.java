package mate.academy.rickandmorty.repository;

import mate.academy.rickandmorty.model.Character;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
    List<Character> findAllByNameLikeIgnoreCase(String namePart);
}
