package com.muhammedessa.listview;

public class Provinces {

    private String id;
    private String name;

    public Provinces(String id, String name) {
        this.id = id;
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //to display object as a string in spinner
    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Provinces){
            Provinces c = (Provinces)obj;
            if(c.getName().equals(name) && c.getId()==id ) return true;
        }

        return false;
    }

}