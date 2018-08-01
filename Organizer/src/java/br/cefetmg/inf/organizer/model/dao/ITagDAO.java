package br.cefetmg.inf.organizer.model.dao;

import br.cefetmg.inf.organizer.model.domain.Tag;
import br.cefetmg.inf.organizer.model.domain.User;
import java.util.ArrayList;

public interface ITagDAO {

    boolean createTag(Tag tag);
    
    Tag readTag(Tag tag);
    
    boolean updateTag(Tag tag);
    
    boolean updateTagId(Tag tag, Long id);

    boolean deleteTag(Tag tag);

    ArrayList<Tag> listAlltag(User user);

    Long searchTagByName(String nomeTag, User user);

    Tag searchTagById(Long idTag);
}
