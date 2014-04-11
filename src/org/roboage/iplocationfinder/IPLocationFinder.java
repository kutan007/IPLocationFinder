package org.roboage.iplocationfinder;

import java.util.Scanner;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the IP Address: ");
		String ipAddress = read.nextLine();
		
		GeoIPService objGeoIPService = new GeoIPService();
		GeoIPServiceSoap objGeoIPServiceSoap = objGeoIPService.getGeoIPServiceSoap();
		GeoIP objGeoIP = objGeoIPServiceSoap.getGeoIP(ipAddress);
		System.out.println(objGeoIP.getCountryName());
	}

}
