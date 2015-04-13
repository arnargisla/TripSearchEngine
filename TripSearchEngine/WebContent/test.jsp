<%@page import="tripsearchengine.*"%>
<%@page import="HotelSearchEngine.HotelStay"%>
<%@page import="HotelSearchEngine.SearchQuery"%>
<%@page import="HotelSearchEngine.HotelManagement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test here</title>
</head>
<body>
<%! //MockFlightTrip ft; %>
<% 
	String departure = request.getParameter("departure");
	String destination = request.getParameter("destination");
	HotelStay myHotelStay = new HotelStay();
	myHotelStay.setLocation("YoloTown");
	
	SearchQuery sq = new SearchQuery("Reykjavík", 10);
	String loc = sq.getHotelLocation();
	
	HotelManagement hm = new HotelManagement();
	//HotelStay[] hotelStayArray = hm.search(sq);
	
	//MockFlightTrip ft;
	//FlightTripI ft = new MockFlightTrip(); 
%>
<br>

<br>

Where am I?: <%=myHotelStay %>
<br>
<br>
sq.getHotelLocation() <%=loc %>
</body>
</html>