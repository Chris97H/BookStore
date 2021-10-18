package CEN4010.Group9.BookStore.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import CEN4010.Group9.BookStore.Model.Profile;

public interface ProfileRepository extends MongoRepository<Profile, String> {
    
    @Query(value="{ 'id' : ?0 }")
    List<Profile> getID(String id);

    @Query(value="{ 'firstName' : ?0 }")
    List<Profile> getFirst(String firstName);

    @Query(value="{ 'lastName' : ?0 }")
    List<Profile> getLast(String lastName);

}
