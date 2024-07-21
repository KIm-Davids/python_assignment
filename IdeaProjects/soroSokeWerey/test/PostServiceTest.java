import com.semicolon.data.models.Post;
import com.semicolon.data.repository.PostRepository;
import com.semicolon.data.repository.PostRepositoryImpl;
import org.junit.jupiter.api.Test;
import com.semicolon.services.PostServicesImpl;

import static org.junit.jupiter.api.Assertions.*;

public class PostServiceTest {

    PostServicesImpl postService = new PostServicesImpl();
    PostRepository repository = new PostRepositoryImpl();

    @Test
    public void testThatWeCantAddTwoContents() {
       Post service = postService.addPost("ade","ade is a boy");

        assertEquals("ade", service.getTitle());

    }

    @Test
    public void testTheFindPostById(){
        Post service = postService.addPost("ade", " I am a boy");
        System.out.println(service.getId());
        assertEquals("ade", postService.findPostById(service.getId()).getTitle());
    }

}
