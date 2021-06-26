package com.designpatterns.builder;

public class Phone {

	private String processor = "Default";
	private String RAM = "Default";
	private String camera = "Default";
	
	private Phone(Builder builder) {
		this.processor = builder.processor;
		this.RAM = builder.RAM;
		this.camera = builder.camera;
	}
	
	public String getProcessor() {
		return processor;
	}
	public String getRAM() {
		return RAM;
	}
	public String getCamera() {
		return camera;
	}
	
	public static class Builder{
		private String processor;
		private String RAM;
		private String camera;
		
		public Builder() {}
		
		public Phone build() {
			return new Phone(this);
		}
		
		public Builder processor(String processor) {
			this.processor = processor;
			return this;
		}
		public Builder ram(String RAM) {
			this.RAM = RAM;
			return this;
		}
		public Builder camera(String camera) {
			this.camera = camera;
			return this;
		}
	}

	@Override
	public String toString() {
		return "Phone [processor=" + processor + ", RAM=" + RAM + ", camera=" + camera + "]";
	}
	
	
	
}
