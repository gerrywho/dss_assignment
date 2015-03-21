// This regular POJO will be used from Hibernate

package com.conygre.cd;

public class CompactDiscProduct {

  //Instance variables
  private String title;
  private double price;
  private String artist;
  private int tracks;
  private int id;

  //Methods
  public int getId(){
    return id;
  }

  public void setId(int s){
    id = s;
  }

  public void setTitle(String s){
    title = s;
  }

  public void setPrice(double d){
    price = d;
  }

  public void setArtist(String s){
    artist = s;
  }

  public void setTracks(int i){
    tracks = i;
  }

  public String getTitle(){
    return title;
  }

  public double getPrice(){
    return price;
  }

  public String getArtist(){
    return artist;
  }

  public int getTracks(){
    return tracks;
  }

  //constructors
  public CompactDiscProduct(){}

  public CompactDiscProduct(String t, double p,String a, int tr, int i){
    title=t;
    price=p;
    artist=a;
    tracks=tr;
    id = i;
  }
}