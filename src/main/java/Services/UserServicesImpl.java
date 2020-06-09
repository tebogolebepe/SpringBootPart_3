package Services;


import Repository.FakeRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class UserServicesImpl implements UserServices {

    FakeRepo user;



@PostMapping
    public void addUser(long id, String name, String surname){
        user.insertUser(id,name,surname);
        System.out.println(user);
    }
@GetMapping
    public void getUser(long id){
        user.findUserById(id);
        System.out.println("Hello " + user);
    }
@DeleteMapping
    public void removeUser(long id){
        user.deleteUser(id);
        System.out.println(user + " removed");
    }

}