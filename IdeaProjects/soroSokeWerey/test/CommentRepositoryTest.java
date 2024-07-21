import static org.junit.jupiter.api.Assertions.*;

import com.semicolon.data.models.Comment;
import org.junit.jupiter.api.Test;
import com.semicolon.data.repository.CommentRepositoryImpl;

public class CommentRepositoryTest {

    CommentRepositoryImpl repository = new CommentRepositoryImpl();
    Comment comment = new Comment();

    @Test
    public void testThatTheListIsEmpty(){
        assertTrue(repository.isEmpty());
    }

    @Test
    public void testThatWeCanSaveToTheListsOfComments(){
        Comment comment = new Comment();
        comment.setComment("Hello");
        repository.save(comment);

        comment.setComment("hi");
        repository.save(comment);
        assertEquals(2, repository.findAll().size());
    }

    @Test
    public void testThatWeCanDeleteCommentById(){
        comment.setUserId(1);
        comment.setComment("HI and Hello");

        Comment saveComment = new Comment();

        saveComment.setUserId(2);
        saveComment.setComment("My guy how fa");

        repository.save(comment);
        repository.deleteByCommentId(1);

        repository.save((saveComment));
        repository.deleteByPostId(2);

        assertNull(repository.findByPostId(1));
        assertEquals(null, repository.findByPostId(2));
    }

    @Test
    public void testThatWeCanDeleteAll(){
        comment.setUserId(1);
        comment.setComment("HI and Hello");

        Comment saveComment = new Comment();

        saveComment.setUserId(2);
        saveComment.setComment("My guy how fa");

        repository.save(comment);
        repository.save((saveComment));
        repository.deleteByCommentId(1);

        repository.deleteAll();

        System.out.println(repository.findAll());
        assertEquals(null, repository.findByPostId(1));
        assertEquals(null, repository.findByPostId(2));
    }

    @Test
    public void testTheFindAllMethodWorks(){
        comment.setId(1);
        comment.setTitle("Why are we in semicolon ?");

        repository.save(comment);

        assertTrue(repository.findAll().contains(comment));
    }

    @Test
    public void testThatCommentsSavedCanBeRetrieved(){
        comment.setId(1);
        comment.setTitle("Kim");
        comment.setComment("Why we are in semicolon ?");

        repository.save(comment);
        System.out.println(repository.findByCommentId(1).getComment());
        assertEquals("Kim", repository.findByCommentId(1).getTitle());
        assertEquals("Why we are in semicolon ?", repository.findByCommentId(1).getComment());
    }
}
