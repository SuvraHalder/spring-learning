package org.Autowired_BY_Name;

public class CAR {

    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void  displayDeatails(){
        System.out.println("Car Details: " + specification);
    }

}
