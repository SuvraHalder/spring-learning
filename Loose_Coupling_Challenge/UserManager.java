package org.Loose_Coupling_Challenge;

public class UserManager{

    private UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public void getUserDetails(){

        System.out.println(userDataProvider.getDetails());

    }


}
