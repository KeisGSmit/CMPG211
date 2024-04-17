import java.util.Arrays;
import java.util.Comparator;

public class HttpRequest implements Comparable<HttpRequest> { // Need this to compare
    String method;

    HttpRequest() throws InvalidMethodException {
        this("GET");
    }

    HttpRequest(String method) throws InvalidMethodException {
        if (method == "GET" || method == "PUT" || method == "POST" || method == "DELETE") {
            this.setMethod(method);
        } else {
            throw new InvalidMethodException();
        }
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getMethod() {
        return this.method;
    }

    public int compareTo(HttpRequest request) { // This needs to be added to use compare interface
        return this.method.compareTo(request.method); // comparing strings
    };

    @Override
    public String toString() {
        return this.getMethod();
    }

    public static void main(String[] args) throws InvalidMethodException {

        try {
            // HttpRequest delete = new HttpRequest("DELETE"); //This would have thrown a exception - fixed
            // HttpRequest get = new HttpRequest("GET");
            // HttpRequest put = new HttpRequest("PUT");
            // HttpRequest post = new HttpRequest("POST");

            // int myIntArray[] = { 0, 5, 6, 7, 9, 2 };

            HttpRequest httpRequests[] = { //Similar to how we create arrays in C++
                    new HttpRequest(),
                    new HttpRequest("GET"),
                    new HttpRequest("PUT"),
                    new HttpRequest("GET"),
                    new HttpRequest("PUT"),
                    new HttpRequest("DELETE"),
                    new HttpRequest("GET"),
                    new HttpRequest("DELETE"),
                    new HttpRequest("GET"),
            };

            Arrays.sort(httpRequests, Comparator.reverseOrder()); //Remeber this method - Arrays.sort(ARRAY) && Comparator object

            for (HttpRequest request : httpRequests) {
                System.out.println(request);
            }

        } catch (InvalidMethodException e) {
            System.out.println(e.getMessage());
        } finally {
            HttpRequest get = new HttpRequest("GET");
        }
    }
}