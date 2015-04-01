package ie.dit.rest;

import javax.ws.rs.FormParam;

import org.jboss.resteasy.annotations.providers.multipart.PartType;

public class FileUpload {

	public FileUpload(){}
	
	private String fileName;
	private byte [] file;

	public String getFileName() {
		return fileName;
	}

	@FormParam("fileName")
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte [] getFile() {
		return file;
	}

	@FormParam("filepath")
	@PartType("application/octet-stream")
	public void setFile(byte [] file) {
		this.file = file;
	}
	

}
