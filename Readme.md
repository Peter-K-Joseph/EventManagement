Endpoint for Venue

[venue-controller](http://127.0.0.1:8080/swagger-ui/index.html#/venue-controller)

**GET**[/api/v1/venues/{id}](http://127.0.0.1:8080/swagger-ui/index.html#/venue-controller/getVenueById)

```json
{
"venue_id": 1,
"name": "string",
"capacity": 2,
"location": "string",
"contact_name": "string",
"contact_email": "string",
"contact_phone": "string",
"type": "INDOOR"
}
```

**PUT**[/api/v1/venues/{id}](http://127.0.0.1:8080/swagger-ui/index.html#/venue-controller/updateVenue)

```json
{
"venue_id": 0,
"name": "string",
"capacity": 0,
"location": "string",
"contact_name": "string",
"contact_email": "string",
"contact_phone": "string",
"type": "INDOOR"
}
```

**DELETE**[/api/v1/venues/{id}](http://127.0.0.1:8080/swagger-ui/index.html#/venue-controller/deleteVenueById)

```json
{
"venue_id": 0,
"name": "string",
"capacity": 0,
"location": "string",
"contact_name": "string",
"contact_email": "string",
"contact_phone": "string",
"type": "INDOOR"
}
```

**GET**[/api/v1/venues](http://127.0.0.1:8080/swagger-ui/index.html#/venue-controller/getVenue)

```json
[
  {
"venue_id": 1,
"name": "string",
"capacity": 2,
"location": "string",
"contact_name": "string",
"contact_email": "string",
"contact_phone": "string",
"type": "INDOOR"
  }
]
```

**POST**[/api/v1/venues](http://127.0.0.1:8080/swagger-ui/index.html#/venue-controller/saveVenue)

```json
{
"venue_id": 1,
"name": "asdfasdfasdf",
"capacity": 2,
"location": "asdfasdfsdf",
"contact_name": "asdfasdf",
"contact_email": "strasdfasdfing",
"contact_phone": "1234567890",
"type": "INDOOR"
}
```
