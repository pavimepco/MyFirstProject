package com.chainsys.nestedclass;

public class TestUserReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Users users=new Users();
		users.id=100;
		users.name="Pavi";
		Reviews reviews=new Reviews();
		reviews.id=1000;
		reviews.description="Good product";
		reviews.users=users;
		System.out.println(users.id+"\n"+users.name+"\n"+reviews.id+"\n"+reviews.description);
	}

}
