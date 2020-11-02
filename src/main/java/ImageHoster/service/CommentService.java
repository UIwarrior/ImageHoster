package ImageHoster.service;
import ImageHoster.model.Comment;
import ImageHoster.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private ImageRepository imageRepository;

    public void addComment(Comment comment) { imageRepository.postComment(comment); }
    public List getComments(Integer imageId) {return imageRepository.getImageComments(imageId);}
}
