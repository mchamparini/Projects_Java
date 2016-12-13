package com.film.producer.response;

public class CategoryResponse {
	private final int id;
	private final String name;
	private final String last_update;
	
	public CategoryResponse(final Builder builder){
		this.id = builder.id;
		this.name = builder.name;
		this.last_update = builder.last_update;
	}
	public static final class Builder{
		private int id;
		private String name;
		private String last_update;
		public CategoryResponse build(){
			return new CategoryResponse(this);
		}
		public Builder withId(int id){
			this.id = id;
			return this;
		}
		public Builder withName(String name){
			this.name = name;
			return this;
		}
		public Builder withLastUpdate(String last_update){
			this.last_update = last_update;
			return this;
		}
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLast_update() {
		return last_update;
	}
	
}
