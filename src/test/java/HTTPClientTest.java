import com.keyin.dto.Airport;
import com.keyin.HTTPClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.ArgumentMatchers.any;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class HTTPClientTest {
    @Mock
    private java.net.http.HttpClient mockHttpClient;

    @Mock
    private HttpResponse<String> mockResponse;
// Testing the most troublesome data links in the whole project
    @Test
    public void testListAirportsInCity() throws Exception {
        // Setup
        HTTPClient httpClientUnderTest = new HTTPClient(mockHttpClient);
        int cityId = 1;
        String expectedResponse = "[{\"id\":1,\"name\":\"St. John's Airport\",\"code\":\"YYT\"}]";

        // Mock setup
        Mockito.when(mockResponse.statusCode()).thenReturn(200);
        Mockito.when(mockResponse.body()).thenReturn(expectedResponse);
        Mockito.when(mockHttpClient.send(Mockito.any(HttpRequest.class), Mockito.<HttpResponse.BodyHandler<String>>any()))
                .thenReturn(mockResponse);

        // Execute
        httpClientUnderTest.listAirportsInCity(cityId);

        // Verify
        Mockito.verify(mockHttpClient).send(Mockito.any(HttpRequest.class), Mockito.<HttpResponse.BodyHandler<String>>any());
    }
// If this test pass, all other data links should work.
    @Test
    public void testListAirportsForAircraft_Success() throws Exception {
        // Setup
        HTTPClient httpClientUnderTest = new HTTPClient(mockHttpClient);
        int aircraftId = 123;
        String expectedResponse = "[{\"id\":1,\"name\":\"Airport A\",\"code\":\"AAA\"}]";

        // Mock setup
        Mockito.when(mockResponse.statusCode()).thenReturn(200);
        Mockito.when(mockResponse.body()).thenReturn(expectedResponse);
        Mockito.when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class)))
                .thenReturn(mockResponse);

        // Execute
        httpClientUnderTest.listAirportsForAircraft(String.valueOf(aircraftId));

        // Verify
        Mockito.verify(mockHttpClient).send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class));
    }

    @Test
    public void testListAirportsForAircraft_Failure_NoAirports() throws Exception {
        // Setup
        HTTPClient httpClientUnderTest = new HTTPClient(mockHttpClient);
        int aircraftId = 456;
        String expectedResponse = "[]"; // Empty list response

        // Mock setup
        Mockito.when(mockResponse.statusCode()).thenReturn(200); // Assuming API returns 200 even when list is empty
        Mockito.when(mockResponse.body()).thenReturn(expectedResponse);
        Mockito.when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class)))
                .thenReturn(mockResponse);

        // Execute
        httpClientUnderTest.listAirportsForAircraft(String.valueOf(aircraftId));

        // Verify
        Mockito.verify(mockHttpClient).send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class));
        // Additional assertions can be made here to check for the empty response handling
    }

}
