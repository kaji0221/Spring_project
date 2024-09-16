package com.example.demo.animalsAPI.data;

public class AnimalData {
	private int id;
	private String name;
	private String japaneseName;
	private String cry;
	
	public AnimalData() {
    }

	public AnimalData(int id, String name, String japaneseName, String cry) {
		this.id = id;
		this.name = name;
		this.japaneseName = japaneseName;
		this.cry = cry;
	}
	
	public int getId() {return id;}
	public String getName() {return name;}
	public String getJapaneseName() {return japaneseName;}
	public String getCry() {return cry;}
}