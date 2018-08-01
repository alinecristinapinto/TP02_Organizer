
package br.cefetmg.inf.organizer.model.service.impl;

import br.cefetmg.inf.organizer.model.dao.IUserDAO;
import br.cefetmg.inf.organizer.model.dao.impl.TagDAO;
import br.cefetmg.inf.organizer.model.dao.impl.UserDAO;
import br.cefetmg.inf.organizer.model.domain.User;
import br.cefetmg.inf.organizer.model.service.IKeepUser;
import br.cefetmg.inf.util.exception.BusinessException;
import br.cefetmg.inf.util.exception.PersistenceException;


public class KeepUser implements IKeepUser {

    private final IUserDAO userDAO;
    
    public KeepUser() {
        userDAO = new UserDAO();
    }
    
    @Override
    public boolean registerUser(User user) throws PersistenceException, BusinessException {
        
        User temp = userDAO.readUser(user);
        
        if(temp != null){
            throw new BusinessException("O cadastro não pode ser realizado: Usuário já existente");
        }
            
        if((user.getCodEmail() == null || user.getCodEmail().isEmpty()) || (user.getUserPassword() == null || user.getUserPassword().isEmpty()) ||
                (user.getUserName() == null || user.getUserName().isEmpty()) || (user.getCurrentTheme().getIdTheme()== 0)){
            throw new BusinessException("O cadastro não pode ser realizado: Campos faltando");
        }
        return userDAO.createUser(user);
    }

    @Override
    public User searchUser(User user) throws PersistenceException, BusinessException {
        User temp = userDAO.readUser(user); 
        
        if(temp==null){
           throw new BusinessException("Não foi possível encontrar o usuário");
        }
        return temp;
    }

    @Override
    public boolean updateUser(User user) throws PersistenceException, BusinessException {
        
        if(user.getCodEmail() == null || user.getCodEmail().isEmpty()){
            throw new BusinessException("As alterações não puderam ser realizadas: Email não informado");
        }
        return userDAO.updateUser(user);
    }

    @Override
    public boolean deleteAccount(User user) throws PersistenceException, BusinessException {
        if(user.getCodEmail() == null || user.getCodEmail().isEmpty()){
            throw new BusinessException("A exclusão não pode ser realizada: Email não informado");
        }
        return userDAO.deleteUser(user);
    }

    @Override
    public User getUserLogin(String email, String password) throws PersistenceException {
        return userDAO.getUserLogin(email, password);
    }
    
}
