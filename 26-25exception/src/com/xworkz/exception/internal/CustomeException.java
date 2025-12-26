package com.xworkz.exception.internal;

import com.xworkz.exception.event.*;

public class CustomeException {

    public int Storage(int Storage) {
        if (Storage < 30) {
            try {
                throw new StorageException();

            } catch (StorageException storageException) {
                storageException.printStackTrace();
            }
        } else {
            System.out.println("prefect storage");
        }
        return Storage;
    }

    public int age(int age){
        if (age>100){
            try {
                throw new InvalidAgeException();
            }catch (InvalidAgeException invalidAgeException){
                invalidAgeException.printStackTrace();
            }
        }else {
            System.out.println("good age");
        }
        return age;
    }

    public String name(String name){
        if (name!="Raju"){
            try {
                throw new UserNotFoundException();

            }catch (UserNotFoundException userNotFoundException){
                userNotFoundException.printStackTrace();
            }
        }else {
            System.out.println("user is found");
        }
        return name;
    }
    public int id(int id){
        if (id>10){
            try {
                throw new InvalidIDException();
            }catch (InvalidIDException invalidIDException){
                invalidIDException.printStackTrace();
            }
        }else {
            System.out.println(" valid id");
        }
        return id;
    }
    public String location(String location){
        if (location!="Hiriyur"){
            try {
                throw new LocationNotFoundException();
            }catch (LocationNotFoundException locationNotFoundException){
                locationNotFoundException.printStackTrace();
            }
        }else {
            System.out.println("location is found");
        }
        return location;
    }
    public String file(String file){
        if (file!="Xworkz"){
            try {
                throw new FileNotFoundException();
            }catch (FileNotFoundException fileNotFoundException){
                fileNotFoundException.printStackTrace();
            }
        }else {
            System.out.println("file found");
        }
        return file;
    }
    public int port(int port){
        if (port<123){
            try {
                throw new InvalidPassportIDException();
            }catch (InvalidPassportIDException invalidPassportIDException){
                invalidPassportIDException.printStackTrace();
            }
        }else {
            System.out.println("port id valid");
        }
        return port;
    }
    public String facewash(String facewash){
       if (facewash!="himalaya"){
           try {
               throw new ProductNotFoundException();
           }catch (ProductNotFoundException productNotFoundException){
               productNotFoundException.printStackTrace();
           }
       }else {
           System.out.println("product is found");
       }
       return facewash;
    }
    public String portId(String portId){
        if (portId!="3306"){
            try {
                throw new SqlPortIDException();
            }catch (SqlPortIDException sqlPortIDException){
                sqlPortIDException.printStackTrace();
            }

        }else {
            System.out.println("id found");
        }
        return portId;
    }
    public int cost(int cost){
        if (cost<1000){
            try {
                throw new HighCostException();
            }catch (HighCostException highCostException){
                highCostException.printStackTrace();
            }
        }else {
            System.out.println("good cost");
        }
        return cost;
    }
}