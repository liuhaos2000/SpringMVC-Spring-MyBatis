package lh.tao.service;

import java.util.List;

import lh.tao.model.MUser;

public interface MUserServiceI {

	List<MUser> getAll();
	
	MUser selectByPrimaryKey(String id);
	
    int insert(MUser muser);
    
    int update(MUser muser);
    
    int delete(String id);
}
