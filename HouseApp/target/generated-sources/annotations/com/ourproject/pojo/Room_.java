package com.ourproject.pojo;

import com.ourproject.pojo.Hostel;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-09-06T09:54:23")
@StaticMetamodel(Room.class)
public class Room_ { 

    public static volatile SingularAttribute<Room, Boolean> approved;
    public static volatile SingularAttribute<Room, String> img;
    public static volatile SingularAttribute<Room, Float> price;
    public static volatile SingularAttribute<Room, Hostel> hostelID;
    public static volatile SingularAttribute<Room, String> name;
    public static volatile SingularAttribute<Room, String> description;
    public static volatile SingularAttribute<Room, Integer> roomID;

}