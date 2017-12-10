package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.SysUser;

public interface SysUserRepository extends JpaRepository<SysUser, Long>{
	
	SysUser findByUsername(String username);

}
