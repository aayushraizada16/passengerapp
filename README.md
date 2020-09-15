# passengerapp

### Application requirements

This project is based on Java Spring Boot, for using this application any Java Spring enabled IDE can be used. Such as - Eclipse, VS Code or IntelliJ (IntelliJ is preferred here)
For testing the API endpoints Use Postman, by running application on localhost.


### API Endpoints

 `/drivers` (GET) - for getting the details of all drivers.
`/createdriver` (POST) - for creating the new drivers in the drivers table.

Sample Input  -
```
{
   "driverName": "Aayush",
   "latitude": "28.450465",
   "longitude": "77.512401"
 }
 ```
/drivers?latitude={Customer Latitude}&longitude={Customer Longitude} - for geting list of  nearest drivers which are in 200m radius.

> Note: 1) For Running all these API’s first run the application on mentioned IDE’S then use the postman app and use (http://localhost:8080/) as prefix then hit the >SEND button.
> 2) Use the correct exact coordinates or Google maps for getting the correct response.
 
Database 
There is no need to use any script to create a Database as I used here  Spring JPA and Apache derby. As, when we run our application in IDE, it will create driver table automatically

Sample Inputs
```
	
	[
   {
       "latitude": 28.441189,
       "longitude": 77.513961,
       "driverName": "Amit"
   },
   {
       "latitude": 28.450984,
       "longitude": 77.512283,
       "driverName": "Aayush"
   },
   {
      "latitude": 28.44579,
       "longitude": 77.513159,
       "driverName": "Ramesh"
   },
       {
       "id": ,
       "latitude": 28.450465,
       "longitude": 77.512401,
       "driverName": "Aditya"
   }
]
 
 ```
 
 

	

	
	







