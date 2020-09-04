package kz.stock;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("stock")
public class StockResource {

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Stock> getStock() {
        List<Stock> stocks = new ArrayList<>();
        stocks.add(new Stock("jfdksla;j", 0.11));
        stocks.add(new Stock("fjksdl", 0.22));
        return stocks;
    }

//    @GET
//    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
//    public String getStock(){
//        return "stocks";
//    }


}
