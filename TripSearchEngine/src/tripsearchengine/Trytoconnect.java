package tripsearchengine;

import java.util.Date;

import HotelSearchEngine.*;

public class Trytoconnect {
	
	public static void main(String[] args){
		HotelManagement hm = new HotelManagement();	
		System.out.println(hm);
		
		
		
		SearchQuery sq = new SearchQuery("Reykjavík", 1, new Date(), new Date());
		System.out.println(sq);
		
		HotelStay[] hsarr = hm.search(sq);
		System.out.println(hsarr.length);
		for(int i=0; i<hsarr.length; i++){
			System.out.println(hsarr[i].getHotelName());
		}
	}
}
