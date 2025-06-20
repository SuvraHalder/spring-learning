package org.Loose_Coupling_Challenge;

public class WebServiceProvider implements  UserDataProvider{

    @Override
    public String getDetails() {
        return "WebService Provided";
    }
}
