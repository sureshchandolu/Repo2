package com.micro.friend.service;

import java.util.List;

import com.micro.friend.entity.Friend;

public interface IFriendService {
	String      addFriendService(Friend friend);
	List<Long>  readFriendsContacts(Long phoneNumber);
	Integer     removeFriend(Long phoneNumber, Long friendNumber);

}
