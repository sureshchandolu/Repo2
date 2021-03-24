package com.micro.friend.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.micro.friend.entity.Friend;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Integer> {
	
	@Query(value="select count(*) from friend where  phone_no=?  and  friend_no=?", nativeQuery=true)
	Integer  checkFriendContact(Long phoneNumber, Long friendNumber);
	
	@Query(value="select  friend_no  from  friend  where  phone_no=?", nativeQuery=true)
	List<Long>  findFriendsContactNumbers(Long phoneNumber);
	
	@Modifying
	@Transactional
	@Query(value="delete  from  friend  where  phone_no=?  and  friend_no=?", nativeQuery=true)
	Integer  deleteFriend(Long phoneNumber, Long  friendNumber);
	

}
