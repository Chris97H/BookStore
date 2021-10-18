package CEN4010.Group9.BookStore.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CEN4010.Group9.BookStore.Model.Profile;
import CEN4010.Group9.BookStore.Service.ProfileService;

@RestController
@RequestMapping("api/profile")
public class ProfileController {

    private final ProfileService profileService;

    //Create a Profile Service --> creates a profile repository
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    // POST a profile and return if successfull or not with ResponseEntity
    @PostMapping
    public ResponseEntity createProfile(@RequestBody Profile profile) {
        profileService.createProfile(profile);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity <List<Profile>> getBookByID(@PathVariable String id) {
        return ResponseEntity.ok(profileService.getProfileID(id));
    }

    @GetMapping("/firstName/{firstName}")
    public ResponseEntity <List<Profile>> getFirstName(@PathVariable String firstName) {
        return ResponseEntity.ok(profileService.getFirstName(firstName));
    }

    @GetMapping("/lastName/{lastName}")
    public ResponseEntity <List<Profile>> getLastName(@PathVariable String lastName) {
        return ResponseEntity.ok(profileService.getLastName(lastName));
    }

}
