package ie.dit.parse;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class parseFile {

	public static void parseFile(File file){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(file);
			NodeList namelist = doc.getElementsByTagName("dict");
			// NodeList list = namelist.getChildNodes();
			NodeList list = namelist.item(0).getChildNodes();
			Node track = null;
			Node playlist = null;
			NodeList tracks = null;
			NodeList playlists = null;
			NodeList playlistTracks = null;
			// System.out.println(list.item(4).getTextContent());
			for (int i = 0; i < list.getLength(); i++) {
				if (list.item(i).getTextContent()
						.equals("Library Persistent ID")) {
					System.out
							.println(list.item(i).getTextContent() + " found");
				}
				if (list.item(i).getTextContent().equals("Tracks")) {
					System.out
							.println(list.item(i).getTextContent() + " found");
					track = list.item(i + 2);
				}
				if (list.item(i).getTextContent().equals("Playlists")) {
					System.out.println(list.item(i).getTextContent()
							+ " found \n");
					playlist = list.item(i + 2);
				}

			}

			if (track != null) {
				tracks = track.getChildNodes();
				for (int i = 0; i < tracks.getLength(); i++) {

					if (tracks.item(i).getNodeName().equals("dict")) {

						NodeList tracklist = tracks.item(i).getChildNodes();
						for (int j = 0; j < tracklist.getLength(); j++) {
							if (tracklist.item(j).getTextContent()
									.equals("Track ID")) {
								System.out.println("ID: "
										+ (tracklist.item(j + 1)
												.getTextContent()));
							}
							if (tracklist.item(j).getTextContent()
									.equals("Name")) {
								System.out.println("Track Name: "
										+ (tracklist.item(j + 1)
												.getTextContent()));
							}
							if (tracklist.item(j).getTextContent()
									.equals("Artist")) {
								System.out.println("Artist: "
										+ (tracklist.item(j + 1)
												.getTextContent()));
							}
							if (tracklist.item(j).getTextContent()
									.equals("Album")) {
								System.out.println("Album: "
										+ (tracklist.item(j + 1)
												.getTextContent()));
							}
							if (tracklist.item(j).getTextContent()
									.equals("Kind")) {
								System.out.println("Format: "
										+ (tracklist.item(j + 1)
												.getTextContent()));
							}
							if (tracklist.item(j).getTextContent()
									.equals("Size")) {
								System.out.println("Track Size: "
										+ (tracklist.item(j + 1)
												.getTextContent()));
							}
							if (tracklist.item(j).getTextContent()
									.equals("Total Time")) {
								System.out.println("Track length: "
										+ (tracklist.item(j + 1)
												.getTextContent()));
							}
							if (tracklist.item(j).getTextContent()
									.equals("Persistent ID")) {
								System.out.println("Persistence ID: "
										+ (tracklist.item(j + 1)
												.getTextContent()) + "\n");
							}
						}
					}
				}

			}

			if (playlist != null) {
				playlists = playlist.getChildNodes();
				for (int i = 0; i < playlists.getLength(); i++) {

					NodeList PlaylistList = playlists.item(i).getChildNodes();
					for (int j = 0; j < PlaylistList.getLength(); j++) {

						if (PlaylistList.item(j).getTextContent()
								.equals("Name")) {
							System.out.println("Playlist Name: "
									+ (PlaylistList.item(j + 1)
											.getTextContent()));
						}
						if (PlaylistList.item(j).getTextContent()
								.equals("Playlist ID")) {
							System.out.println("Playlist ID: "
									+ (PlaylistList.item(j + 1)
											.getTextContent()));
						}
						if (PlaylistList.item(j).getTextContent()
								.equals("Playlist Persistent ID")) {
							System.out.println("Persistence ID: "
									+ (PlaylistList.item(j + 1)
											.getTextContent()) + "\n");
						}
						if (PlaylistList.item(j).getNodeName().equals("array")) {
							playlistTracks = PlaylistList.item(j)
									.getChildNodes();
							
								for (int z = 0; z < playlistTracks.getLength(); z++) {
									//System.out.println(allTracks.getLength());
									NodeList allTracks = playlistTracks.item(z).getChildNodes();
									
										for(int dict=0;dict<allTracks.getLength();dict++){
											if(allTracks.item(dict).getNodeName().equals("key")){
											System.out.println(allTracks.item(dict+1).getTextContent());
											}
										}
							
							}
						}
					}
				}
			}

			/*
			 * for(int i =2; i<namelist.getLength();i++){ NodeList list =
			 * namelist.item(i).getChildNodes(); for(int j=0;
			 * j<list.getLength();j++){ Node p = list.item(j);
			 * if(p.getNodeType()==Node.ELEMENT_NODE){ Element name =(Element)
			 * p; Element parent = (Element) p.getParentNode(); String node =
			 * name.getFirstChild().getNodeValue(); String k =
			 * parent.getNodeValue();
			 * //System.out.println(parent.getNodeValue());
			 * if(node.equals("Name")){
			 * //System.out.println(name.getNextSibling().getNodeValue()); Node
			 * m = list.item(j+1); Element name1 = (Element) m; Element parent1
			 * = (Element) m.getParentNode(); String node1 =
			 * name1.getFirstChild().getNodeValue(); System.out.println(node1);
			 * }
			 */

			// }

			// }

			// }
		} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SAXException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
	}
}
