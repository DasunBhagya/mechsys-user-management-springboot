package com.MechSys.mechsys_user_management.repo;

import com.MechSys.mechsys_user_management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    

}
