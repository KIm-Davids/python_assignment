import static org.junit.jupiter.api.Assertions.*;

import com.semicolon.data.models.Post;
import org.junit.jupiter.api.Test;
import com.semicolon.data.repository.PostRepository;
import com.semicolon.data.repository.PostRepositoryImpl;

public class PostRepositoryTest {

    PostRepository repository = new PostRepositoryImpl();
    Post post = new Post();

    @Test
    public void testThatListIsEmpty(){
        assertEquals(1, repository.count());
    }

    @Test
    public void testThatPostCanSavePost(){
        repository.save(post);
        assertTrue(repository.count() >= 1);
    }

    @Test
    public void testThatPostObjectCanSetId(){
        Post post = new Post();
        post.setId(1234);
        assertEquals(1234, post.getId());
    }

    @Test
    public void testThatWeCanSavePostWithContents(){

        post.setTitle("Semicolon Title");
        post.setContent("I am in semicolon");

        repository.save(post);
        assertEquals(1, repository.findByAll().size());

        System.out.println(repository.findById(1));
    }



    @Test
    public void testThatWeCanFindPostById(){
        post.setId(1234);
        post.setTitle("Semicolon");
        post.setContent("I am in semicolon");

        repository.save(post);
        assertEquals("Semicolon", repository.findById(1234).getTitle());
    }

    @Test
    public void testThatWeCanDeletePostById(){
        post.setId(1234);
        post.setTitle("Semicolon Title");
        post.setContent("I am in semicolon");

        repository.save(post);
        repository.deleteById(1234);
        assertNull(repository.findById(1234));
    }

    @Test
    public void testThatWeCanDeleteOneOutOfTwoOfThePostsInTheList(){
        post.setId(1234);
        post.setTitle("Semicolon Title");
        post.setContent("I am in semicolon");

        Post savePost = new Post();

        savePost.setId(1);
        savePost.setTitle("My title Title");
        savePost.setContent("I am a senior ");

        repository.save(post);
        repository.save(savePost);
        repository.deleteById(1234);
        assertNull(repository.findById(1234));
    }

    @Test
    public void testThatWeCanDeleteAllThePostsInTheList(){
        post.setId(1234);
        post.setTitle("Semicolon Title");
        post.setContent("I am in semicolon");

        Post saveThePost = new Post();
        Post savePost = new Post();

        savePost.setId(4567);
        savePost.setContent("Blah Blah");
        savePost.setTitle("Blah Blah");

        saveThePost.setId(1);
        saveThePost.setTitle("My title Title");
        saveThePost.setContent("I am a senior ");

        repository.save(post);
        repository.save(saveThePost);
        repository.save(savePost);

        repository.deleteAll();

        System.out.println(repository.findById(1));
        System.out.println(repository.findById(1234));
        System.out.println(repository.findById(4567));



        assertEquals(null, repository.findById(1));
        assertEquals(null, repository.findById(1234));
        assertEquals(null, repository.findById(4567));
    }

    @Test
    public void testTheFindAllMethodWorks(){
        post.setId(1);
        post.setTitle("Why are we in semicolon ?");

        repository.save(post);

        assertTrue(repository.findByAll().contains(post));
    }

    @Test
    public void testThatRandomNumbersForId(){
        int id = repository.generateUniqueId();
        post.setId(id);
        post.setTitle("My title Title");
        post.setContent("I am a senior ");

        repository.save(post);
        System.out.println(post.getId());
        assertEquals(post.getId(), id);
    }

    @Test
    public void testThatWeCanUpdateThroughTheSaveMethod(){
        int id = repository.generateUniqueId();
        post.setId(id);
        post.setTitle("ade");
        post.setContent("I am a senior ");

        repository.save(post);
        assertTrue(repository.findByAll().contains(post));
        assertEquals("ade", repository.findById(id).getTitle());
        assertEquals("I am a senior ", repository.findById(id).getContent());

        repository.findById(id).setTitle("obi");
        repository.findById(id).setContent("Boy-boy");

        assertEquals("obi", repository.findById(id).getTitle());
        assertEquals("Boy-boy", repository.findById(id).getContent());
    }
}
