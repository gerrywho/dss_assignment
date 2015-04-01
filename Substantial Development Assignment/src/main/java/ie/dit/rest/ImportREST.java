package ie.dit.rest;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;
import org.w3c.dom.Document;

@Path("/import")
public class ImportREST {
	Document dom;
	DocumentBuilder documentBuilder;
	@POST
	@Path("/parse")
	@Consumes("multipart/form-data")
	
	public String UploadFile(@MultipartForm FileUpload form) {
		String resultString = "";
		try{
			File tempFileForParsing = File.createTempFile("xmlFile", ".xml");
			ByteArrayInputStream byteStreamFromUpload = new ByteArrayInputStream(form.getFile());
			FileOutputStream fileOutputStreamFromByteStream = new FileOutputStream(tempFileForParsing);
			OutputStreamWriter encodedOutputStream = new OutputStreamWriter(fileOutputStreamFromByteStream, "UTF-8");
			Writer writerToCreatedFile = new BufferedWriter(encodedOutputStream);
			while (true){
				int byteStreamValue = byteStreamFromUpload.read();
				
				if(byteStreamValue != -1){
					writerToCreatedFile.write(byteStreamValue);
				}else{
					writerToCreatedFile.close();
					break;
				}
			}
			
			System.out.println("Temp file name:" +tempFileForParsing.getName());
			String path = tempFileForParsing.getCanonicalPath(); 
			
			
			//creates dom
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			documentBuilder = dbf.newDocumentBuilder();
			dom = documentBuilder.parse(path);
			//passing the dom to the dom parser
			resultString = "Successful!!! :D";

		}catch(Exception e){
			resultString = "Failed! :'(";
			e.printStackTrace();
		}
		return resultString;
	}

	

}
