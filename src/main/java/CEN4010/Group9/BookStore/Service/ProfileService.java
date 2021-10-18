package CEN4010.Group9.BookStore.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import CEN4010.Group9.BookStore.Model.Profile;
import CEN4010.Group9.BookStore.Repository.ProfileRepository;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;


    // Create a profile repository when using the profile service
    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    // The profile service will add the new profile to the repository before being able to use
    public void createProfile(Profile profile)
    {
        profileRepository.insert(profile);
    }

    public List<Profile> getProfileID(String id) {
        return profileRepository.getID(id);
    }

    public List<Profile> getFirstName(String firstName) {
        return profileRepository.getFirst(firstName);
    }

    public List<Profile> getLastName(String lastName) {
        return profileRepository.getFirst(lastName);
    }

}
