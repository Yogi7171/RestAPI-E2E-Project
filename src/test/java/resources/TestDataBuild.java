package resources;

import java.util.ArrayList;
import java.util.List;

import pojos.Location;
import pojos.addPlace;

public class TestDataBuild {

	public addPlace addPlacePayLoad(String name,String language,String address) {
		addPlace p=new addPlace();
		p.setAccuracy(50);
		p.setAddress(address);
		p.setLanguage(language);
		p.setPhone_number("(613) 539 4444");
		p.setWebsite("https://jsoneditoronline.org/#left=local.fipupa&right=local.gejenu");
		p.setName(name);
		List<String> mylist=new ArrayList<String>();
		mylist.add("shoe park");
		mylist.add("shop");
		p.setTypes(mylist);
		
		Location l=new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		p.setLocation(l);
		return p;
	}
	public String deletePlacePayload(String placeID) {
		return"{\r\n \"place_id\": \""+placeID+"\"\r\n}";
	}
}
