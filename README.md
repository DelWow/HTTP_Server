# HTTP Server
This is a basic HTTP server implementation in Java that listens for incoming connections on port 8080. Upon receiving a request, it outputs the current date and time as an HTTP response.

## Features
- Listens for client connections on port 8080.
- Handles HTTP GET requests.
- Responds with the current date and time.
- Prints the incoming request details to the console

## Getting Started
### Prerequisites
- Java Development Kit (JDK) installed on your machine.

### Running The Server
1. Clone the repository
``` bash
git clone https://github.com/yourusername/simple-http-server.git
cd simple-http-server
```
2. Complie the Java file
``` bash
javac Main.java
```

3. Run the server
``` bash
java Main
```

4. Opem a web browser to access the server
``` arduino
http://localhost:8080
```

### Output
When accessed, the server will print the HTTP request details to the console and respond with the current date and time:
``` yaml
Connection on port 8080 ...
GET / HTTP/1.1
Host: localhost:8080
Connection: keep-alive
sec-ch-ua: "Chromium";v="128", "Not;A=Brand";v="24", "Google Chrome";v="128"
sec-ch-ua-mobile: ?0
sec-ch-ua-platform: "macOS"
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36
Sec-Purpose: prefetch;prerender
Purpose: prefetch
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7
Sec-Fetch-Site: none
Sec-Fetch-Mode: navigate
Sec-Fetch-User: ?1
Sec-Fetch-Dest: document
Accept-Encoding: gzip, deflate, br, zstd
Accept-Language: en-US,en;q=0.9
```

### Code Structure
- ``` java
  Main.java
  ```
  The main file containing the server implementation.

